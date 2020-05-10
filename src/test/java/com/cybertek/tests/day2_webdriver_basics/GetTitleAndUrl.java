package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrl {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com");

        //getting title with selenium
        //first shortcut to introduce local variable
        // alttakinin sag tarafini yazdiktan sonra alt + enter + enter
        String title = driver.getTitle();

        //soutv+enter diyince en son olusturulan seyi yani bizde titlei verir alttaki gibi
        System.out.println("title = " + title);

        // getCurrentUrl()--> gets the curren url of the page
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        //get page source
        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);



    }
}
