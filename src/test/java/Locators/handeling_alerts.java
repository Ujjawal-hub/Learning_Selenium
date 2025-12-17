package Locators;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class handeling_alerts {

    @Test

 public void alerts() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

       WebElement jsprompt = driver.findElement(By.cssSelector("button[onclick=\"jsPrompt()\"]"));
        jsprompt.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        String name = "huh";

        alert.sendKeys(name);
        alert.accept();

        WebElement result = driver.findElement(By.id("result"));

        Assert.assertEquals(result.getText(),"You entered: "+name);


        driver.quit();


    }

}
