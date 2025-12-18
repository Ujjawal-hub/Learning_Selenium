package Actionclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class make_my_trip {

    @Test
    public void selecting_element_from_list(){

        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--incognito");

        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.manage().window().maximize();

        webDriver.get("https://www.makemytrip.com/");

        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy=\"closeModal\"]")));

        WebElement close_modal = webDriver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        close_modal.click();

        WebElement from = webDriver.findElement(By.xpath("//input[@placeholder=\"From\"]"));

        Actions actions = new Actions(webDriver);
        actions.moveToElement(from).click().sendKeys("ixc").build().perform();

    }
}
