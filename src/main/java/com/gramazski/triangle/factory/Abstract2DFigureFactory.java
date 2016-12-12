package com.gramazski.triangle.factory;

import com.gramazski.triangle.entity.IFigure2D;
import com.gramazski.triangle.entity.Point;
import com.gramazski.triangle.exception.FigurePointsException;
import com.gramazski.triangle.validator.AbstractFigurePointsValidator;

import java.util.ArrayList;

/**
 * Created by gs on 05.12.2016.
 */
public abstract class Abstract2DFigureFactory {
    private AbstractFigurePointsValidator figurePointsValidator;
    public abstract IFigure2D getFigure(ArrayList<Point> points) throws FigurePointsException;

    protected AbstractFigurePointsValidator getFigurePointsValidator() {
        return figurePointsValidator;
    }

    protected void setFigurePointsValidator(AbstractFigurePointsValidator figurePointsValidator) {
        this.figurePointsValidator = figurePointsValidator;
    }
}
