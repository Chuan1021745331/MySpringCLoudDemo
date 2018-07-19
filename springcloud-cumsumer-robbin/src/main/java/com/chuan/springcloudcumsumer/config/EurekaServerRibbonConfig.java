package com.chuan.springcloudcumsumer.config;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * @类名: EurekaServerRibbonConfig
 * @包名: com.chuan.springcloudcumsumer.config
 * @描述: (用一句话描述该文件做什么)
 * @日期: 2018/6/7 14:26
 */
@Configuration
@RibbonClient(name = "springcloud-eureka-server-clud",configuration = RibbonConfigration.class)
public class EurekaServerRibbonConfig {
}
