package com.yc;

import com.yc.bean.HelloWorld;
import com.yc.biz.StudentBizImpl;
import com.yc.springframework.context.MyAnnotationConfigApplicationContext;
import com.yc.springframework.context.MyApplicationContext;

/**
 * @program: testspring
 * @description:
 * @author: 刘志成
 * @create: 2021-04-05 11:47
 */
public class Test {
    public static void main(String[] args) {
        MyApplicationContext ac=new MyAnnotationConfigApplicationContext(MyAppConfig.class);
        //StudentBizImpl hw=(StudentBizImpl)ac.getBean("studentBizImpl");
        //hw.add("abc");
    }
}

