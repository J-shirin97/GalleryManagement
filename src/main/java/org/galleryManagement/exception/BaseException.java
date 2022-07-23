package org.galleryManagement.exception;

import org.springframework.http.HttpStatus;

public abstract class BaseException extends RuntimeException {
    public BaseException(String message) {
        super(message);
    }

    abstract String getMassageKey();

    abstract HttpStatus httpStatus();

}
