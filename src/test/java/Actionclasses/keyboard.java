package Actionclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;

public class keyboard {

    @Test
    public void keys(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");

        WebDriver webDriver =new ChromeDriver(chromeOptions);
        webDriver.manage().window().maximize();

        webDriver.get("https://awesomeqa.com/practice.html");

       WebElement firstname = webDriver.findElement(By.name("firstname"));

        Actions actions =new Actions(webDriver);

        actions.keyDown(Keys.SHIFT).sendKeys(firstname,"nothing").keyUp(Keys.SHIFT).build().perform();

webDriver.quit();



    }
}
