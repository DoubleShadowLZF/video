package com.example.demo.common;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RespView {

    private Integer code;

    private Object data;

    private static int CODE_SUCCESS = 200;
    private static int CODE_FAIL = 100;

    public static RespView success(Object data) {
        return new RespView(CODE_SUCCESS,data);
    }

    public static RespView fail(Object data) {
        return new RespView(CODE_FAIL,data);
    }

}
