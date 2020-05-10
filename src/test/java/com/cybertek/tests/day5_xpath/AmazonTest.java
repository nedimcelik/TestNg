package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {
    /**
     * TASK
     * go to amazon
     * search for selenium
     * click search button
     * print 1-48 of 304 results for "selenium"
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.sendKeys("Selenium");

        Thread.sleep(2000);

        WebElement searchButton = driver.findElement(By.xpath("//input[@value='Go']"));
        searchButton.click();

        WebElement searchResult = driver.findElement(By.xpath("//span[contains(text(),'results for')]"));
        System.out.println("searchResult = " + searchResult.getText());


    }
}
