package com.baibei.server.eureka;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: 会跳舞的机器人
 * @date: 17/2/17 上午9:51
 * @description: 服务注册与发现
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    private static final Logger LOGGER = Logger.getLogger(EurekaServerApplication.class);

    public static void main(String[] args) {
        LOGGER.info("start execute EurekaServerApplication...\n");
        SpringApplication.run(EurekaServerApplication.class, args);
        LOGGER.info("end execute EurekaServerApplication...\n");

    }
}
