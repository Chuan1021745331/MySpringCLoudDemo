package com.chuan.springcloudcumsumer.controller;

import com.chuan.springcloudcumsumer.client.UserClient;
import com.chuan.springcloudcumsumer.domain.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
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
    private UserClient userClient;

    @RequestMapping("/{id}")
    @ResponseBody
    public Object getUser(@PathVariable("id") Long id){
       /* Object result = restTemplate.getForObject("http://localhost:8080/user/1", Object.class);
        return result;*/
        UserDO user = userClient.findById(id);
        return user;
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

}
