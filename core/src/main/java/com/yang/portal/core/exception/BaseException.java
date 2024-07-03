package com.yang.portal.core.exception;

import com.yang.portal.core.result.ResultCodeBase;
import lombok.Getter;

import java.util.Map;
@Getter
public class BaseException extends Exception {

    private ResultCodeBase resultCodeBase;
    private Map<String, ?> errors;

    public BaseException(ResultCodeBase resultCodeBase) {
        super(resultCodeBase.getMessage());
        this.resultCodeBase = resultCodeBase;
    }

    public BaseException(ResultCodeBase resultCodeBase, Map<String, ?> errors) {
        super(resultCodeBase.getMessage());
        this.resultCodeBase = resultCodeBase;
        this.errors = errors;
    }
}
