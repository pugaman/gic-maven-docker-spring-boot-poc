package com.gic.exception;

/**
 * Created by pgolovenkov on 13.03.2017.
 */
public class GicException extends Exception{

    public GicException(String message) {
        super(message);
    }

    public GicException(String message, Throwable cause) {
        super(message, cause);
    }

}
