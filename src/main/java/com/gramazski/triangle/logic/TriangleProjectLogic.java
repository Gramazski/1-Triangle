package com.gramazski.triangle.logic;

import com.gramazski.triangle.factory.Abstract2DFigureFactory;
import com.gramazski.triangle.factory.AbstractFigureHandlerFactory;
import com.gramazski.triangle.entity.IFigure2D;
import com.gramazski.triangle.exception.DataReaderException;
import com.gramazski.triangle.exception.FigurePointsException;
import com.gramazski.triangle.handler.Abstract2DFigureHandler;
import com.gramazski.triangle.parser.AbstractParser;
import com.gramazski.triangle.reader.AbstractReader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by gs on 05.12.2016.
 */
public class TriangleProjectLogic {
    //Delete fields
    private Abstract2DFigureHandler currentFigureHandler;
    static final Logger Logger = LogManager.getLogger(TriangleProjectLogic.class);

    public boolean initializeFigure(Abstract2DFigureFactory figureFactory, AbstractFigureHandlerFactory figureHandlerFactory,
                                         String fileName, AbstractParser parser, AbstractReader reader){
        IFigure2D currentFigure;
        AbstractReader currentReader = reader;
        AbstractParser currentParser = parser;

        if (currentParser == null || currentReader == null || figureFactory == null || figureHandlerFactory == null){
            Logger.log(Level.ERROR, "Can't initialize figure: invalid parameter.");
            return false;
        }

        try {
            currentFigure = figureFactory.getFigure(currentParser.parse(currentReader.read(fileName)));
            Logger.log(Level.INFO, "Figure was created.");
            currentFigureHandler = figureHandlerFactory.getFigureHandler();
            Logger.log(Level.INFO, "Figure handler was created.");
            currentFigureHandler.setFigure(currentFigure);
            return true;
        }
        catch (DataReaderException ex){
            Logger.log(Level.FATAL, ex.getMessage());
        }
        catch (FigurePointsException ex){
            Logger.log(Level.ERROR, ex.getMessage());
        }

        return false;
    }

    public double calcTriangleSquare(){
        double square = 0;
        try {
            square = currentFigureHandler.calcFigureSquare();
        }
        catch (FigurePointsException ex){
            Logger.log(Level.ERROR, ex.getMessage());
        }

        return square;
    }

    public double calcTrianglePerimeter(){
        double perimeter = 0;
        try {
            perimeter = currentFigureHandler.calcFigurePerimeter();
        }
        catch (FigurePointsException ex){
            Logger.log(Level.ERROR, ex.getMessage());
        }

        return perimeter;
    }

    public boolean isRightTriangle(){
        boolean isPresetShape = false;
        try {
            isPresetShape = currentFigureHandler.isPresetShape();
        }
        catch (FigurePointsException ex){

        }

        return isPresetShape;
    }
}
