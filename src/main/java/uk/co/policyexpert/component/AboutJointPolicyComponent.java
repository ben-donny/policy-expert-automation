package uk.co.policyexpert.component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.policyexpert.util.BasePage;

public class AboutJointPolicyComponent extends BasePage {
    public AboutJointPolicyComponent() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//div[@class='row']/div[1]/div/div[1]/div/div[6]/div[@class='panel-body']/div//div[@class='btn-group']/button[1]")
    public WebElement jointPolicyholdersYesButton;

    @FindBy(xpath="//div[@class='row']/div[1]/div/div[1]/div/div[6]/div[@class='panel-body']/div//div[@class='btn-group']/button[2]")
    public WebElement jointPolicyholdersNoButton;

    public WebElement getJointPolicyholdersYesButton() {
        return jointPolicyholdersYesButton;
    }

    public WebElement getJointPolicyholdersNoButton() {
        return jointPolicyholdersNoButton;
    }
}
