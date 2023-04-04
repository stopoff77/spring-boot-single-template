package com.example.cmmnlib.biz.demo.dto;

import java.util.List;

import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class TestDto {

    @NotEmpty(message = "{error.msg.not.empty1}")
    private String id;

    @NotEmpty(message = "{error.msg.not.empty2}")
    private String password;

    @NotEmpty(message = "{error.msg.not.empty1}")
    private int tmpInt;

    private List<SubDto> subList;
    private SubDto[] subList2;

    private SubDto subDto;

    private List<String> strList;
    private String[] strList2;
}
