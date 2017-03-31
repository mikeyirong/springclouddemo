package com.baibei.common.core.api;

/**
 * @author: 会跳舞的机器人
 * @date: 2017/3/29 17:05
 * @description:为ApiResult对象提供基础的code、msg，其他功能服务可以定义自已的
 */
public enum BaseCodeMsg {
    SUCCESS(1000, "成功"),
    AUTHENTICATION_ERROR(-1001, "鉴权失败"),
    SERVICE_ERROR(-998, "无法访问服务，该服务可能由于某种未知原因被关闭。请重启服务！"),
    SYSTEM_ERROR(-999, "系统异常");
    /**
     * 提示码
     */
    private int code;

    /**
     * 提示信息
     */
    private String msg;

    BaseCodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}