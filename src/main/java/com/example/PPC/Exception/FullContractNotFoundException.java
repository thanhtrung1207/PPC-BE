package com.example.PPC.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class FullContractNotFoundException extends RuntimeException {

    public FullContractNotFoundException(String message) {
        super(message);
    }

    public FullContractNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
