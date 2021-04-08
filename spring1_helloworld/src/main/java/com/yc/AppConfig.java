package com.yc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: testspring
 * @description:
 * @author: 刘志成
 * @create: 2021-04-04 15:29
 */
@Configuration  //表示当前的类是一个配置类
@ComponentScan(basePackages = "com.yc")//将来要托管的bean 要扫描的包及子包
public class AppConfig {

}
