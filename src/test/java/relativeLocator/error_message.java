package relativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class error_message {

    @Test

    public void belowlocator(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");


        WebElement iframe = driver.findElement(By.id("result"));
        driver.switchTo().frame(iframe);

        WebElement button = driver.findElement(By.xpath("//button[text()=\"Submit\"]"));
button.click();

WebElement errormessage = driver.findElement(with(By.tagName("small")).below(By.id("username")));

        System.out.println(errormessage.getText());

        Assert.assertEquals(errormessage.getText(),"Username must be at least 3 characters");
driver.quit();
    }
}
