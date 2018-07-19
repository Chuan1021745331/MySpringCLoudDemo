package com.chuan.springcloudcumsumer.client;

import com.chuan.springcloudcumsumer.domain.UserDO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="provider-user")
public interface UserClient {
    @RequestMapping("user/{id}")
    UserDO findById(@PathVariable("id") Long id);
}
