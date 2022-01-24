package uk.co.policyexpert.steps;

import uk.co.policyexpert.BasePage;
import uk.co.policyexpert.interaction.AboutYouAndOtherResidentsInteraction;
import uk.co.policyexpert.interaction.AboutYouInteraction;


public class AboutYouSteps extends BasePage {

private AboutYouInteraction aboutYouInteraction;
private AboutYouAndOtherResidentsInteraction aboutYouAndOtherResidentsInteraction;


    public AboutYouSteps() {
        this.aboutYouInteraction = new AboutYouInteraction();
        this.aboutYouAndOtherResidentsInteraction = new AboutYouAndOtherResidentsInteraction();
    }

    public void enterAboutDetails(String title, String firstName, String lastName, String day, String month,
                                  String year, String maritalStatus, String occupation, String phone, String email){
        aboutYouInteraction.selectTitle(title);
        aboutYouInteraction.enterFirstName(firstName);
        aboutYouInteraction.enterLastName(lastName);
        aboutYouInteraction.selectDateBirth(day, month, year);
        aboutYouInteraction.selectMaritalStatus(maritalStatus);
        aboutYouInteraction.enterOccupation(occupation);
        aboutYouInteraction.clickOnAnotherOccupationNoButton();
        aboutYouInteraction.enterMainPhoneNumber(phone);
        aboutYouInteraction.enterEmailAddress(email);
        aboutYouAndOtherResidentsInteraction.clickBankruptcyNoButton();
    }

}
