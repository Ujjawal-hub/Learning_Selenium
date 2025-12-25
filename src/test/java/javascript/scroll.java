package javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class scroll {

    @Test
    public void javascroll(){


        ChromeOptions chromeOptions =new ChromeOptions();

        chromeOptions.addArguments("--incognito");


        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

        driver.get("https://selectorshub.com/xpath-practice-page/");

        JavascriptExecutor js  = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,5000)");

        String url =     js.executeScript("return document.URL").toString();

        System.out.println(url);

        js.executeScript("window.location = 'https://f1tv.formula1.com/';");

        driver.quit();

    }

}
