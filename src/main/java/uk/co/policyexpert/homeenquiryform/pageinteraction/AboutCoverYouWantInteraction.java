package uk.co.policyexpert.homeenquiryform.pageinteraction;

import uk.co.policyexpert.util.BasePage;
import uk.co.policyexpert.homeenquiryform.pagecomponent.AboutCoverYouWantComponent;

public class AboutCoverYouWantInteraction extends BasePage {
    private AboutCoverYouWantComponent aboutCoverYouWantComponent;

    public AboutCoverYouWantInteraction() {
        this.aboutCoverYouWantComponent = new AboutCoverYouWantComponent();
    }

    public void enterCoverStartDate(String startDate){
        aboutCoverYouWantComponent.getCoverStartDateField().clear();
        aboutCoverYouWantComponent.getCoverStartDateField().sendKeys(startDate);
    }
}
