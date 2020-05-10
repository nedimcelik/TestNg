package com.cybertek.tests.day11_file_upload;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadTest {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    /**
     *  go to website http://practice.cybertekschool.com/upload
     *  upload file.txt
     *  click upload
     *  verify file name is displayed in the next page
     */
    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/upload");

        //locating choosefile button
        WebElement chooseFile = driver.findElement(By.name("file"));
        //sending file
        chooseFile.sendKeys("C:\\Users\\CANGARDAS\\Desktop\\file.txt");
        //   yukardaki path de cift ters yerine tek normal slash da oluyo

        //clicking upload button
        driver.findElement(By.id("file-submit")).click();

        //getting name of the file
        String actualFilename = driver.findElement(By.id("uploaded-files")).getText();

        //verify file name is file.txt
        Assert.assertEquals(actualFilename,"file.txt");

    }

    @Test
    public void test2(){
        driver.get("http://practice.cybertekschool.com/upload");

        //locating choosefile button
        WebElement chooseFile = driver.findElement(By.name("file"));

        //sending file
        String projectPath = System.getProperty("user.dir");
        String relativePath = "src/test/resources/testfile.txt";
        String filePath = projectPath+"/"+relativePath;

        chooseFile.sendKeys(filePath);
        //clicking upload button
        driver.findElement(By.id("file-submit")).click();

        //getting name of the file
        String actualFilename = driver.findElement(By.id("uploaded-files")).getText();
        //verify file name is file.txt
        Assert.assertEquals(actualFilename,"testfile.txt");
    }
}