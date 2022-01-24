package uk.co.policyexpert.component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.policyexpert.BasePage;

public class AboutSafetyAndSecurityComponent extends BasePage {
    public AboutSafetyAndSecurityComponent() {
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath=" //div[1]/div/div[1]/div/div[5]/div[@class='panel-body']/div[1]//div[@class='btn-group']/button[1]")
    public WebElement   aboutSafetyAndSecurityYesButton;

    @FindBy(xpath="//div[1]/div/div[1]/div/div[5]/div[@class='panel-body']/div[1]//div[@class='btn-group']/button[2]")
    public WebElement   aboutSafetyAndSecurityNoButton;

    public WebElement getAboutSafetyAndSecurityYesButton() {
        return aboutSafetyAndSecurityYesButton;
    }

    public WebElement getAboutSafetyAndSecurityNoButton() {
        return aboutSafetyAndSecurityNoButton;
    }
}
