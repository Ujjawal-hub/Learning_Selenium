import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class File_upload {

    @Test
    public void fileupload(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");

        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.manage().window().maximize();

        webDriver.get("https://awesomeqa.com/selenium/upload.html");

        WebElement choosefilebutton = webDriver.findElement(By.id("fileToUpload"));

        String userdir = System.getProperty("user.dir");
        String complete_path = userdir +  "/src/random";

        choosefilebutton.sendKeys(complete_path);


        WebElement upload_button =  webDriver.findElement(By.name("submit"));
upload_button.click();



    }
}
