package com.liuchen.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Package: com.liuchen.util
 * Description:
 *
 * @Author: Liu-Chen-CS
 * @Create: 4/9/2024 - 1:45 PM
 * @Version: v1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 5187687995319002219L;
    private Integer code;
    private Boolean success;
    private String message;
    private T data;

    public static <T> Result<T> definition(int code, String message, Boolean success, T data) {
        Result<T> r = new Result<>();
        r.setCode(code);
        r.setSuccess(success);
        r.setMessage(message);
        r.setData(data);
        return r;
    }

    public static <T> Result<T> ok(String message, T data) {
        Result<T> r = new Result<>();
        r.setCode(200);
        r.setMessage(message);
        r.setSuccess(true);
        r.setData(data);
        return r;
    }

    public static <T> Result<T> ok(T data) {
        Result<T> r = new Result<>();
        r.setCode(200);
        r.setMessage("succeed");
        r.setSuccess(true);
        r.setData(data);
        return r;
    }

    public static <T> Result<T> ok(String message) {
        Result<T> r = new Result<>();
        r.setCode(200);
        r.setSuccess(true);
        r.setMessage(message);
        return r;
    }

    public static <T> Result<T> ok() {
        Result<T> r = new Result<>();
        r.setCode(200);
        r.setSuccess(true);
        r.setMessage("succeed");
        return r;
    }

    public static Result oks() {
        Result r = new Result<>();
        r.setCode(200);
        r.setSuccess(true);
        r.setMessage("succeed");
        return r;
    }

    public static <T> Result<T> error() {
        Result<T> r = new Result<>();
        r.setCode(500);
        r.setSuccess(false);
        r.setMessage("failed");
        return r;
    }

    public static <T> Result<T> error(String message) {
        Result<T> r = new Result<>();
        r.setCode(500);
        r.setSuccess(false);
        r.setMessage(message);
        return r;
    }

    public static <T> Result<T> error(int code, String message) {
        Result<T> r = new Result<>();
        r.setCode(code);
        r.setSuccess(false);
        r.setMessage(message);
        return r;
    }

}
