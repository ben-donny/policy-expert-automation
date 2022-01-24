package uk.co.policyexpert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InsuranceTest {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://insurance.policyexpert.co.uk/home";
        driver.manage().window().maximize();
        driver.get(baseUrl);

       // WebElement element = driver.findElement(By.cssSelector(".form-group.has-error.question-select .form-control"));
        //element.click();
        //Select dropdownSelect = new Select(driver.findElement(By.xpath("//div/div/div/div/div/div/select[@data-di-id='di-id-f0e5ef83-5894a860']")));
        Select dropdownSelect = new Select(driver.findElement(By.xpath("//div[@class='panel-body']/div[1]//select[@class='form-control']")));

       // Thread.sleep(3000);

        dropdownSelect.selectByVisibleText("Miss");

       driver.findElement(By.xpath("//div[@class='panel-body']/div[2]//input")).clear();
       driver.findElement(By.xpath("//div[@class='panel-body']/div[2]//input")).sendKeys("userName");
       driver.findElement(By.xpath("//div[@class='panel-body']/div[3]//input")).clear();
       driver.findElement(By.xpath("//div[@class='panel-body']/div[3]//input")).sendKeys("password");

        Select selectDay = new Select(driver.findElement(By.xpath("//div[@class='row']/div[1]/select[@class='form-control']")));
        selectDay.selectByVisibleText("12");

        Select selectMonth = new Select(driver.findElement(By.xpath("//div[@class='row']/div[2]/select[@class='form-control']")));
        selectMonth.selectByVisibleText("March");

        Select selectYear = new Select(driver.findElement(By.xpath("//div[@class='row']/div[3]/select[@class='form-control']")));
        selectYear.selectByVisibleText("2005");








    }
}
