package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium_basic_1 {

    public static void main(String[] args) {

        WebDriver firefox  =  new FirefoxDriver();

        firefox.get("https://f1tv.formula1.com");
        System.out.println(firefox.getTitle());
        System.out.println();
        System.out.println(firefox.getCurrentUrl());
        System.out.println();

        System.out.println(firefox.getPageSource());




    }

}
