package com.yc.biz;

import com.yc.AppConfig;
import javafx.application.Application;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: testspring
 * @description:
 * @author: 刘志成
 * @create: 2021-04-04 15:30
 */
public class HelloWorldTest  extends TestCase {// 测试用例
    private ApplicationContext ac;//spring 容器

    @Override
    @Before
    protected void setUp() throws Exception {
       ac=new AnnotationConfigApplicationContext(AppConfig.class);
    }

    @Test
    public void testHello(){
        HelloWorld hw=(HelloWorld)ac.getBean("helloWorld");
        hw.hello();
        HelloWorld hw2=(HelloWorld)ac.getBean("helloWorld");
        hw2.hello();
    }
}
