package com.example.dubbobootdemo.controller;


import com.example.dubbobootdemoprovider.service.TestService;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Lins
 */
@RestController
public class TestController {

   @Reference(version = "1.0.0")
   TestService testService;

   @RequestMapping(value = "/ins",method = RequestMethod.GET)
   public void ins(){
      testService.ins();
   }

}
