package com.angus.bean;

import com.angus.core.annotation.Service;

@Service
public class DoodleServiceImpl implements DoodleService{
    @Override
    public String test() {
        return "test";
    }

    @Override
    public String helloWorld() {
        return "hello world";
    }
}