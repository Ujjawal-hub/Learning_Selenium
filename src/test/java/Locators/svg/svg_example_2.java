package Locators.svg;

import net.bytebuddy.build.ToStringPlugin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class svg_example_2 {

    @Test
    public void svg_map(){

        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.amcharts.com/svg-maps/?map=india");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement tripura =  driver.findElement(By.xpath("//*[local-name()=\"svg\"]/*[name()=\"g\"][7]/*[name()=\"g\"]/*[name()=\"g\"]//*[name()=\"path\"][@aria-label=\"Tripura  \"]"));



     tripura.click();
      //  List<WebElement> states =  driver.findElements(By.xpath("//*[local-name()=\"svg\"]/*[name()=\"g\"][7]/*[name()=\"g\"]/*[name()=\"g\"]//*[name()=\"path\"]"));


//for(WebElement state : states) {
 //   String label = state.getAttribute("aria-label");

  //  System.out.println(label);

  //  if (label.equalsIgnoreCase("Tripura  ")) {

  //      state.click();
  //  }

//}
     driver.quit();



    }

}
