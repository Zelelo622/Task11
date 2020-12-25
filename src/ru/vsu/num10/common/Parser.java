package ru.vsu.num10.common;

import java.io.BufferedReader;
import java.io.IOException;

public class Parser {

    public String parseHTMLFile(String input) {
        String[] arrayString = input.split("");
        String str = String.join("", arrayString);
        String parserResult = str.replaceAll("<.*?>", " ");
        return parserResult;
    }

    public String fillArrayWithLinesFile(StringBuilder stringBuilder, BufferedReader bufferedReader) throws IOException {
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line);
        }
        return stringBuilder.toString();
    }
}
