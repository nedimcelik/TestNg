package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com");
        // wait 3 seconds
        Thread.sleep(3000);

        //close the current tab/window
        driver.close();

        driver = new ChromeDriver();    // close sonrasinda get i kullanabilmek icin

        driver.get("http://practice.cybertekschool.com/open_new_tab");
        Thread.sleep(5000);

        //close all tabs doesnt matter one or more
        driver.quit();

    }

}
