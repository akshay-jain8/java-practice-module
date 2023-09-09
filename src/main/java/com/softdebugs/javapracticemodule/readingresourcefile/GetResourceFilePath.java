package com.softdebugs.javapracticemodule.readingresourcefile;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class GetResourceFilePath {

    public void readFile(String fileName){
        String filePath = null;
        URL url = getClass().getResource(fileName);
        if (url != null) {
            filePath = url.getPath();
        }
        assert filePath != null : "file path is not found";
        File file = new File(filePath);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
