package com.cyh.projectmanagementsystemapplication.data;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 统一响应结果
 *
 * @author cyh
 * @since 2024/12/18
 */
@NoArgsConstructor
@AllArgsConstructor
public class MyResult<T> {
    private Integer code;
    private String msg;
    private T data;

    public static <T> MyResult<T> success(T data) {
        return new MyResult<T>(200, "success", data);
    }

    public static MyResult success() {
        return new MyResult(0, "success", null);
    }

    public static MyResult error(String msg) {
        return new MyResult(1,msg, null);
    }
}
