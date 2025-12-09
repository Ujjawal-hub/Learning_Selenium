package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Project_locator_2 {
   @Test
    public void selenium_locator_2(){

       ChromeOptions chromeOptions = new ChromeOptions();
       chromeOptions.addArguments("--incognito");

       WebDriver driver = new ChromeDriver(chromeOptions);
       driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();
      WebElement trail_element =  driver.findElement(By.linkText("Start a free trial"));
      trail_element.click();

       Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

      WebElement email_element = driver.findElement(By.id("page-v1-step1-email"));

      email_element.sendKeys("abc");

      WebElement checkbox_element = driver.findElement(By.id("page-free-trial-step1-cu-gdpr-consent-checkbox"));

      checkbox_element.click();


      WebElement button = driver.findElement(By.tagName("button"));
      button.click();

      WebElement error_message = driver.findElement(By.className("invalid-reason"));

      Assert.assertEquals(error_message.getText(),"The email address you entered is incorrect.");

      try{
          Thread.sleep(3000);

      } catch (InterruptedException e) {
          throw new RuntimeException(e);
      }

      driver.quit();


   }

}
