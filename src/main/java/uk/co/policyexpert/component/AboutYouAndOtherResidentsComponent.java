package uk.co.policyexpert.component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.policyexpert.BasePage;

public class AboutYouAndOtherResidentsComponent extends BasePage {

    public AboutYouAndOtherResidentsComponent() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//div[1]/div/div[1]/div/div[2]/div[@class='panel-body']/div[1]//div[@class='btn-group']/button[1]")
    public WebElement bankruptcyYesButton;

    @FindBy(xpath="//div[1]/div/div[1]/div/div[2]/div[@class='panel-body']/div[2]//div[@class='btn-group']/button[1]")
    public WebElement countyCourtJudgementYesButton;

    @FindBy(xpath="//div[1]/div/div[1]/div/div[2]/div[@class='panel-body']/div[3]//div[@class='btn-group']/button[1]")
    public WebElement insuranceDeclinedYesButton;

    @FindBy(xpath="//div[1]/div/div[1]/div/div[2]/div[@class='panel-body']/div[4]//div[@class='btn-group']/button[1]")
    public WebElement insuranceCancelledYesButton;

    @FindBy(xpath="//div[1]/div/div[1]/div/div[2]/div[@class='panel-body']/div[5]//div[@class='btn-group']/button[1]")
    public WebElement criminalConvictionsYesButton;

    @FindBy(xpath="//div[1]/div/div[1]/div/div[2]/div[@class='panel-body']/div[1]//div[@class='btn-group']/button[2]")
    private WebElement bankruptcyNoButton;

    @FindBy(xpath="//div[1]/div/div[1]/div/div[2]/div[@class='panel-body']/div[2]//div[@class='btn-group']/button[2]")
    private WebElement countyCourtJudgementNoButton;

    @FindBy(xpath="//div[1]/div/div[1]/div/div[2]/div[@class='panel-body']/div[3]//div[@class='btn-group']/button[2]")
    private WebElement insuranceDeclinedNoButton;

    @FindBy(xpath="//div[1]/div/div[1]/div/div[2]/div[@class='panel-body']/div[4]//div[@class='btn-group']/button[2]")
    private WebElement insuranceCancelledNoButton;

    @FindBy(xpath="//div[1]/div/div[1]/div/div[2]/div[@class='panel-body']/div[5]//div[@class='btn-group']/button[2]")
    private WebElement criminalConvictionsNoButton;

    public WebElement getBankruptcyYesButton() {
        return bankruptcyYesButton;
    }

    public WebElement getCountyCourtJudgementYesButton() {
        return countyCourtJudgementYesButton;
    }

    public WebElement getInsuranceDeclinedYesButton() {
        return insuranceDeclinedYesButton;
    }

    public WebElement getInsuranceCancelledYesButton() {
        return insuranceCancelledYesButton;
    }

    public WebElement getCriminalConvictionsYesButton() {
        return criminalConvictionsYesButton;
    }

    public WebElement getBankruptcyNoButton() {
        return bankruptcyNoButton;
    }

    public WebElement getCountyCourtJudgementNoButton() {
        return countyCourtJudgementNoButton;
    }

    public WebElement getInsuranceDeclinedNoButton() {
        return insuranceDeclinedNoButton;
    }

    public WebElement getInsuranceCancelledNoButton() {
        return insuranceCancelledNoButton;
    }

    public WebElement getCriminalConvictionsNoButton() {
        return criminalConvictionsNoButton;
    }
}



