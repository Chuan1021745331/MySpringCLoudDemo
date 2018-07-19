package com.chuan.springcloudcumsumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @类名: RibbonConfigration
 * @包名: com.chuan.springcloudcumsumer.config
 * @描述: (用一句话描述该文件做什么)
 * @日期: 2018/6/7 14:24
 */
@Configuration
public class RibbonConfigration {

    @Bean
    public IRule randomRule(){
        return new RandomRule();
    }
}
