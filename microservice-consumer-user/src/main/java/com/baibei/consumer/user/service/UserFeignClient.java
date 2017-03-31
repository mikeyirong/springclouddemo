package com.baibei.consumer.user.service;

import com.baibei.common.core.api.ApiResult;
import com.baibei.consumer.user.service.hystrix.UserFeignClientHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author: 会跳舞的机器人
 * @date: 2017/3/29 16:54
 * @description: 用户服务调用端
 */
@FeignClient(name = "microservice-provider-user", fallback = UserFeignClientHystrix.class)
public interface UserFeignClient {

    /**
     * 根据ID查找用户
     *
     * @param
     * @return
     */
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    ApiResult findUserById(@PathVariable("id") Integer id);


}