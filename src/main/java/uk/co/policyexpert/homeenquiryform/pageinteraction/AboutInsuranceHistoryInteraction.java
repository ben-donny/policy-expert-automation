package uk.co.policyexpert.homeenquiryform.pageinteraction;

import uk.co.policyexpert.util.BasePage;
import uk.co.policyexpert.homeenquiryform.pagecomponent.AboutInsuranceHistoryComponent;

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
