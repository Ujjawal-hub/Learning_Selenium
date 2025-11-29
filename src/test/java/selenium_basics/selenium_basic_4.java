package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class selenium_basic_4 {


    @Test
    public void selenium_basic_nanvigate(){

        WebDriver chrome = new FirefoxDriver();
        chrome.get("https://www.google.com");

        chrome.navigate().to("https://f1tv.formula1.com");
        chrome.navigate().back();
        chrome.quit();

    }
}
