package uk.co.policyexpert.interaction;

import org.testng.Assert;
import uk.co.policyexpert.BasePage;
import uk.co.policyexpert.MaritalStatus;
import uk.co.policyexpert.TItle;
import uk.co.policyexpert.component.AboutYouComponent;

public class AboutYouInteraction extends BasePage {

    public static final String NO_TITLE_PROVIDED_ERROR = "No title provided";
    final String NO_MARITAL_STATUS_PROVIDED_ERROR = "No marital status provided";

    private AboutYouComponent aboutYouComponent;

    public AboutYouInteraction() {
        this.aboutYouComponent = new AboutYouComponent();
    }

    public void selectTitle(String title){
        switch (title){
            case "Mr" :
                selectFromDropdownByHTMLAttribute(aboutYouComponent.getSelectTitleField(), TItle.MR.getTitle());
                break;
            case "Mrs" :
                selectFromDropdownByHTMLAttribute(aboutYouComponent.getSelectTitleField(), TItle.MRS.getTitle());
                break;

            case "Miss" :
                selectFromDropdownByHTMLAttribute(aboutYouComponent.getSelectTitleField(), TItle.MISS.getTitle());
                break;

            case "Ms" :
                selectFromDropdownByHTMLAttribute(aboutYouComponent.getSelectTitleField(), TItle.MS.getTitle());

            case "Dr":
                selectFromDropdownByHTMLAttribute(aboutYouComponent.getSelectTitleField(), TItle.DR.getTitle());
                break;
            default:
                Assert.fail(NO_TITLE_PROVIDED_ERROR);
        }
    }

    public void enterFirstName(String firstName) {

        aboutYouComponent.getFirstNameField().clear();
        aboutYouComponent.getFirstNameField().sendKeys(firstName);

    }

    public void enterLastName(String firstName) {
        aboutYouComponent.getLastNameField().clear();
        aboutYouComponent.getLastNameField().sendKeys(firstName);
    }

    public void selectDateBirth(String day, String month, String year){
      selectDay(day);
      selectMonth(month);
      selectYear(year);
    }

    private void selectDay(String day){
        selectFromDropdownByHTMLAttribute(aboutYouComponent.getBirthDayField(), day);
    }
    private void selectMonth(String month){
        selectFromDropdownByHTMLAttribute(aboutYouComponent.getBirthMonthField(), month);
    }
    private void selectYear(String year){
        selectFromDropdownByHTMLAttribute(aboutYouComponent.getBirthYearField(), year);
    }

    public void selectMaritalStatus(String maritalStatus){

        switch (maritalStatus){
            case "Married" :
                selectFromDropdownByHTMLAttribute(aboutYouComponent.getMaritalStatusField(),
                        MaritalStatus.MARRIED.getMaritalStatus());
                break;
            case "Single" :
                selectFromDropdownByHTMLAttribute(aboutYouComponent.getMaritalStatusField(),
                        MaritalStatus.SINGLE.getMaritalStatus());
                break;
            case "Co-habiting/partner" :
                selectFromDropdownByHTMLAttribute(aboutYouComponent.getMaritalStatusField(),
                        MaritalStatus.CO_HABITING_PARTNER.getMaritalStatus());
                break;
            case "Divorced" :
                selectFromDropdownByHTMLAttribute(aboutYouComponent.getMaritalStatusField(),
                        MaritalStatus.DIVORCED.getMaritalStatus());
                break;
            case "Widowed" :
                selectFromDropdownByHTMLAttribute(aboutYouComponent.getMaritalStatusField(),
                        MaritalStatus.WIDOWED.getMaritalStatus());
                break;
            case "Separated" :
                selectFromDropdownByHTMLAttribute(aboutYouComponent.getMaritalStatusField(),
                        MaritalStatus.SEPARATED.getMaritalStatus());
                break; case "Civil partnership" :
                selectFromDropdownByHTMLAttribute(aboutYouComponent.getMaritalStatusField(),
                        MaritalStatus.CIVIC_PARTNERSHIP.getMaritalStatus());
                break;
            default:
                Assert.fail(NO_MARITAL_STATUS_PROVIDED_ERROR);
        }
    }
}
