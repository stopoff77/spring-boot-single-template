package com.example.cmmnlib.biz.demo.dto;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class OtherDto {

    @JsonProperty("otherId")
    @NotEmpty(message = "{error.msg.not.empty1}")
    private String id;

    @JsonProperty("otherPwd")
    @NotEmpty(message = "{error.msg.not.empty2}")
    private String password;

    @JsonProperty("otherTmmpInt")
    @NotEmpty(message = "{error.msg.not.empty1}")
    private int tmpInt;
}
