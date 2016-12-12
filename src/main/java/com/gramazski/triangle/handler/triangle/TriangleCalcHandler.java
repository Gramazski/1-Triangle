package com.gramazski.triangle.handler.triangle;

import com.gramazski.triangle.entity.IFigure2D;
import com.gramazski.triangle.entity.Point;
import com.gramazski.triangle.exception.FigurePointsException;
import com.gramazski.triangle.handler.Abstract2DFigureCalcHandler;

import java.util.List;

/**
 * Created by gs on 05.12.2016.
 */
public class TriangleCalcHandler extends Abstract2DFigureCalcHandler {
    private final static int POINTS_COUNT = 3;
    //Add exception for incorrect figure points count
    public double calcFigureSquare(IFigure2D figure) throws FigurePointsException {
        List<Point> figurePoints = figure.getFigurePoints();
        if (figurePoints.size() != POINTS_COUNT){
            throw new FigurePointsException("Invalid points count in figure.");
        }

        double perimeterHalf = calcFigurePerimeter(figure) / 2;

        return Math.sqrt(perimeterHalf * (perimeterHalf - calculateFigureSide(figurePoints.get(0), figurePoints.get(1)))
                * (perimeterHalf - calculateFigureSide(figurePoints.get(1), figurePoints.get(2)))
                * (perimeterHalf - calculateFigureSide(figurePoints.get(2), figurePoints.get(0))));
    }

    public double calcFigurePerimeter(IFigure2D figure) throws FigurePointsException {
        List<Point> figurePoints = figure.getFigurePoints();

        if (figurePoints.size() != POINTS_COUNT){
            throw new FigurePointsException("Invalid points count in figure.");
        }

        return calculateFigureSide(figurePoints.get(0), figurePoints.get(1))
                + calculateFigureSide(figurePoints.get(1), figurePoints.get(2))
                + calculateFigureSide(figurePoints.get(2), figurePoints.get(0));
    }

    //Math.highPot() - fix
    private double calculateFigureSide(Point startPoint, Point endPoint){

        return Math.hypot(startPoint.getX() - endPoint.getX(), startPoint.getY() - endPoint.getY());
    }
}
