package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SelIntroduction {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //Invoking Browser
        //Chrome - ChromeDriver -> Methods close
        //Firefox - FirefoxDriver -> Methods Close
        //safari SaariDrier ->methods close get
        //WebDriver close get
        //WebDriver methods + class methods
        //System.setProperty("Webdriver.chrome.driver"));

        //Chromedriver.exe -> Chrome browser
        WebDriverManager.chromedriver().setup();

        //Webdriver.Chrome.driver -> value of path
       // WebDriver driver = new ChromeDriver();

        //firefox launch
        //geckodriver
        //Webdriver.gecko.diver
      //  WebDriver driver1 = new FirefoxDriver();

        WebDriver driver = new EdgeDriver();



        driver.get("https://rahulshettyacademy.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
      //  driver.close();
       // driver.quit();


    }
}
