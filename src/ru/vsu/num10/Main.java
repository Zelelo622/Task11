package ru.vsu.num10;

import ru.vsu.num10.common.Parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Parser parser = new Parser();
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader(args[0]));
        printParseHTMLFile(parser.parseHTMLFile(parser.fillArrayWithLinesFile(stringBuilder, bufferedReader)));
    }

    private static void printParseHTMLFile(String result) {
        System.out.println(result);
    }
}
