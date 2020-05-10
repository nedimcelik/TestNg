package com.cybertek.tests.day1_intro;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {
    public static void main(String[] args) {
        //we have to enter this line every time we want to open chrome
        // hey webdrivermanager, can you make chrome ready for  me for
        // automation
        WebDriverManager.chromedriver().setup();
        //webdriver represent the browser
        //we re creating driver for chrome browser
        // new chromedriver() --> this part will open chrome browser
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver1 = new FirefoxDriver();
        driver1.get("https://www.amazon.com");
    }
}
