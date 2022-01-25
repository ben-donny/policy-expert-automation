package uk.co.policyexpert.interaction;

import uk.co.policyexpert.util.BasePage;
import uk.co.policyexpert.component.AboutJointPolicyComponent;

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
