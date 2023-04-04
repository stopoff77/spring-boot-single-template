package com.example.cmmnlib.biz.demo2;


import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;

import com.example.cmmnlib.biz.demo2.dto.SubDto;
import com.example.cmmnlib.biz.demo2.dto.SuperDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DtoTest {

    @Test
    public void whatDto() throws Exception {
        //
        log.debug("{}", "what");

        SuperDto dto1 = new SuperDto();
        propertyDescriptor(dto1);
        log.debug("dto {}", dto1);

        SubDto dto2 = new SubDto();
        propertyDescriptor(dto2);
        log.debug("dto {}", dto2);


        dto1 = new SuperDto();
        classTest(dto1.getClass(), dto1);
        log.debug("dto {}", dto1);

        dto2 = new SubDto();
        classTest(dto2.getClass(), dto2);
        log.debug("dto {}", dto2);
    }


    private void classTest(Class<?> claz, Object object) throws Exception {
        Class<?> superClaz = claz.getSuperclass();
        if(superClaz != null) {
            classTest(superClaz, object);
        }

        Method[] methods = claz.getMethods();
        for(Method method : methods) {
            //
            String key = method.getName();
            if(key.startsWith("set")) {
                method.invoke(object, "reflect");
            }
        }
    }


    //
    private void propertyDescriptor(Object object) throws Exception {
        if(object == null) {
            log.warn("object must not null");
            return;
        }

        PropertyDescriptor[] pds = BeanUtils.getPropertyDescriptors(object.getClass());

        for(PropertyDescriptor pd : pds) {
//            String key = pd.getName();
//            Class<?> keyType = pd.getPropertyType();
//
//            log.debug("key {}[{}]", key, keyType);

            Method setMethod = pd.getWriteMethod();
            if(setMethod != null) {
                setMethod.invoke(object, "reflect..");
            }
        }
    }
}
