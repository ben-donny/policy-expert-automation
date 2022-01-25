package uk.co.policyexpert.steps;

import uk.co.policyexpert.interaction.AboutInsuranceHistoryInteraction;

public class AboutInsuranceHistorySteps {
    private AboutInsuranceHistoryInteraction aboutInsuranceHistoryInteraction;

    public AboutInsuranceHistorySteps() {
        this.aboutInsuranceHistoryInteraction = new AboutInsuranceHistoryInteraction();
    }

    public void addClaim(long itemWorth, String typeOfClaim,String damageType, String month, String year){
        selectTypeOfClaim(typeOfClaim);
        provideMoreDetails(damageType);
        selectMonthAndDate(month, year);


    }

    private void selectTypeOfClaim(String typeOfClaim){

    }
    private void selectMonthAndDate(String month, String year){

    }

    private void provideMoreDetails(String damageType){

    }

    public void addSpecificItem(String selectItem, String ToBeCovered ){

        selectItem(selectItem);
        selectItemToBeCovered(ToBeCovered);
    }

    private void selectItem(String selectItem){

    }

    private void selectItemToBeCovered(String ToBeCovered){

    }
}
