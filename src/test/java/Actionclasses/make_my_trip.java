package Actionclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class make_my_trip {

    @Test
    public void selecting_element_from_list(){

        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--incognito");

        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.manage().window().maximize();

        webDriver.get("https://www.makemytrip.com/");

        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy=\"closeModal\"]")));

        WebElement close_modal = webDriver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        close_modal.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class =\"coachmark\"]")));

        WebElement preclick =webDriver.findElement(By.xpath("//span[@class =\"coachmark\"]"));
        preclick.click();


        WebElement label_click = webDriver.findElement(By.xpath("//label[@for=\"fromCity\"]"));
        label_click.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"From\"]")));

        WebElement from = webDriver.findElement(By.xpath("//input[@placeholder=\"From\"]"));

//from.click();
//from.sendKeys("ixc");

      Actions actions = new Actions(webDriver);
       actions.moveToElement(from).click().sendKeys("ixc").build().perform();

   //   wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[contains(@id,\"react-autowhatever\")]")));
   // above wait is not required beacuse of next wait,also it is wrong as it expect single elemnt, but it is given multiple element
   // below wait is required because when you type ixc , there is list already present there ,with the name like mumbai, like famous cities,
        // but it takes time to filter the list specific to ixc , thats wahy wait until list specific to ixc appears
wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class=\"react-autosuggest__section-container react-autosuggest__section-container--first\"]"),"Chandigarh"));

        List<WebElement> list_of_places = webDriver.findElements(By.xpath("//li[contains(@id,\"react-autowhatever\")]"));

        try {
            for(WebElement option: list_of_places){

                System.out.println(option.getText());

                if(option.getText().contains("Chandigarh")){

                   // option.click();
                    actions.moveToElement(option).click().build().perform();
                }

            }
        } catch (Exception e) {
            System.out.println("sorry website got updated in between");;
        }

       webDriver.quit();

    }
}
