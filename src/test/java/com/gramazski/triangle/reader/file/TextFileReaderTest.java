package com.gramazski.triangle.reader.file;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gs on 12.12.2016.
 */
public class TextFileReaderTest {
    @Test
    public void readWhenDataInOneLineReturnStringWithAdditionalSeparatorAtTheEnd() throws Exception {
        TextFileReader textFileReader = new TextFileReader();
        String expected = "1;2;3;4;5;6;";

        Assert.assertEquals(expected, textFileReader.read("src/main/resources/test/reader/right/dataInOneLine.txt"));
    }

    @Test
    public void readWhenDataInThreeLinesReturnStringWithAdditionalSeparatorAtTheEnd() throws Exception {
        TextFileReader textFileReader = new TextFileReader();
        String expected = "1;2;3;4;5;6;";

        Assert.assertEquals(expected, textFileReader.read("src/main/resources/test/reader/right/dataInThreeLines.txt"));
    }

}