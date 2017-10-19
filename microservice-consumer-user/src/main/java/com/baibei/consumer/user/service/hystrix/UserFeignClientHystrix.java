package com.baibei.consumer.user.service.hystrix;

import com.baibei.common.core.api.ApiResult;
import com.baibei.common.core.api.ApiResultGenerator;
import com.baibei.consumer.user.service.UserFeignClient;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: 会跳舞的机器人
 * @date: 2017/3/29 16:55
 * @description: 用户服务的fallback
 */
@Component
public class UserFeignClientHystrix implements UserFeignClient {
    private Logger logger = Logger.getLogger(UserFeignClientHystrix.class);

    @Override
    public ApiResult findUserById(@RequestParam("id") Integer id) {
        logger.info("请求异常，进入fallback方法，接收的参数：id=" + id);

        return ApiResultGenerator.serviceError(null);
    }
}