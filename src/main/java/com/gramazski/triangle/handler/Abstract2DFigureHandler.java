package com.gramazski.triangle.handler;

import com.gramazski.triangle.entity.IFigure2D;
import com.gramazski.triangle.exception.FigurePointsException;

/**
 * Created by gs on 05.12.2016.
 */
public abstract class Abstract2DFigureHandler {
    private IFigure2D figure;
    private Abstract2DFigureCalcHandler figureCalcHandler;
    private Abstract2DFigureLogicalHandler figureLogicalHandler;

    public abstract double calcFigureSquare() throws FigurePointsException;
    public abstract double calcFigurePerimeter() throws FigurePointsException;
    public abstract boolean isPresetShape() throws FigurePointsException;

    public void setFigure(IFigure2D figure){
        this.figure = figure;
    }

    public void setFigureCalcHandler(Abstract2DFigureCalcHandler figureCalcHandler) {
        this.figureCalcHandler = figureCalcHandler;
    }

    public void setFigureLogicalHandler(Abstract2DFigureLogicalHandler figureLogicalHandler) {
        this.figureLogicalHandler = figureLogicalHandler;
    }

    public IFigure2D getFigure() {
        return figure;
    }

    public Abstract2DFigureCalcHandler getFigureCalcHandler() {
        return figureCalcHandler;
    }

    public Abstract2DFigureLogicalHandler getFigureLogicalHandler() {
        return figureLogicalHandler;
    }
}
