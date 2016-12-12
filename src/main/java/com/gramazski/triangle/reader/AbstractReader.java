package com.gramazski.triangle.reader;

import com.gramazski.triangle.exception.DataReaderException;

/**
 * Created by gs on 05.12.2016.
 */
public abstract class AbstractReader {
    public abstract String read(String fileName) throws DataReaderException;//Fix - change standart exception on my
}
