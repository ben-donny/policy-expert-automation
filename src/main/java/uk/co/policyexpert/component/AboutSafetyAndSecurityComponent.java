package uk.co.policyexpert.component;

import org.openqa.selenium.support.PageFactory;
import uk.co.policyexpert.BasePage;

public class AboutSafetyAndSecurityComponent extends BasePage {
    public AboutSafetyAndSecurityComponent() {
        PageFactory.initElements(driver, this);

    }
}
