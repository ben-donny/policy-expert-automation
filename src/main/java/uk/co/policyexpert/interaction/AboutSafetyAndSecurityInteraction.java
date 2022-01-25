package uk.co.policyexpert.interaction;

import uk.co.policyexpert.util.BasePage;
import uk.co.policyexpert.component.AboutSafetyAndSecurityComponent;

public class AboutSafetyAndSecurityInteraction  extends BasePage {

    private AboutSafetyAndSecurityComponent aboutSafetyAndSecurityComponent;

    public AboutSafetyAndSecurityInteraction() {
        aboutSafetyAndSecurityComponent = new AboutSafetyAndSecurityComponent();
    }

    public void clickOnSecureWithLocksYesButton() {
        aboutSafetyAndSecurityComponent.getSecureWithLocksYesButton().click();

    }

    public void clickOnSecureWithLocksNoButton() {
        aboutSafetyAndSecurityComponent.getSecureWithLocksNoButton().click();

    }
}

