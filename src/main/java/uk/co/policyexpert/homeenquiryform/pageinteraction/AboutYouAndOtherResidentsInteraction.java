package uk.co.policyexpert.homeenquiryform.pageinteraction;

import uk.co.policyexpert.util.BasePage;
import uk.co.policyexpert.homeenquiryform.pagecomponent.AboutYouAndOtherResidentsComponent;

public class AboutYouAndOtherResidentsInteraction extends BasePage {

    private AboutYouAndOtherResidentsComponent aboutYouAndOtherResidentsComponent;

    public AboutYouAndOtherResidentsInteraction() {
        aboutYouAndOtherResidentsComponent = new AboutYouAndOtherResidentsComponent();
    }
    public void clickBankruptcyYesButton() {
        aboutYouAndOtherResidentsComponent.getBankruptcyYesButton().click();

    }
    public void clickBankruptcyNoButton() {
        aboutYouAndOtherResidentsComponent.getBankruptcyNoButton();

    }
}
