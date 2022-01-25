package uk.co.policyexpert.homeenquiryform.pageinteraction;

import uk.co.policyexpert.util.BasePage;
import uk.co.policyexpert.homeenquiryform.pagecomponent.AboutSafetyAndSecurityComponent;

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

