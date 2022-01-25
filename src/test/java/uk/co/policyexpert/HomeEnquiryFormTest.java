package uk.co.policyexpert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import uk.co.policyexpert.steps.AboutYouAndOtherResidentsSteps;
import uk.co.policyexpert.steps.AboutYouSteps;
import uk.co.policyexpert.steps.AboutYourPropertySteps;
import uk.co.policyexpert.util.BasePage;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class HomeEnquiryFormTest extends BasePage {

    public static final String ABOUT_YOU = "About you";
    private AboutYouSteps aboutYouSteps;
    private AboutYouAndOtherResidentsSteps aboutYouAndOtherResidentsSteps;
    private AboutYourPropertySteps aboutYourPropertySteps;

    @BeforeClass
    @Parameters({"BROWSER", "SITEURL"})
    public void setUp(String BROWSER, String SITEURL) throws Exception{
        createDriver(BROWSER, SITEURL);
        aboutYouSteps = new AboutYouSteps();
        aboutYouAndOtherResidentsSteps = new AboutYouAndOtherResidentsSteps();
        aboutYourPropertySteps = new AboutYourPropertySteps();
    }

    @Test
    @Parameters({"title", "firstName", "lastName", "day", "month", "year", "maritalStatus", "occupation", "phoneNumber", "email",
    "homeAddress"})
    public void fillHomeInsuranceEnquiryForm(String title, String firstName, String lastName, String day, String month, String year,
                                             String maritalStatus, String occupation, String phoneNumber,
                                             String email, String homeAddress) throws Exception{
        verifyAboutYouText(ABOUT_YOU);
       aboutYouSteps.addDetails(title,firstName,lastName, day, month, year,
               maritalStatus,occupation);
       aboutYouSteps.bankruptcyNoButton();
       aboutYouSteps.addPhoneNumberAndEmailAddress(phoneNumber ,email);
       aboutYouAndOtherResidentsSteps.bankruptcyNoButton();
       aboutYourPropertySteps.addPropertyAddress(homeAddress);



    }

    public void verifyAboutYouText(String expectedText){
        String  actualText = aboutYouSteps.aboutYouText();
        assertThat(actualText, equalTo(expectedText));
    }

//    @AfterClass(alwaysRun = true)
//    public void quitDrver(){
//        closeDriver();
//    }
}
