package Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class iframe {

    @Test
    public void heatmap() {
        ChromeOptions chromeOptions = new ChromeOptions();
         chromeOptions.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/#/login");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-username")));

        WebElement login_email = driver.findElement(By.id("login-username"));
        login_email.sendKeys("wagesak103@m3player.com");

        WebElement login_password = driver.findElement(By.id("login-password"));
        login_password.sendKeys("Vwovwovwo1@@");

        WebElement signinbutton = driver.findElement(By.id("js-login-btn"));
signinbutton.click();

wait.until(ExpectedConditions.urlToBe("https://app.vwo.com/#/dashboard/get-started?accountId=1178737"));

        driver.get("https://app.vwo.com/#/analyze/heatmap?accountId=1178737");

        wait.until(ExpectedConditions.urlToBe("https://app.vwo.com/#/analyze/heatmap?accountId=1178737"));

       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"primaryUrl\"]")));

       String  parenturlid = driver.getWindowHandle();

        WebElement inputurl =   driver.findElement(By.xpath("//input[@name=\"primaryUrl\"]"));
        inputurl.clear();
        inputurl.sendKeys("https://thetestingacademy.com/");


        WebElement viewheatmapbutton = driver.findElement(By.xpath("//button[@data-qa=\"doqiroquxo\" and contains(@class,\"btn--inverted\")]"));
        viewheatmapbutton.click();

wait.until(ExpectedConditions.numberOfWindowsToBe(2));

          Set<String> tabs =     driver.getWindowHandles();

          for(String tab : tabs){
if(!(tab.equalsIgnoreCase(parenturlid))){

    driver.switchTo().window(tab);

}


          }

          wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("heatmap-iframe")));

WebElement iframe = driver.findElement(By.id("heatmap-iframe"));

          driver.switchTo().frame(iframe);
       //   wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("vwo-heatmap-journey-component")));

      //    WebElement shadowhost = driver.findElement(By.cssSelector("vwo-heatmap-journey-component"));
        //     SearchContext shadowroot = shadowhost.getShadowRoot();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.guide-skip-button")));

           WebElement Skipbutton =  driver.findElement(By.cssSelector("button.guide-skip-button"));
             Skipbutton.click();



    //      WebElement comparebutton = driver.findElement(By.xpath("//div[@id=\"compare-heatmap-open-modal\"]/*[name()=\"svg\"]"));
      //    actions.moveToElement(comparebutton).click().build().perform();


    }




}
