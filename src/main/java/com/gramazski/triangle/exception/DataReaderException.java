package com.gramazski.triangle.exception;

/**
 * Created by gs on 05.12.2016.
 */
//Change exception name
public class DataReaderException extends Exception {
    public DataReaderException() {
    }

    public DataReaderException(String message, Throwable exception) {
        super(message, exception);
    }

    public DataReaderException(String message) {
        super(message);
    }

    public DataReaderException(Throwable exception) {
        super(exception);
    }
}
