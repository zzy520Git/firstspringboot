package com.jd.web.config;

import com.jd.yiyao.common.exception.BusinessException;
import com.jd.yiyao.common.result.ResponseResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Description：
 *
 * @author zhouzhongyi1
 * DATE： 2018/11/6 17:04
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseResult handleException(Exception exception) {
        if(exception instanceof BusinessException) {
            BusinessException e = (BusinessException)exception;
            return ResponseResult.systemError(e.getMessage());
        } else {
            return ResponseResult.systemError();
        }
    }
}
