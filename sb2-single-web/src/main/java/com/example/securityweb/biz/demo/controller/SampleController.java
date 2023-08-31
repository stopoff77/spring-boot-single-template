package com.example.securityweb.biz.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.cmmnlib.dto.MapDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class SampleController {

    @Autowired
    private Environment env;

    @Value("${instance:not_setting}")
    private String instanceName;



    /**
     *
     */
    public SampleController() {

    }


    @RequestMapping({"/", "/home"})
    @ResponseBody
    public MapDto home(HttpServletRequest request, HttpSession session) {
        log.debug("home run! {}", env);

        MapDto dto= new MapDto();
        dto.put("A", "A");
        dto.put("B", "B");

        return dto;
    }
}
