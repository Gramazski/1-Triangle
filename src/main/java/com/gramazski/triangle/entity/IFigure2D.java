package com.gramazski.triangle.entity;

import java.util.ArrayList;

/**
 * Created by gs on 05.12.2016.
 */
public interface IFigure2D {

    boolean setFigurePoints(ArrayList<Point> figurePoints);

    boolean setOnePoint(int pointIndex, Point point);

    ArrayList<Point> getFigurePoints();
}
