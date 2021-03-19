package com.dubbo.service.impl;

import com.dubbo.service.DemoService;

public class DemoServiceImpl implements DemoService {


    /**
     *
     * @param name
     * @return
     */
    @Override
    public String sayHello(String name) {
        return "hello lin " + name;
    }
}
