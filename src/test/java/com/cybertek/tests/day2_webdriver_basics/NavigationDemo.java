package com.cybertek.tests.day2_webdriver_basics;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

    public static void main(String[] args) throws InterruptedException {
        //setting up my chrome browser for automation
        WebDriverManager.chromedriver().setup();
        //creating driver object for chrome
        WebDriver driver = new ChromeDriver();
        //navigate to Google
        driver.get("https://www.google.com");
        //navigate to another website with different selenium method
        driver.navigate().to("https://www.facebook.com");
        //wait 3 second here then go back
        Thread.sleep(3000);
        //how to go back to google after we navigate to facebook
        //goes back to previous page
        driver.navigate().back();

        //goes forward after goes back
        driver.navigate().forward();

        Thread.sleep(2000);

        //refresh the website
        driver.navigate().refresh();
    }
}
