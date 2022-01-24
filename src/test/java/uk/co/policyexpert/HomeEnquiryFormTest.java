package uk.co.policyexpert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import uk.co.policyexpert.steps.AboutYouSteps;

public class HomeEnquiryFormTest extends BasePage  {

    private AboutYouSteps aboutYouSteps;

    @BeforeClass
    @Parameters({"BROWSER", "SITEURL"})
    public void setUp(String BROWSER, String SITEURL) throws Exception{
        createDriver(BROWSER, SITEURL);
        aboutYouSteps = new AboutYouSteps();
    }

    @Test
    @Parameters({"firstName", "lastName"})
    public void fillForm(String firstName, String lastName) throws Exception{

       aboutYouSteps.enterAboutDetails("Miss",firstName,lastName, "12","March","2005", "Single");

    }


    @AfterClass(alwaysRun = true)
    public void quitDrver(){
        closeDriver();
    }
}
