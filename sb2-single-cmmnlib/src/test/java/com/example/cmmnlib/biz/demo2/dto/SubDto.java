package com.example.cmmnlib.biz.demo2.dto;

import org.apache.ibatis.type.Alias;

@Alias("subDtoFromSuperDto")
public class SubDto extends SuperDto {

    @Override
    public void setParam1(String param1) {
        super.setParam1("a");
    }

    @Override
    public void setParam2(String param2) {
        super.setParam2("b");
    }
}
