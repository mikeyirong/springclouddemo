package com.baibei.provider.user;

import org.apache.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: 会跳舞的机器人
 * @email:2268549298@qq.com
 * @date: 17/2/17 上午9:55
 * @description:用户服务提供者
 */
@SpringBootApplication
@MapperScan("com.baibei.provider.user.dao")
@EnableDiscoveryClient
public class UserProviderApplication {
    private static final Logger LOGGER = Logger.getLogger(UserProviderApplication.class);

    public static void main(String[] args) {
        LOGGER.info("start execute UserProviderApplication...\n");
        SpringApplication.run(UserProviderApplication.class, args);
        LOGGER.info("end execute UserProviderApplication...\n");

    }
}
