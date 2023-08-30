/*
 * Copyright 2020 장동선.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
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
