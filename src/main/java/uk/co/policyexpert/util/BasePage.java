package uk.co.policyexpert.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;


public class BasePage {

    public static WebDriver driver;

    public void createDriver(String browserType, String url) throws Exception{

        switch (browserType){
            case "chrome":
                log("Test starts running in google chrome browser.");
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.home") +
                        "/git/policy-expert-project/chromedriver");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get(url);
                break;

            case "firefox":
                log("Test starts running in firefox browser.");
                System.setProperty("webdriver.gecko.driver",System.getProperty("user.home") +
                        "/git/policy-expert-project/geckodriver");
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                driver.get(url);
                break;

            case "edge":
                log("Test starts running in microsoft edge.");
                System.setProperty("webdriver.edge.driver",System.getProperty("user.home") +
                        "/git/policy-expert-project/msedgedriver");
                driver = new EdgeDriver();
                driver.manage().window().maximize();
                driver.get(url);
                break;
            default:
                log("browser : " + browserType + " is invalid, launching chrome as browser of choice..");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get(url);
        }

    }

    /*
    Wait i is in seconds using Thread.sleep
	 *
     */
    public static void wait(int i) {
        try {
            int a = i * 1000;
            Thread.sleep(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getPageTitle(){
        String title = driver.getTitle();
        return title;
    }

    public static void log(String msg) {
        System.out.println(msg);
        Reporter.log(msg);
    }

    public void closeDriver(){
        driver.close();
        log("Driver closed");
    }

    public void clickOncompareQuotes(){
        driver.findElement(By.cssSelector("[data-testid='submit']")).click();
    }

    public void selectFromDropdownByHTMLAttribute(final WebElement dropdown, final String visibleText) {
        new Select(dropdown).selectByVisibleText(visibleText);
    }
}


