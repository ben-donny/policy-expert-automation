package uk.co.policyexpert.component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.policyexpert.util.BasePage;

public class AboutSafetyAndSecurityComponent extends BasePage {
    public AboutSafetyAndSecurityComponent() {
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath=" //div[1]/div/div[1]/div/div[5]/div[@class='panel-body']/div[1]//div[@class='btn-group']/button[1]")
    public WebElement secureWithLocksYesButton;

    @FindBy(xpath="//div[1]/div/div[1]/div/div[5]/div[@class='panel-body']/div[1]//div[@class='btn-group']/button[2]")
    public WebElement secureWithLocksNoButton;

    public WebElement getSecureWithLocksYesButton() {
        return secureWithLocksYesButton;
    }

    public WebElement getSecureWithLocksNoButton() {
        return secureWithLocksNoButton;
    }
}
