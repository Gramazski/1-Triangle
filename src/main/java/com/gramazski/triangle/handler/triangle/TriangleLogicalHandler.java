package com.gramazski.triangle.handler.triangle;

import com.gramazski.triangle.entity.IFigure2D;
import com.gramazski.triangle.entity.Point;
import com.gramazski.triangle.exception.FigurePointsException;
import com.gramazski.triangle.handler.Abstract2DFigureLogicalHandler;

import java.util.ArrayList;

/**
 * Created by gs on 05.12.2016.
 */
public class TriangleLogicalHandler extends Abstract2DFigureLogicalHandler {
    private final static int POINTS_COUNT = 3;

    public boolean isPresetShape(IFigure2D figure) throws FigurePointsException {
        ArrayList<Point> figurePoints = figure.getFigurePoints();

        if (figurePoints.size() != POINTS_COUNT){
            throw new FigurePointsException("Invalid points count in figure.");
        }

        return checkAngle(figurePoints.get(0), figurePoints.get(1), figurePoints.get(2))
                || checkAngle(figurePoints.get(1), figurePoints.get(0), figurePoints.get(2))
                || checkAngle(figurePoints.get(2), figurePoints.get(1), figurePoints.get(0));
    }

    private boolean checkAngle(Point anglePoint, Point firstNearPoint, Point secondNearPoint){
        return ((anglePoint.getX() == firstNearPoint.getX()) && (anglePoint.getY() == secondNearPoint.getY()))
                || ((anglePoint.getY() == firstNearPoint.getY()) && (anglePoint.getX() == secondNearPoint.getX()));
    }
}
