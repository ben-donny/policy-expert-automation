package uk.co.policyexpert.interaction;

import uk.co.policyexpert.util.BasePage;
import uk.co.policyexpert.component.QuestionsAboutYourPropertyComponent;

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
