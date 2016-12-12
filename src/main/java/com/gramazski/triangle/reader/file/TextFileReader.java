package com.gramazski.triangle.reader.file;

import com.gramazski.triangle.exception.DataReaderException;
import com.gramazski.triangle.reader.AbstractReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by gs on 05.12.2016.
 */
public class TextFileReader extends AbstractReader {
    public String read(String fileName) throws DataReaderException {
        File dataFile = new File(fileName);

        if (!dataFile.exists()){
            throw new DataReaderException("Data file does not exist. File name: " + fileName);
        }

        if (!dataFile.canRead()){
            throw new DataReaderException("File can not be read. File name: " + fileName);
        }

        if (!dataFile.isFile()){
            throw new DataReaderException("Is not a file! File name: " + fileName);
        }

        Scanner fileScanner;

        try {
            fileScanner = new Scanner(dataFile);
        } catch (FileNotFoundException ex) {
            throw new DataReaderException("File not found: " + fileName, ex);
        }

        StringBuilder stringBuilder = new StringBuilder();

        while (fileScanner.hasNext()){
            stringBuilder.append(fileScanner.nextLine());
            stringBuilder.append(";");
        }

        fileScanner.close();

        return stringBuilder.toString();
    }
}
