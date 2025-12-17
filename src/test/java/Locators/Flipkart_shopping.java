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
import java.util.List;

public class Flipkart_shopping {
    @Test
    public void flipkart_shop_list(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

        driver.get("https://www.flipkart.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));

        WebElement search_box = driver.findElement(By.name("q"));
        search_box.sendKeys("macmini");



        List<WebElement> list_of_svg = driver.findElements(By.xpath("//*[name()=\"svg\"]"));

        WebElement search_icon = list_of_svg.get(0);
        search_icon.click();





        while(2>1){



            System.out.println(driver.getCurrentUrl());

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@data-id,\"C\") or contains(@data-id,\"M\")]")));

            List<WebElement> list_of_items = driver.findElements(By.xpath("//div[contains(@data-id,\"C\") or contains(@data-id,\"M\")]"));

            for (WebElement w : list_of_items) {

                try {

                    WebElement text_element = w.findElement(By.xpath(".//div/a[@class=\"pIpigb\"]"));
                    System.out.println(text_element.getText());

                } catch (Exception e) {
                    System.out.println("some elements got hidden due to page updation in between");
                }
            }

            List<WebElement> next_button = driver.findElements(By.xpath("//span[text()=\"Next\"]"));



            if(next_button.isEmpty()){

           break;
            }

            String old_url = driver.getCurrentUrl();

         next_button.get(0).click();



            wait.until(ExpectedConditions.not(ExpectedConditions.urlToBe(old_url)));

            System.out.println();
            System.out.println();
            System.out.println("----list from next page ---------");

        }

        driver.quit();
    }

}


