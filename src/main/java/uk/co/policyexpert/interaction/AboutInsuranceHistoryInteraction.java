package uk.co.policyexpert.interaction;

import uk.co.policyexpert.util.BasePage;
import uk.co.policyexpert.component.AboutInsuranceHistoryComponent;

public class AboutInsuranceHistoryInteraction extends BasePage {
    private AboutInsuranceHistoryComponent aboutInsuranceHistoryComponent;

    public AboutInsuranceHistoryInteraction() {
        aboutInsuranceHistoryComponent = new AboutInsuranceHistoryComponent();
    }

    public void enterNumberOfYears(String numberOfyears){

        aboutInsuranceHistoryComponent.getHomeInsuranceHistoryField().clear();
        aboutInsuranceHistoryComponent.getHomeInsuranceHistoryField().sendKeys(numberOfyears);
    }
}
