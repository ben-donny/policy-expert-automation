package uk.co.policyexpert.steps;

import uk.co.policyexpert.homeenquiryform.pageinteraction.AboutYourPropertyInteraction;

public class AboutYourPropertySteps {
    private AboutYourPropertyInteraction aboutYourPropertyInteraction;

    public AboutYourPropertySteps() {
        this.aboutYourPropertyInteraction = new AboutYourPropertyInteraction();
    }

    public void addPropertyAddress(String address){
        aboutYourPropertyInteraction.enterAddress(address);
    }
}
