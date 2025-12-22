package Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.Set;

public class opening_differnt_tab {

    @Test
    public void next_tab() {

        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://the-internet.herokuapp.com/windows");

        String parent_id = driver.getWindowHandle();

        WebElement link_text = driver.findElement(By.xpath("//a[text()=\"Click Here\"]"));
        link_text.click();

        Set<String> allids =  driver.getWindowHandles();

        for(String id: allids){

            System.out.println("current id is "+id);
            driver.switchTo().window(id);


            if(driver.getPageSource().contains("New Window")){

                System.out.println("test case passed");

            }




        }

driver.quit();


    }

}
