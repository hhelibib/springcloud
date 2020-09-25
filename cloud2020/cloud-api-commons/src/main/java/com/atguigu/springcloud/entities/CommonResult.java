package com.atguigu.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: CommonResult
 * Created 2020/9/24 22:53
 * @auther JYH
 */
@Data
//@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>{
    private Integer code;
    private String   message;
    private T           data;

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
        this.data = null;
    }

    public CommonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }


}
