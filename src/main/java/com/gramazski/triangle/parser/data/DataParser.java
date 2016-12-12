package com.gramazski.triangle.parser.data;

import com.gramazski.triangle.entity.Point;
import com.gramazski.triangle.exception.DataReaderException;
import com.gramazski.triangle.parser.AbstractParser;

import java.util.ArrayList;

/**
 * Created by gs on 05.12.2016.
 */
public class DataParser extends AbstractParser {
    private final int coordinatesCountForPoint = 2;

    public ArrayList<Point> parse(String data) throws DataReaderException {
        String stringPoints[] = data.split(";");
        ArrayList<Point> points = new ArrayList<Point>();
        int x, y;

        try {
            //Add cycle - create int array for creating point, 2D - 2 int, 3D - 3 int
            for (int i = 0; i < stringPoints.length; i += coordinatesCountForPoint){
                x = Integer.parseInt(stringPoints[i]);
                y = Integer.parseInt(stringPoints[i + 1]);
                points.add(new Point(x, y));
            }
        }
        catch (ArrayIndexOutOfBoundsException ex){
            throw new DataReaderException("Invalid count of points coordinates in file. Data: " + data, ex);
        }
        catch (NumberFormatException ex){
            throw new DataReaderException("Invalid points coordinates - not a numbers. Data: " + data, ex);
        }

        return points;
    }
}
