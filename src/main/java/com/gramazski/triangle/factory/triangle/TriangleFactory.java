package com.gramazski.triangle.factory.triangle;

import com.gramazski.triangle.factory.Abstract2DFigureFactory;
import com.gramazski.triangle.entity.IFigure2D;
import com.gramazski.triangle.entity.Point;
import com.gramazski.triangle.entity.figure.Triangle;
import com.gramazski.triangle.exception.FigurePointsException;
import com.gramazski.triangle.validator.triangle.TriangleValidator;

import java.util.ArrayList;

/**
 * Created by gs on 05.12.2016.
 */
//Divide triangle on two factories
public class TriangleFactory extends Abstract2DFigureFactory {
    public TriangleFactory(){
        super.setFigurePointsValidator(new TriangleValidator());
    }

    public IFigure2D getFigure(ArrayList<Point> points) throws FigurePointsException {
        if (!super.getFigurePointsValidator().checkFigurePointsArray(points)){
            throw new FigurePointsException("Incorrect count of points in array.");
        }

        if (!super.getFigurePointsValidator().checkFigurePoints(points)){
            throw new FigurePointsException("Incorrect points values in array.");
        }

        return new Triangle(points);
    }
}
