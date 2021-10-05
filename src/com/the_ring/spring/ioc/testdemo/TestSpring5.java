package com.the_ring.spring.ioc.testdemo;

import com.the_ring.spring.ioc.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {

    @Test
    public void testAdd() {
        // 1. 加载 spring 配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        // 2. 获取配置创建的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();
    }

    @Test
    public void test2() {
        // 1. 加载 spring 配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        // 2. 获取配置创建的对象
        User user = context.getBean("user", User.class);
        user.toString();
        System.out.println(user);
        user.add();
    }


}
