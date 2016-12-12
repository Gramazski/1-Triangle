package com.gramazski.triangle.validator;

import com.gramazski.triangle.entity.Point;

import java.util.ArrayList;

/**
 * Created by gs on 05.12.2016.
 */
public abstract class AbstractFigurePointsValidator {
    public abstract boolean checkFigurePointsArray(ArrayList<Point> points);
    public abstract boolean checkFigurePoints(ArrayList<Point> points);
}
