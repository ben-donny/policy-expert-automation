package uk.co.policyexpert.component;

import org.openqa.selenium.support.PageFactory;
import uk.co.policyexpert.BasePage;

public class AboutJointPolicyComponent extends BasePage {
    public AboutJointPolicyComponent() {
        PageFactory.initElements(driver, this);
    }
}
