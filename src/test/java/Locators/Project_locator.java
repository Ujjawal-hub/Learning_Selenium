package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Project_locator {



    @Test
    public void selenium_locator(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");


        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com/#/login");
        WebElement input_email = driver.findElement(By.id("login-username"));
        input_email.sendKeys("jyv@flipkart.com");


        WebElement input_password = driver.findElement(By.id("login-password"));
        input_password.sendKeys("login");

        WebElement submit_button = driver.findElement(By.id("js-login-btn"));
        submit_button.click();

        WebElement error_message = driver.findElement(By.id("js-notification-box-msg"));


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

        driver.quit();







    }

}
