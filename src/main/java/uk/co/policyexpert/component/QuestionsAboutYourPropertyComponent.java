package uk.co.policyexpert.component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.policyexpert.util.BasePage;

public class QuestionsAboutYourPropertyComponent extends BasePage {
    public QuestionsAboutYourPropertyComponent() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//div[1]/div/div[1]/div/div[4]/div[@class='panel-body']/div//div[@class='btn-group']/button[1]")
    public WebElement QuestionsAboutYourPropertyYesButton;

    @FindBy(xpath="//div[1]/div/div[1]/div/div[4]/div[@class='panel-body']/div//div[@class='btn-group']/button[2]")
    public WebElement QuestionsAboutYourPropertyNoButton;

    public WebElement getQuestionsAboutYourPropertyYesButton() {
        return QuestionsAboutYourPropertyYesButton;
    }

    public WebElement getQuestionsAboutYourPropertyNoButton() {
        return QuestionsAboutYourPropertyNoButton;
    }
}


