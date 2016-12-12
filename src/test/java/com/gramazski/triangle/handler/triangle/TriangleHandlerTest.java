package com.gramazski.triangle.handler.triangle;

import com.gramazski.triangle.entity.Point;
import com.gramazski.triangle.entity.figure.Triangle;
import com.gramazski.triangle.exception.FigurePointsException;
import com.gramazski.triangle.handler.Abstract2DFigureHandler;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by gs on 12.12.2016.
 */
public class TriangleHandlerTest {
    private static Abstract2DFigureHandler figureHandler;

    @BeforeClass
    public static void createTriangleHandler(){
        figureHandler = new TriangleHandler();
        figureHandler.setFigureLogicalHandler(new TriangleLogicalHandler());
        figureHandler.setFigureCalcHandler(new TriangleCalcHandler());
    }

    private Triangle createWrongTriangle(){
        ArrayList<Point> points = new ArrayList<Point>();

        points.add(new Point(1, 1));
        points.add(new Point(1, 1));
        points.add(new Point(1, 1));
        points.add(new Point(1, 1));

        return new Triangle(points);
    }

    private Triangle createRightTriangle(){
        ArrayList<Point> points = new ArrayList<Point>();

        points.add(new Point(1, 1));
        points.add(new Point(1, 1));
        points.add(new Point(1, 1));

        return new Triangle(points);
    }

    @Test
    public void calcFigureSquareWhenTrianglesPointsCountIsWrongReturnThrowException() throws Exception {
        Triangle triangle = createWrongTriangle();

        figureHandler.setFigure(triangle);

        try {
            figureHandler.calcFigureSquare();
            Assert.fail("Test calc figure square when triangle points is wrong fail: exception not create.");
        }
        catch (FigurePointsException ex){
            Assert.assertTrue(true);
        }
    }

    @Test
    public void isPresetShapeWhenTrianglesPointsCountIsWrongReturnThrowException() throws Exception {
        Triangle triangle = createWrongTriangle();

        figureHandler.setFigure(triangle);

        try {
            figureHandler.isPresetShape();
            Assert.fail("Test is preset shape when triangle points is wrong fail: exception not create.");
        }
        catch (FigurePointsException ex){
            Assert.assertTrue(true);
        }
    }

    @Test
    public void calcFigurePerimeterWhenTrianglesPointsCountIsWrongReturnThrowException() throws Exception {
        Triangle triangle = createWrongTriangle();

        figureHandler.setFigure(triangle);

        try {
            figureHandler.calcFigurePerimeter();
            Assert.fail("Test calc figure perimeter when triangle points is wrong fail: exception not create.");
        }
        catch (FigurePointsException ex){
            Assert.assertTrue(true);
        }
    }

    @Test
    public void calcFigurePerimeterWhenTriangleIsRightReturnNotThrowException() throws Exception {
        Triangle triangle = createRightTriangle();

        figureHandler.setFigure(triangle);

        try {
            figureHandler.calcFigurePerimeter();
            Assert.assertTrue(true);
        }
        catch (FigurePointsException ex){
            Assert.fail("Test calc figure perimeter when triangle is right: exception not create.");
        }
    }

    @Test
    public void calcFigureSquareWhenTriangleIsRightReturnNotThrowException() throws Exception {
        Triangle triangle = createRightTriangle();

        figureHandler.setFigure(triangle);

        try {
            figureHandler.calcFigureSquare();
            Assert.assertTrue(true);
        }
        catch (FigurePointsException ex){
            Assert.fail("Test calc figure square when triangle is right: exception not create.");
        }
    }

    @Test
    public void isPresetShapeWhenTriangleIsRightReturnNotThrowException() throws Exception {
        Triangle triangle = createRightTriangle();

        figureHandler.setFigure(triangle);

        try {
            figureHandler.isPresetShape();
            Assert.assertTrue(true);
        }
        catch (FigurePointsException ex){
            Assert.fail("Test is preset shape when triangle is right: exception not create.");
        }
    }

    @Test
    public void calcFigurePerimeter() throws Exception {

    }

    @Test
    public void isPresetShape() throws Exception {

    }

}