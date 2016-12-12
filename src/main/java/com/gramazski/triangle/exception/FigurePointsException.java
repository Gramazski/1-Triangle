package com.gramazski.triangle.exception;

/**
 * Created by gs on 05.12.2016.
 */
public class FigurePointsException extends Exception{
    public FigurePointsException() {
    }

    public FigurePointsException(String message, Throwable exception) {
        super(message, exception);
    }

    public FigurePointsException(String message) {
        super(message);
    }

    public FigurePointsException(Throwable exception) {
        super(exception);
    }
}
