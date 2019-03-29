package com.bing.lan.starter.start;

import com.bing.lan.starter.StarterApplication;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * https://blog.csdn.net/songhaifengshuaige/article/details/54138023
 * <p>
 * 打war最好将内嵌的tomcat依赖去除, 不然可能造成版本冲突, 当然idea启动是没问题的
 *
 * @author lan_bing
 * @date 2019-01-04 13:16
 */
public class TomcatStarter extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(StarterApplication.class);
    }
}
