package com.gramazski.triangle.factory.triangle;

import com.gramazski.triangle.factory.AbstractFigureHandlerFactory;
import com.gramazski.triangle.handler.Abstract2DFigureHandler;
import com.gramazski.triangle.handler.triangle.TriangleCalcHandler;
import com.gramazski.triangle.handler.triangle.TriangleHandler;
import com.gramazski.triangle.handler.triangle.TriangleLogicalHandler;

/**
 * Created by gs on 06.12.2016.
 */

public class TriangleHandlerFactory extends AbstractFigureHandlerFactory {
    public Abstract2DFigureHandler getFigureHandler() {
        Abstract2DFigureHandler figureHandler = new TriangleHandler();
        figureHandler.setFigureCalcHandler(new TriangleCalcHandler());
        figureHandler.setFigureLogicalHandler(new TriangleLogicalHandler());

        return figureHandler;
    }
}
