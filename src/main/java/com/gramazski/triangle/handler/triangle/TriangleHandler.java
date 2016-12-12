package com.gramazski.triangle.handler.triangle;

import com.gramazski.triangle.exception.FigurePointsException;
import com.gramazski.triangle.handler.Abstract2DFigureHandler;

/**
 * Created by gs on 05.12.2016.
 */
public class TriangleHandler extends Abstract2DFigureHandler {

    public double calcFigureSquare() throws FigurePointsException {
        return super.getFigureCalcHandler().calcFigureSquare(super.getFigure());
    }

    public double calcFigurePerimeter() throws FigurePointsException {
        return super.getFigureCalcHandler().calcFigurePerimeter(super.getFigure());
    }

    public boolean isPresetShape() throws FigurePointsException {
        return super.getFigureLogicalHandler().isPresetShape(super.getFigure());
    }
}
