package com.andrijanica.SpringTest1.exception;

import lombok.Getter;

import static com.andrijanica.SpringTest1.exception.ErrorCode.BAD_REQUEST;

/**
 * Custom exception class used for various API rest actions.
 */
@Getter
public class GeneralException extends RuntimeException {
    private final ErrorCode code;

    public GeneralException() {
        this.code = BAD_REQUEST;
    }

    public GeneralException(ErrorCode code) {
        this.code = code;
    }

    public GeneralException(String message) {
        super(message);
        this.code = BAD_REQUEST;
    }

    public GeneralException(ErrorCode code, String message) {
        super(message);
        this.code = code;
    }

    public GeneralException(ErrorCode code, Throwable cause) {
        super(cause);
        this.code = code;
    }

    public GeneralException(ErrorCode code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
}
