package com.baibei.gateway.zuul;

import com.baibei.gateway.zuul.filter.pre.AccessTokenAuthenticationFilter;
import com.baibei.gateway.zuul.filter.pre.CommonParamCheckFilter;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @author: 会跳舞的机器人
 * @date: 2017/2/20 11:17
 * @description: 网关
 */
@SpringCloudApplication
@EnableZuulProxy
public class GateWayZuulApplication {
    private static final Logger LOGGER = Logger.getLogger(GateWayZuulApplication.class);

    public static void main(String[] args) {
        LOGGER.info("start execute GateWayZuulApplication...\n");
        SpringApplication.run(GateWayZuulApplication.class, args);
        LOGGER.info("start execute GateWayZuulApplication...\n");
    }

    /**
     * AccessToken鉴权，pre过滤器
     */
    @Bean
    public AccessTokenAuthenticationFilter accessTokenAuthenticationFilter() {
        return new AccessTokenAuthenticationFilter();
    }

    /**
     * 公共参数检查，pre过滤器
     */
    @Bean
    public CommonParamCheckFilter commonParamCheckFilter() {
        return new CommonParamCheckFilter();
    }

}