package com.yc.dao;

import com.yc.AppConfig;
import junit.framework.TestCase;
import com.yc.biz.StudentBizImpl;
import com.yc.dao.StudentDao;
import com.yc.dao.StudentDaoImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: testspring
 * @description:
 * @author: 刘志成
 * @create: 2021-04-04 14:58
 */
public class StudentDaoTest extends TestCase {
    StudentDao studentDao;
    private StudentBizImpl studentBizImpl;
    private ApplicationContext ac;//spring 容器
    @Override
    @Before
    protected void setUp() throws Exception {
        ac=new AnnotationConfigApplicationContext(AppConfig.class);
    }

    @Test
    public void testHello(){
        StudentBizImpl hw=(StudentBizImpl)ac.getBean("studentBizImpl");
        hw.add("张三");
        StudentBizImpl hw2=(StudentBizImpl)ac.getBean("studentBizImpl");
        hw2.update("张三");
    }

    public void testAdd (){
        studentDao.add("张三");

    }
    public void testUpdate(){
        studentDao.update("张三");

    }
    public void testBizAdd(){
        studentBizImpl.add("张三");
    }
}
