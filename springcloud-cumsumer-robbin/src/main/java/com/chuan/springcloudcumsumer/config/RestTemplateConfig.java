package com.chuan.springcloudcumsumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @类名: RestTemplateConfig
 * @包名: com.chuan.springcloudcumsumer.config
 * @描述: (用一句话描述该文件做什么)
 * @日期: 2018/6/6 9:12
 */
@Configuration
public class RestTemplateConfig {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
