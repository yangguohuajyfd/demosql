package com.sql.demosql.Impl;

import com.sql.demosql.Interface.TestInterface;
import com.sql.demosql.common.TestConst;
import org.springframework.stereotype.Component;

@Component(TestConst.two)
public class TestB implements TestInterface {

    @Override
    public String say(String name) {
        return "我是 two";
    }
}
