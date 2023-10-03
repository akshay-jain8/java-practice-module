package com.softdebugs.javapracticemodule.io.readingfiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

public class LineNumberReaders {
    public static void main(String[] args) {
        List<String> list = readTextFromResources("src/main/resources/text.txt");
        for (String value : list) {
            System.out.println(value);
        }
    }

    public static List<String> readTextFromResources(String location) {
        List<String> stringList = new ArrayList<>();
        try(FileInputStream inputStream = new FileInputStream(location);
            InputStreamReader inputReader = new InputStreamReader(inputStream);
            LineNumberReader lineReader = new LineNumberReader(inputReader)
        ) {
            String line = null;
            while ((line = lineReader.readLine()) != null) {
                stringList.add("LineNumber: " + lineReader.getLineNumber() + ", Line: " +line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
}
