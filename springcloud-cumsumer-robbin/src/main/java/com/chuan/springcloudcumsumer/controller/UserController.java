package com.chuan.springcloudcumsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @类名: UserController
 * @包名: com.chuan.springcloudcumsumer.controller
 * @描述: (用一句话描述该文件做什么)
 * @日期: 2018/6/6 8:55
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping("/{id}")
    @ResponseBody
    public Object getUser(){
        Object result = restTemplate.getForObject("http://localhost:8080/user/1", Object.class);
        return result;
    }

    @RequestMapping("/server")
    @ResponseBody
    public List<ServiceInstance> getServer(){
        List<ServiceInstance> instances = discoveryClient.getInstances("springcloud-eureka-server-cloud");
        instances.forEach(instance->{
            System.out.println(instance.getUri()+" id:"+instance.getServiceId());
        });
        return instances;
    }

    @RequestMapping(value = "/balance",produces = { "application/json;charset=UTF-8" })
    @ResponseBody
    public ServiceInstance getBalanceServer(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("springcloud-eureka-server-cloud");
        return serviceInstance;
    }
}
