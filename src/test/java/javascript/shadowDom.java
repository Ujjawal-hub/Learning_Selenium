package javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class shadowDom {

    @Test
    public void unlockingshadowdom(){

        //document.querySelector("div#userName").shadowRoot.querySelector("div#app2").shadowRoot.querySelector("input#pizza")

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://selectorshub.com/xpath-practice-page/#content");

        JavascriptExecutor js = (JavascriptExecutor) driver;
      WebElement pizza_textbox =  (WebElement)  js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"div#app2\").shadowRoot.querySelector(\"input#pizza\");");
pizza_textbox.sendKeys("farmhouse");

   driver.quit();
    }
}
