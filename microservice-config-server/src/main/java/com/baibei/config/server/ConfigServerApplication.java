package com.baibei.config.server;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author: 会跳舞的机器人
 * @date: 17/2/19 下午2:35
 * @description: 分布式配置中心启动主类
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
    private static final Logger LOGGER = Logger.getLogger(ConfigServerApplication.class);

    public static void main(String[] args) {
        LOGGER.info("start execute ConfigServerApplication...\n");
        SpringApplication.run(ConfigServerApplication.class, args);
        LOGGER.info("end execute ConfigServerApplication...\n");

    }
}
