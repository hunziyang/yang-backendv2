package com.yang.portal.core.result;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultCode implements ResultCodeBase{
    SUCCESS(200,"SUCCESS"),
    BAD_REQUEST(400,"BAD REQUEST"),
    INTERNAL_SERVER_ERROR(500,"INTERNAL SERVER ERROR");

    private Integer code;
    private String message;
}
