package com.yc.dao;

import org.springframework.stereotype.Repository;

import java.util.Random;

/**
 * @program: testspring
 * @description:
 * @author: 刘志成
 * @create: 2021-04-04 17:10
 */
@Repository
public class StudentDaoJpaImpl implements StudentDao{
    @Override
    public int add(String name) {
        System.out.println("jpa 添加学生:"+name);
        Random r=new Random();
        return r.nextInt();
    }

    @Override
    public void update(String name) {
        System.out.println("jpa更新学生：" +name);
    }
}
