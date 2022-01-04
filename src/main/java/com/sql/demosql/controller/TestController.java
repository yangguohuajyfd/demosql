package com.sql.demosql.controller;

import com.sql.demosql.Interface.TestInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class TestController {

    @Autowired
    Map<String , TestInterface> testInterfaceMap;

    @RequestMapping("hello")
    @ResponseBody
    public String say(){
        TestInterface testInterface = testInterfaceMap.get("1");
        String asd = testInterface.say("asd");
        return "哎呦不错哦";
    }

}
