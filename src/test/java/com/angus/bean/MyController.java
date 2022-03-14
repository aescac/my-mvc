package com.angus.bean;

import com.angus.core.annotation.Controller;
import com.angus.ioc.annotation.Autowired;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MyController {
    @Autowired
    private DoodleService doodleService;

    public void hello() {
        log.info(doodleService.helloWorld());
    }

    public void test() {
        log.info(doodleService.test());
    }

    public void helloForAspect() {
        log.info("Hello Aspectj");
    }
}
