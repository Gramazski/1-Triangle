package com.gramazski.triangle.handler;

import com.gramazski.triangle.entity.IFigure2D;
import com.gramazski.triangle.exception.FigurePointsException;

/**
 * Created by gs on 05.12.2016.
 */
public abstract class Abstract2DFigureLogicalHandler {
    public abstract boolean isPresetShape(IFigure2D figure) throws FigurePointsException;
}
