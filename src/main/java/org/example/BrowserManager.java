package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Utils {

    //keep anything related to browser here

    LoadProp loadProp = new LoadProp();

    String browser = "Chrome";

    public void openBrowser() {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.out.println("Your browser is Chrome");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.out.println("Your browser is Firefox");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.out.println("Your browser is edge");
            driver = new EdgeDriver();

        } else {
            System.out.println("Your browser name is wrong:" + browser);
        }


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        //   driver.get("https://demo.nopcommerce.com/");
        driver.get(loadProp.getProperty("url"));
    }

    public void closeBrowser() {
        driver.quit();

    }
}



