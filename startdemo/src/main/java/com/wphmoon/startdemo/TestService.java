package com.wphmoon.startdemo;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.skyblue.mystarter.MyStarterService;

@Service
public class TestService {

    @Resource
    private MyStarterService myStarterService;

    public void message() {
        System.out.println("code:" + myStarterService.getCode());
        System.out.println("message:" + myStarterService.getMessage());
    }
}