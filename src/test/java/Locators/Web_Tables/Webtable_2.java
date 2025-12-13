package Locators.Web_Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class Webtable_2 {

    @Test
    public void printing_table_cells(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");

        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

       try{
           Thread.sleep(3000);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }


        WebElement username =      webDriver.findElement(By.name("username"));
        username.sendKeys("Admin");

        WebElement password = webDriver.findElement(By.name("password"));

        password.sendKeys("admin123");

        WebElement login_button = webDriver.findElement(By.className("orangehrm-login-button"));
        login_button.click();

        try{
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(webDriver.getCurrentUrl());

        WebElement adminbutton = webDriver.findElement(By.xpath("//ul[@class=\"oxd-main-menu\"]/li[1]"));
        adminbutton.click();

        System.out.println(webDriver.getCurrentUrl());

        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        List<WebElement> list_of_rows = webDriver.findElements(By.xpath("//div[@class=\"oxd-table-card\"]"));

      int row = list_of_rows.size();

      for (int i=0;i<row;i++){

       List<WebElement> list_of_column =    list_of_rows.get(i).findElement(By.tagName("div")).findElements(By.tagName("div"));

       int column = list_of_column.size();

       for(int j =0;j<column;j++){

           System.out.println(list_of_column.get(j).getText());

       }

      }

      webDriver.quit();
    }
}
