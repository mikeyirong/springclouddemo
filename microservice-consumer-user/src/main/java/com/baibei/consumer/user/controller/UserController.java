package com.baibei.consumer.user.controller;

import com.baibei.common.core.api.ApiResult;
import com.baibei.consumer.user.service.UserFeignClient;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 会跳舞的机器人
 * @date: 17/2/17 上午11:51
 * @description:
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserFeignClient userFeignClient;


    /**
     * 根据ID查找用户信息
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public ApiResult getUser(@PathVariable Integer id) {

        return userFeignClient.findUserById(id);
    }
}
