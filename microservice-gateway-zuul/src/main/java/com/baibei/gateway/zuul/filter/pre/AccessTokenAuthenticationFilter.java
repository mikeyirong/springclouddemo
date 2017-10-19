package com.baibei.gateway.zuul.filter.pre;

import com.baibei.common.core.api.ApiResultGenerator;
import com.baibei.common.core.utils.JacksonUtil;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: 会跳舞的机器人
 * @date: 2017/10/18 16:36
 * @description: 路由前，AccessToken鉴权过滤器
 */
public class AccessTokenAuthenticationFilter extends ZuulFilter {
    private Logger logger = Logger.getLogger(AccessTokenAuthenticationFilter.class);


    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        logger.info("PreFilter is do filter...");
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        logger.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));
        // 校验AccessToken是否为空
        Object accessToken = request.getHeader("accessToken");
        if (accessToken == null) {
            accessToken = request.getParameter("accessToken");
        }
        if (accessToken == null) {
            logger.info("access token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            ctx.setResponseBody(JacksonUtil.objectToJson(ApiResultGenerator.accessTokenIsNull()));
            return null;
        }

        // 校验AccessToken是否合法
        if (!"123".equals(accessToken)) {
            logger.info("access token is error");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            ctx.setResponseBody(JacksonUtil.objectToJson(ApiResultGenerator.authenticationError()));
            return null;
        }
        logger.info("access token ok");
        return null;
    }
}
