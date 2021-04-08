package com.yc.bean;

import com.yc.springframework.stereotype.MyComponent;
import com.yc.springframework.stereotype.MyPostConstruct;
import com.yc.springframework.stereotype.MyPreDestroy;

/**
 * @program: testspring
 * @description:
 * @author: 刘志成
 * @create: 2021-04-05 11:51
 */
@MyComponent
public class HelloWorld {
    @MyPostConstruct
    public void setup(){
        System.out.println("MyPostConstruct");
    }
    @MyPreDestroy
    public void destroy(){
        System.out.println("MyPreDestray");
    }
    public HelloWorld(){
        System.out.println("hello world 构造");
    }
    public void show(){
        System.out.println("show");
    }
}
