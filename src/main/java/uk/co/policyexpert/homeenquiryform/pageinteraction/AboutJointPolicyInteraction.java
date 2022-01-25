package uk.co.policyexpert.homeenquiryform.pageinteraction;

import uk.co.policyexpert.util.BasePage;
import uk.co.policyexpert.homeenquiryform.pagecomponent.AboutJointPolicyComponent;

public class AboutJointPolicyInteraction extends BasePage {
    private AboutJointPolicyComponent aboutJointPolicyComponent;

    public AboutJointPolicyInteraction() {
      aboutJointPolicyComponent = new AboutJointPolicyComponent();
    }
    public void clickOnJointPolicyholdersYesButton() {
        aboutJointPolicyComponent.getJointPolicyholdersYesButton().click();

    }
    public void clickOnJointPolicyholdersNoButton() {
        aboutJointPolicyComponent.getJointPolicyholdersNoButton().click();

    }
}
