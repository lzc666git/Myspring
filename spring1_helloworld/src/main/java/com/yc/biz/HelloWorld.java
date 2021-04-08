package com.yc.biz;

import org.springframework.stereotype.Component;

/**
 * @program: testspring
 * @description:
 * @author: 刘志成
 * @create: 2021-04-04 15:25
 */
@Component  //只要加了这个注解 则这个类可以被spring 容器托管
public class HelloWorld {
    public HelloWorld(){
        System.out.println("无参构造方法");
    }
    public void hello(){
        System.out.println("hello world");
    }

}
