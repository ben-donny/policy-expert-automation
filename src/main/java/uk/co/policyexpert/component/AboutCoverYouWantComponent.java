package uk.co.policyexpert.component;

import org.openqa.selenium.support.PageFactory;
import uk.co.policyexpert.BasePage;

public class AboutCoverYouWantComponent extends BasePage {
    public AboutCoverYouWantComponent() {
        PageFactory.initElements(driver, this);
    }
}
