package uk.co.policyexpert.component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.policyexpert.BasePage;

public class AboutJointPolicyComponent extends BasePage {
    public AboutJointPolicyComponent() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//div[@class='row']/div[1]/div/div[1]/div/div[6]/div[@class='panel-body']/div//div[@class='btn-group']/button[1]")
    public WebElement aboutJointPolicyholdersYesButton;

    @FindBy(xpath="//div[@class='row']/div[1]/div/div[1]/div/div[6]/div[@class='panel-body']/div//div[@class='btn-group']/button[2]")
    public WebElement   aboutJointPolicyholdersNoButton;

    public WebElement getAboutJointPolicyholdersYesButton() {
        return aboutJointPolicyholdersYesButton;
    }

    public WebElement getAboutJointPolicyholdersNoButton() {
        return aboutJointPolicyholdersNoButton;
    }
}
