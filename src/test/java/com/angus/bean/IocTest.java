package com.angus.bean;

import com.angus.aop.Aop;
import com.angus.core.BeanContainer;
import com.angus.ioc.Ioc;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class IocTest {
    @Test
    public void doIoc() {
        BeanContainer beanContainer = BeanContainer.getInstance();
        beanContainer.loadBeans("com.angus");
        new Aop().doAop();
        new Ioc().doIoc();
        MyController controller = (MyController) beanContainer.getBean(MyController.class);
        controller.hello();
        controller.test();
    }
}