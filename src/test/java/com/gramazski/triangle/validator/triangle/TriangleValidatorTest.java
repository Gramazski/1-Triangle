package com.gramazski.triangle.validator.triangle;

import com.gramazski.triangle.entity.Point;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by gs on 12.12.2016.
 */
public class TriangleValidatorTest {
    @Test
    public void checkFigurePointsWhenThreePointsOnOneXLineReturnFalse() throws Exception {
        TriangleValidator triangleValidator = new TriangleValidator();
        ArrayList<Point> points = new ArrayList<Point>();

        points.add(new Point(1, 1));
        points.add(new Point(1, 2));
        points.add(new Point(1, 3));

        Assert.assertFalse("Test with wrong data where three points in X line failed.", triangleValidator.checkFigurePoints(points));
    }

    @Test
    public void checkFigurePointsWhenThreePointsOnOneYLineReturnFalse() throws Exception {
        TriangleValidator triangleValidator = new TriangleValidator();
        ArrayList<Point> points = new ArrayList<Point>();

        points.add(new Point(1, 1));
        points.add(new Point(2, 1));
        points.add(new Point(3, 1));

        Assert.assertFalse("Test with wrong data where three points in Y line failed.", triangleValidator.checkFigurePoints(points));
    }

}