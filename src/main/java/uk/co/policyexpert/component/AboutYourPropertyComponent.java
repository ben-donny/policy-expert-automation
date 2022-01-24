package uk.co.policyexpert.component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.policyexpert.BasePage;

public class AboutYourPropertyComponent extends BasePage {
    public AboutYourPropertyComponent() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//div[1]/div/div[1]/div/div[3]/div[@class='panel-body']/div[1]//div[@class='lookup']/input")
    public WebElement addressField;

    public WebElement getAddressField() {
        return addressField;
    }
}
