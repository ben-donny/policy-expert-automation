package uk.co.policyexpert.steps;

import uk.co.policyexpert.BasePage;
import uk.co.policyexpert.interaction.AboutYouInteraction;


public class AboutYouSteps extends BasePage {

private AboutYouInteraction aboutYouInteraction;


    public AboutYouSteps() {
        this.aboutYouInteraction = new AboutYouInteraction();
    }

    public void enterAboutDetails(String title, String firstName, String lastName, String day, String month,
                                  String year, String maritalStatus){
        aboutYouInteraction.selectTitle(title);
        aboutYouInteraction.enterFirstName(firstName);
        aboutYouInteraction.enterLastName(lastName);
        aboutYouInteraction.selectDateBirth(day, month, year);
        aboutYouInteraction.selectMaritalStatus(maritalStatus);
    }

}
