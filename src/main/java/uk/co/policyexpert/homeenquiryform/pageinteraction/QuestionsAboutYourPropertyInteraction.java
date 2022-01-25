package uk.co.policyexpert.homeenquiryform.pageinteraction;

import uk.co.policyexpert.util.BasePage;
import uk.co.policyexpert.homeenquiryform.pagecomponent.QuestionsAboutYourPropertyComponent;

public class QuestionsAboutYourPropertyInteraction extends BasePage {

    private QuestionsAboutYourPropertyComponent questionsAboutYourPropertyComponent;

    public QuestionsAboutYourPropertyInteraction() {
        questionsAboutYourPropertyComponent = new QuestionsAboutYourPropertyComponent();
    }

    public void clickOnQuestionsAboutYourPropertyYesButton(){
        questionsAboutYourPropertyComponent.getQuestionsAboutYourPropertyYesButton().click();
    }

    public void clickOnQuestionsAboutYourPropertyNoButton(){
        questionsAboutYourPropertyComponent.getQuestionsAboutYourPropertyNoButton().click();
    }
}
