package uk.co.policyexpert.steps;

import uk.co.policyexpert.homeenquiryform.pageinteraction.AboutYouAndOtherResidentsInteraction;

public class AboutYouAndOtherResidentsSteps {
    private AboutYouAndOtherResidentsInteraction aboutYouAndOtherResidentsInteraction;

    public AboutYouAndOtherResidentsSteps() {
        this.aboutYouAndOtherResidentsInteraction = new AboutYouAndOtherResidentsInteraction();
    }

    public void bankruptcyNoButton(){
        aboutYouAndOtherResidentsInteraction.clickBankruptcyNoButton();
    }
}
