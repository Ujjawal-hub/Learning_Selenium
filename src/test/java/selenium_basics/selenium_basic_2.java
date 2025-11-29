package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class selenium_basic_2 {


    @Test
    public void selenium_testcase_basic(){

        WebDriver chrome = new ChromeDriver();

        chrome.get("https://f1tv.formula1.com/");
        chrome.manage().window().maximize();
        Assert.assertEquals(chrome.getCurrentUrl(),"https://f1tv.formula1.com/");


        assertThat(chrome.getCurrentUrl()).isNotNull().isEqualTo("https://f1tv.formula1.com/");

        chrome.quit();
    }


}
