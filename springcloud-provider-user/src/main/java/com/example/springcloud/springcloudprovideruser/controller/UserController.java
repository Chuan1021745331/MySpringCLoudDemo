package com.example.springcloud.springcloudprovideruser.controller;

import com.example.springcloud.springcloudprovideruser.dao.UserRepository;
import com.example.springcloud.springcloudprovideruser.domain.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

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
    private UserRepository userRepository;

    @GetMapping(value = "/{id}", produces = { "application/json;charset=UTF-8" })
    @ResponseBody
    public Object getUser(@PathVariable  Long id, HttpServletRequest request){
        StringBuffer requestURL = request.getRequestURL();
        UserDO userDO = userRepository.findOne(id);
        userDO.setName(requestURL.toString());
        return userDO;
    }
}
