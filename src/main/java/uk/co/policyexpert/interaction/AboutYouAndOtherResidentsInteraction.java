package uk.co.policyexpert.interaction;

import uk.co.policyexpert.BasePage;
import uk.co.policyexpert.component.AboutYouAndOtherResidentsComponent;

public class AboutYouAndOtherResidentsInteraction extends BasePage {

    private AboutYouAndOtherResidentsComponent aboutYouAndOtherResidentsComponent;

    public AboutYouAndOtherResidentsInteraction() {
        this.aboutYouAndOtherResidentsComponent = new AboutYouAndOtherResidentsComponent();
    }
    public void clickBankruptcyYesButton() {
        aboutYouAndOtherResidentsComponent.getBankruptcyYesButton().click();

    }
    public void clickBankruptcyNoButton() {
        aboutYouAndOtherResidentsComponent.getBankruptcyNoButton();

    }
}
