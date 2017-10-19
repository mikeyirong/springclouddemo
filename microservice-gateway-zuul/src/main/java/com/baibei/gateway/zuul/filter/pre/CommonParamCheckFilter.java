package com.baibei.gateway.zuul.filter.pre;

import com.netflix.zuul.ZuulFilter;

/**
 * @author: 会跳舞的机器人
 * @date: 2017/10/18 17:12
 * @description: 路由前，请求公共参数校验过滤器
 */
public class CommonParamCheckFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {

        return null;
    }
}
