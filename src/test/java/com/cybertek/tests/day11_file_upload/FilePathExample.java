package com.cybertek.tests.day11_file_upload;

import org.testng.annotations.Test;

public class FilePathExample {

    @Test
    public void test(){
        //  /Users/jamaldemir/Desktop/EU2TestNGProject/src/test/resources/testfile.txt

        //getting project location/path dynamically
        String projectPath = System.getProperty("user.dir");
        //testfile imin path i (path from content root)

        String relativePath = "src/test/resources/testfile.txt";

        String filePath = projectPath+"/"+relativePath;
        System.out.println("filePath = " + filePath);
    }
}