package relativeLocator;

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

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class AQI {

    @Test

    public void list_of_worlds_most_polluted_city(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(@class,\"location-name\")]/p")));

        List<WebElement> list_of_polluted_cities = driver.findElements(By.xpath("//div[contains(@class,\"location-name\")]/p"));




        for(WebElement city:list_of_polluted_cities){


            WebElement rank = driver.findElement(with(By.xpath("//p[contains(@class,\"location-rank\")]")).toLeftOf(city));
            WebElement  aqi_level = driver.findElement(with(By.xpath("//div[contains(@class,\"aqi-level\")]/span")).toRightOf(city));

            System.out.println(rank.getText() +" | "+city.getText()+" | "+aqi_level.getText() );


        }

driver.quit();
    }





}
