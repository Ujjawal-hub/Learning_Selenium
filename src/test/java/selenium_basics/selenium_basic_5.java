package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class selenium_basic_5 {

    @Test
    public void setChromeOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();
 chromeOptions.addArguments("--incognito");
 chromeOptions.addArguments("--window-size=1920,600");

        WebDriver webDriver = new ChromeDriver(chromeOptions);
         webDriver.get("https://chatgpt.com");


       // webDriver.clone();      it will close the current tab ,if another tab is open then session will not end
        webDriver.quit();        //   it will end the session


    }


}
