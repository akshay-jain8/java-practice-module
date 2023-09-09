package com.softdebugs.javapracticemodule.readingresourcefile;

import java.net.URISyntaxException;

public class MainClass {
    public static void main(String[] args) throws URISyntaxException {
        GetResourceFilePath getResourceFilePath = new GetResourceFilePath();
        getResourceFilePath.readFile("/text.txt");
    }
}
