package uk.co.policyexpert.component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.policyexpert.BasePage;

public class AboutYouComponent extends BasePage {
    public AboutYouComponent() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//div[@class='panel-body']/div[1]//select[@class='form-control']")
    public WebElement selectTitleField;

    @FindBy(xpath="//div[@class='panel-body']/div[2]//input")
    private WebElement firstNameField;

    @FindBy(xpath="//div[@class='panel-body']/div[3]//input")
    private WebElement lastNameField;


    @FindBy(xpath="//div[@class='row']/div[1]/select[@class='form-control']")
    private WebElement birthDayField;

    @FindBy(xpath="//div[@class='row']/div[2]/select[@class='form-control']")
    private WebElement birthMonthField;

    @FindBy(xpath="//div[@class='row']/div[3]/select[@class='form-control']")
    private WebElement birthYearField;

    @FindBy(xpath="//div[@class='row']/div[1]/div/div[1]/div/div[1]/div[@class='panel-body']/div[5]//select[@class='form-control']")
    private WebElement maritalStatusField;

    @FindBy(xpath="//div[@class='panel-body']/div[6]//div[@class='lookup']/input")
    private WebElement occupationField;

    @FindBy(xpath="//div[@class='panel-body']/div[7]//div[@class='btn-group']/button[1]")
    private WebElement anotherOccupationYesButton;

    @FindBy(xpath="//div[@class='panel-body']/div[7]//div[@class='btn-group']/button[2]")
    private WebElement anotherOccupationNoButton;

    @FindBy(xpath="//div[@class='panel-body']/div[8]//div[@class='lookup']/input")
    private WebElement anotherOccupationField;

    @FindBy(xpath="//div[@class='panel-body']/div[8]//input")
    private WebElement mainPhoneNumberField;

    @FindBy(xpath="//div[@class='panel-body']/div[9]//input")
    private WebElement emailAddressField;

    public WebElement getSelectTitleField() {
        return selectTitleField;
    }

    public WebElement getFirstNameField() {
        return firstNameField;
    }

    public WebElement getLastNameField() {
        return lastNameField;
    }

    public WebElement getBirthDayField() {
        return birthDayField;
    }

    public WebElement getBirthMonthField() {
        return birthMonthField;
    }

    public WebElement getBirthYearField() {
        return birthYearField;
    }

    public WebElement getMaritalStatusField() {
        return maritalStatusField;
    }

    public WebElement getOccupationField() {
        return occupationField;
    }

    public WebElement getAnotherOccupationYesButton() {
        return anotherOccupationYesButton;
    }

    public WebElement getMainPhoneNumberField() {
        return mainPhoneNumberField;
    }

    public WebElement getEmailAddressField() {
        return emailAddressField;
    }

    public WebElement getAnotherOccupationNoButton() {
        return anotherOccupationNoButton;
    }

    public WebElement getAnotherOccupationField() {
        return anotherOccupationField;
    }
}
