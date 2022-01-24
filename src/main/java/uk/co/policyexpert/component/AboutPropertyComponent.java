package uk.co.policyexpert.component;

import org.openqa.selenium.support.PageFactory;
import uk.co.policyexpert.BasePage;

public class AboutPropertyComponent extends BasePage {
    public AboutPropertyComponent() {
        PageFactory.initElements(driver, this);
    }
}
