package uk.co.policyexpert.homeenquiryform.pagecomponent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.policyexpert.util.BasePage;

public class AboutInsuranceHistoryComponent extends BasePage {
    public AboutInsuranceHistoryComponent() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//div[@class='row']/div[1]/div/div[1]/div/div[7]/div[@class='panel-body']/div[1]//select[@class='form-control']")
    public WebElement homeInsuranceHistoryField;

    public WebElement getHomeInsuranceHistoryField() {
        return homeInsuranceHistoryField;

    }
}
