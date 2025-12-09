package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class selenium_project_1 {


    @Test
    public void verifying_katalon_tag(){

        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://katalon-demo-cura.herokuapp.com");
        webDriver.getTitle();

        Assert.assertEquals(webDriver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/");
        if(webDriver.getPageSource().contains("CURA Healthcare Service")){

            Assert.assertTrue(true);

        }

else{

    Assert.fail();

        }


webDriver.quit();
    }


}
