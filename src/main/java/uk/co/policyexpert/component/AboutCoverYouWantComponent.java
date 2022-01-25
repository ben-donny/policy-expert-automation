package uk.co.policyexpert.component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.policyexpert.util.BasePage;

public class AboutCoverYouWantComponent extends BasePage {
    public AboutCoverYouWantComponent() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//div[@class='row']/div[1]/div/div[1]/div/div[8]/div[@class='panel-body']/div[1]//input")
    public WebElement coverStartDateField;

    public WebElement getCoverStartDateField() {
        return coverStartDateField;
    }
}
