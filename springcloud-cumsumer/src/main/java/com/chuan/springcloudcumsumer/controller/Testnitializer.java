package com.chuan.springcloudcumsumer.controller;

import com.chuan.springcloudcumsumer.SpringcloudCumsumerApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @类名:
 * @包名: com.chuan.springcloudcumsumer.controller
 * @描述: (用一句话描述该文件做什么)
 * @日期: 2018/7/18 15:17
 */
public class Testnitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringcloudCumsumerApplication.class);
    }
}
