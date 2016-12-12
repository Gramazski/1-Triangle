package com.gramazski.triangle.entity.figure;

import com.gramazski.triangle.entity.IFigure2D;
import com.gramazski.triangle.entity.Point;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by gs on 09.12.2016.
 */
public class TriangleTest {
    private IFigure2D triangle;
    @Before
    public void initTriangle(){
        ArrayList<Point> trianglePoints = new ArrayList<Point>();
        trianglePoints.add(new Point(1, 2));
        trianglePoints.add(new Point(3, 4));
        trianglePoints.add(new Point(5, 6));

        triangle = new Triangle(trianglePoints);
    }

    @Test
    public void testFigurePointsGetterWithChangingPointsListOutOfTriangle() throws Exception {
        ArrayList<Point> pointsStorage = new ArrayList<Point>();
        pointsStorage = triangle.getFigurePoints();
        pointsStorage.set(0, new Point(0, 0));

        Assert.assertEquals(triangle.getFigurePoints().get(0).getX(), 1);
    }

    @Test
    public void testFigurePointsSetterWithRightArrayLengthReturnTrue() throws Exception {
        ArrayList<Point> trianglePoints = new ArrayList<Point>();
        trianglePoints.add(new Point(1, 2));
        trianglePoints.add(new Point(3, 4));
        trianglePoints.add(new Point(5, 6));

        Assert.assertTrue("Points setter test with right array length failed!", triangle.setFigurePoints(trianglePoints));
    }

    @Test
    public void testFigurePointsSetterWithWrongArrayLengthReturnFalse() throws Exception {
        ArrayList<Point> trianglePoints = new ArrayList<Point>();
        trianglePoints.add(new Point(1, 2));
        trianglePoints.add(new Point(3, 4));
        trianglePoints.add(new Point(5, 6));
        trianglePoints.add(new Point(5, 6));

        Assert.assertFalse("Points setter test with wrong array length failed!", triangle.setFigurePoints(trianglePoints));
    }

    @Test
    public void testFigurePointSetterWithWrongPointIndexReturnFalse() throws Exception {
        Assert.assertFalse("One point setter test with wrong point index failed!", triangle.setOnePoint(4, new Point(0, 0)));
    }

    @Test
    public void testFigurePointSetterWithRightPointIndexReturnTrue() throws Exception {
        Assert.assertTrue("One point setter test with right point index failed!", triangle.setOnePoint(0, new Point(0, 0)));
    }
}