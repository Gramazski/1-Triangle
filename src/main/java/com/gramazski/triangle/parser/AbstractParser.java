package com.gramazski.triangle.parser;

import com.gramazski.triangle.entity.Point;
import com.gramazski.triangle.exception.DataReaderException;

import java.util.ArrayList;

/**
 * Created by gs on 05.12.2016.
 */
public abstract class AbstractParser {
    public abstract ArrayList<Point> parse(String data) throws DataReaderException;
}
