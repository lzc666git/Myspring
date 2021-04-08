package com.yc.dao;

import com.yc.springframework.stereotype.MyRepository;

import java.util.Random;

/**
 * @program: testspring
 * @description:
 * @author: 刘志成
 * @create: 2021-04-04 14:50
 */
@MyRepository //异常转化 可以从exception转换成runtimeexception
public class StudentDaoMybatisImpl implements StudentDao{

    @Override
    public int add(String name) {
        System.out.println("mybatis 添加学生:"+name);
        Random r=new Random();
        return r.nextInt();
    }

    @Override
    public void update(String name) {
        System.out.println("mybatis更新学生：" +name);
    }
}
