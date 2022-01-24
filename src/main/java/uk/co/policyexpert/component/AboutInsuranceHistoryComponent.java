package uk.co.policyexpert.component;

import org.openqa.selenium.support.PageFactory;
import uk.co.policyexpert.BasePage;

public class AboutInsuranceHistoryComponent extends BasePage {
    public AboutInsuranceHistoryComponent() {
        PageFactory.initElements(driver, this);
    }
}
