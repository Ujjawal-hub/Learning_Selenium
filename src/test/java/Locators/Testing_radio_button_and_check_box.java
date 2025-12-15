package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Testing_radio_button_and_check_box {

    @Test

    public void selenium_radio_box(){

        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://awesomeqa.com/practice.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));


        WebElement  name =      driver.findElement(By.name("firstname"));
        name.sendKeys("aryan");

        WebElement gender =driver.findElement(By.id("sex-1"));
        gender.click();


        WebElement profession = driver.findElement(By.id("profession-1"));
        profession.click();

driver.quit();

    }
}
