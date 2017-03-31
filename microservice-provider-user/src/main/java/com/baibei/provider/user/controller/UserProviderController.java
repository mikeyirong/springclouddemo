package com.baibei.provider.user.controller;

import com.baibei.common.core.api.ApiResult;
import com.baibei.common.core.api.ApiResultGenerator;
import com.baibei.provider.user.entity.User;
import com.baibei.provider.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 会跳舞的机器人
 * @email:2268549298@qq.com
 * @date: 17/2/17 上午10:01
 * @description:用户相关rest API
 */
@RestController
@RequestMapping("/user")
public class UserProviderController {
    @Autowired
    private IUserService userService;

    /**
     * 查找用户
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/{id}")
    public ApiResult findById(@PathVariable Integer id) {
        User user = userService.getUser(id);

        return ApiResultGenerator.success(user);
    }
}
