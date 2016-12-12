package com.gramazski.triangle.handler;

import com.gramazski.triangle.entity.IFigure2D;
import com.gramazski.triangle.exception.FigurePointsException;

/**
 * Created by gs on 05.12.2016.
 */
public abstract class Abstract2DFigureCalcHandler {
    public abstract double calcFigureSquare(IFigure2D figure) throws FigurePointsException;
    public abstract double calcFigurePerimeter(IFigure2D figure) throws FigurePointsException;
}
