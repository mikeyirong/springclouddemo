package com.baibei.common.core.api;

/**
 * @author: 会跳舞的机器人
 * @date: 2017/3/29 16:58
 * @description:ApiResult对象的生成工具
 */
public class ApiResultGenerator {

    /**
     * 成功
     *
     * @param data
     * @return
     */
    public static ApiResult success(Object data) {
        return generate(BaseCodeMsg.SUCCESS.getCode(), BaseCodeMsg.SUCCESS.getMsg(), data);
    }

    /**
     * 系统异常
     *
     * @param msg
     * @return
     */
    public static ApiResult error(String msg) {
        return generate(BaseCodeMsg.SYSTEM_ERROR.getCode(), msg, null);
    }

    /**
     * 系统异常
     *
     * @return
     */
    public static ApiResult error() {
        return generate(BaseCodeMsg.SYSTEM_ERROR.getCode(), BaseCodeMsg.SYSTEM_ERROR.getMsg(), null);
    }

    /**
     * 鉴权失败
     *
     * @return
     */
    public static ApiResult authenticationError() {
        return generate(BaseCodeMsg.AUTHENTICATION_ERROR.getCode(), BaseCodeMsg.AUTHENTICATION_ERROR.getMsg(), null);
    }

    /**
     * 服务请求失败
     *
     * @param data
     * @return
     */
    public static ApiResult serviceError(Object data) {
        return generate(BaseCodeMsg.SERVICE_ERROR.getCode(), BaseCodeMsg.SERVICE_ERROR.getMsg(), data);
    }

    /**
     * 构造ApiResult
     *
     * @param code
     * @param msg
     * @param data
     * @return
     */
    private static ApiResult generate(int code, String msg, Object data) {
        return new ApiResult(code, msg, data);
    }
}