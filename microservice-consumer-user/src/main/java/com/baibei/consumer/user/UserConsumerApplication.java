package com.baibei.consumer.user;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author: 会跳舞的机器人
 * @email:2268549298@qq.com
 * @date: 17/2/17 上午11:45
 * @description:用户服务消费者
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class UserConsumerApplication {
    private static final Logger LOGGER = Logger.getLogger(UserConsumerApplication.class);

    public static void main(String[] args) {
        LOGGER.info("start execute UserConsumerApplication...\n");
        SpringApplication.run(UserConsumerApplication.class, args);
        LOGGER.info("end execute UserConsumerApplication...\n");

    }
}
