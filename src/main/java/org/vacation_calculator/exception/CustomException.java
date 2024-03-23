package org.vacation_calculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//unused exception, if you will use, than remove status and see how to add ControllerAdvice and exception handling there
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CustomException extends RuntimeException {

    public CustomException(String message) {
        super(message);
    }
}

