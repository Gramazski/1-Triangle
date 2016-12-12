package com.gramazski.triangle.logic;

import com.gramazski.triangle.factory.triangle.TriangleFactory;
import com.gramazski.triangle.factory.triangle.TriangleHandlerFactory;
import com.gramazski.triangle.parser.data.DataParser;
import com.gramazski.triangle.reader.file.TextFileReader;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gs on 06.12.2016.
 */
public class TriangleProjectLogicTest {
    private TriangleProjectLogic triangleProjectLogic;

    private boolean initializeFigureWithDataFromFile(String fileName){
        triangleProjectLogic = new TriangleProjectLogic();
        return triangleProjectLogic.initializeFigure(new TriangleFactory(),
                new TriangleHandlerFactory(), fileName,
                new DataParser(), new TextFileReader());
    }

    @Test
    public void initializeFigureWithWrongDataWhereThreePointsInLineReturnFalse() throws Exception {
        Assert.assertFalse("Initialize test with wrong data where three points in line failed.",
                initializeFigureWithDataFromFile("src/main/resources/test/logic/wrong/threePointsInLine.txt"));
    }

    @Test
    public void initializeFigureWithRightDataReturnTrue() throws Exception {
        Assert.assertTrue("Initialize test with right data failed.",
                initializeFigureWithDataFromFile("src/main/resources/test/logic/right/data.txt"));
    }

    @Test
    public void initializeFigureWithWrongDataWhereFiveCoordinatesInsteadSixReturnFalse() throws Exception {
        Assert.assertFalse("Initialize test with wrong data where file coordinates instead six failed.",
                initializeFigureWithDataFromFile("src/main/resources/test/logic/wrong/fiveCoordinates.txt"));
    }

    @Test
    public void initializeFigureWithWrongDataWhereCharactersInsteadNumbersReturnFalse() throws Exception {
        Assert.assertFalse("Initialize test with wrong data where characters instead numbers failed.",
                initializeFigureWithDataFromFile("src/main/resources/test/logic/wrong/sixCharacters.txt"));
    }

    @Test
    public void initializeFigureWithWrongDataWhereDataFileDoesNotExistReturnFalse() throws Exception {
        Assert.assertFalse("Initialize test with wrong data where data file doesn't exist failed.",
                initializeFigureWithDataFromFile("src/main/resources/test/logic/wrong/fileDoesNotExist.txt"));
    }

    @Test
    public void initializeFigureWithWrongParametersReturnFalse() throws Exception {
        triangleProjectLogic = new TriangleProjectLogic();
        ;
        Assert.assertFalse("Initialize test with wrong data where wrong method parameters failed.",
                triangleProjectLogic.initializeFigure(null, new TriangleHandlerFactory(),
                        "src/main/resources/test/logic/right/data.txt",
                        new DataParser(), new TextFileReader()));
    }

    @Test
    public void calcTriangleSquareWithRightDataReturnTrue() throws Exception {
        double expected = 8;
        initializeFigureWithDataFromFile("src/main/resources/test/logic/right/squareData.txt");
        double actual = triangleProjectLogic.calcTriangleSquare();
        Assert.assertEquals("Triangle square test with right data failed.", expected, actual, 0.01);
    }

    @Test
    public void calcTrianglePerimeterWithRightDataReturnTrue() throws Exception {
        double expected = 12;
        initializeFigureWithDataFromFile("src/main/resources/test/logic/right/perimeterData.txt");
        double actual = triangleProjectLogic.calcTrianglePerimeter();
        Assert.assertEquals("Triangle perimeter test with right data failed.", expected, actual, 0.01);
    }

    @Test
    public void isRightTriangleWithRightDataReturnTrue() throws Exception {
        initializeFigureWithDataFromFile("src/main/resources/test/logic/right/rectData.txt");
        Assert.assertTrue("Is right triangle test with right data failed.", triangleProjectLogic.isRightTriangle());
    }

    @Test
    public void isRightTriangleWithWrongDataReturnFalse() throws Exception {
        initializeFigureWithDataFromFile("src/main/resources/test/logic/wrong/rectData.txt");
        Assert.assertFalse("Is right triangle test with wrong data failed.", triangleProjectLogic.isRightTriangle());
    }
}