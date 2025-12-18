package Actionclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class mouse {

    @Test
    public void cursor(){

        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--incognito");

        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.manage().window().maximize();

        webDriver.get("https://www.spicejet.com/");

        WebElement from = webDriver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/descendant::input"));

        Actions actions = new Actions(webDriver);

actions.moveToElement(from).click().sendKeys("blr").build().perform();

webDriver.quit();



    }

}
