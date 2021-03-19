package com.example.dubbobootdemoprovider.service.impl;

import com.example.dubbobootdemoprovider.service.TestService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Author: Lins
 */
@Service(version = "1.0.0",interfaceClass = TestService.class)
public class TestServiceImpl implements TestService {
    @Override
    public void ins() {
        System.out.println("insert");
    }
}
