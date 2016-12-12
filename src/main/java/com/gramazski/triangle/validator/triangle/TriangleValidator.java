package com.gramazski.triangle.validator.triangle;

import com.gramazski.triangle.entity.Point;
import com.gramazski.triangle.validator.AbstractFigurePointsValidator;

import java.util.ArrayList;

/**
 * Created by gs on 05.12.2016.
 */
public class TriangleValidator extends AbstractFigurePointsValidator {
    private final int POINTS_COUNT;
    public TriangleValidator(){
        POINTS_COUNT = 3;
    }

    public boolean checkFigurePointsArray(ArrayList<Point> points) {
        return !((points == null) || (points.size() != POINTS_COUNT));
    }

    public boolean checkFigurePoints(ArrayList<Point> points) {
        return checkXCoordinates(points.get(0).getX(), points.get(1).getX(), points.get(2).getX())
                && checkYCoordinates(points.get(0).getY(), points.get(1).getY(), points.get(2).getY());
    }

    private boolean checkXCoordinates(int x1, int x2, int x3){
        return !((x1 == x2) && (x2 == x3));
    }

    private boolean checkYCoordinates(int y1, int y2, int y3){
        return !((y1 == y2) && (y2 == y3));
    }
}
