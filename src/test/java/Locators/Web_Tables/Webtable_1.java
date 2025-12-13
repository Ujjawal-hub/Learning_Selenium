package Locators.Web_Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Webtable_1 {

    @Test
    public void Webtable_cells(){

        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.addArguments("--incognito");

        WebDriver webDriver = new ChromeDriver(chromeOptions);

        webDriver.get("https://awesomeqa.com/webtable.html");

        int row = webDriver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int column = webDriver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();

for(int i=2;i<=row;i++){

  for(int j =1;j<=column;j++){

      String xpathExpression = String.format("//table[@id=\"customers\"]/tbody/tr[%d]/td[%d]",i,j);
   WebElement webElement =  webDriver.findElement(By.xpath(xpathExpression));
     String text =  webElement.getText();
      System.out.println(text);
     if(text.contains("Helen Bennett")){
         System.out.println("-----");
       String sibling =  webDriver.findElement(By.xpath(xpathExpression+"/following-sibling::td")).getText();
         System.out.println("Helen Bennett is from "+sibling);
         System.out.println("----");
     }


  }

        }
    }




}
