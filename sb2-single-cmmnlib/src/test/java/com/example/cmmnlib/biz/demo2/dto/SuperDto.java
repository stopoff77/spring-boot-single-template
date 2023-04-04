package com.example.cmmnlib.biz.demo2.dto;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SuperDto {

    private String param1;
    private String param2;


    public void setParam1(String param1) {
        this.param1 = param1;
    }

    public void setParam2(String param2) {
        this.param2 = param2;
    }


    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
    }
}
