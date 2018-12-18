package com.lmt.mbsp.trade.controller;

import com.lmt.mbsp.trade.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("test")
@ResponseBody
@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("test")
    @ResponseBody
    public String test(){
        Long id = testService.testSearch();
        return "success";
    }




}
