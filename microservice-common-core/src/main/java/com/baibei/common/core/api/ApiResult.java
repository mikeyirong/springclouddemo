package com.baibei.common.core.api;

/**
 * @author: 会跳舞的机器人
 * @date: 2017/3/29 16:58
 * @description: API统一返回的格式模板
 */
public class ApiResult {
    /**
     * 状态码
     **/
    private int code;

    /**
     * 状态码对于的提示信息
     **/
    private String msg;

    /**
     * 返回的具体数据
     **/
    private Object data;

    public ApiResult() {
    }

    public ApiResult(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}