package com.gramazski.triangle.entity.figure;

import com.gramazski.triangle.entity.IFigure2D;
import com.gramazski.triangle.entity.Point;

import java.util.ArrayList;

/**
 * Created by gs on 05.12.2016.
 */
public class Triangle implements IFigure2D {
    private final static int POINTS_COUNT = 3;
    private ArrayList<Point> figurePoints;

    public Triangle(Point firstPoint, Point secondPoint, Point thirdPoint){
        ArrayList<Point> figurePoints = new ArrayList<Point>(POINTS_COUNT);

        figurePoints.add(firstPoint);
        figurePoints.add(secondPoint);
        figurePoints.add(thirdPoint);

        this.figurePoints = figurePoints;
    }

    public Triangle(ArrayList<Point> figurePoints){
        this.figurePoints = figurePoints;
    }

    public boolean setFigurePoints(ArrayList<Point> figurePoints) {
        if (figurePoints.size() == POINTS_COUNT){
            this.figurePoints = figurePoints;
            return true;
        }

        return false;
    }

    public ArrayList<Point> getFigurePoints(){
        ArrayList<Point> copiedFigurePoints = new ArrayList<Point>(POINTS_COUNT);
        copiedFigurePoints.addAll(figurePoints);

        return copiedFigurePoints;
    }

    public boolean setOnePoint(int pointIndex, Point point){
        if ((pointIndex < POINTS_COUNT) && (pointIndex > -1) && (point != null)){
            figurePoints.set(pointIndex, point);

            return true;
        }

        return false;
    }
}
