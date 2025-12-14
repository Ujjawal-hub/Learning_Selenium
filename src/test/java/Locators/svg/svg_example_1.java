package Locators.svg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class svg_example_1 {

    @Test

    public void search_icon(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://www.flipkart.com/");
         WebElement search_bar =  driver.findElement(By.name("q"));
         search_bar.sendKeys("iphone");


       WebElement search_icon = driver.findElement(By.xpath("//*[local-name()=\"svg\"]"));

       search_icon.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");

        driver.quit();


    }
}
