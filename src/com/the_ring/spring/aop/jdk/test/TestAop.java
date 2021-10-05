package com.the_ring.spring.aop.jdk.test;

import com.the_ring.spring.aop.jdk.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

    @Test
    public void testAopAnno() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean_jdk.xml");
        User user = context.getBean("user", User.class);
        user.add();

    }
}
