package uk.co.policyexpert.interaction;

import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v85.page.Page;
import uk.co.policyexpert.component.AboutYourPropertyComponent;

public class AboutYourPropertyInteraction extends Page {

    private AboutYourPropertyComponent aboutYourPropertyComponent;

    public AboutYourPropertyInteraction() {
        aboutYourPropertyComponent = new AboutYourPropertyComponent();
    }

    public void enterAddress(String address){
        aboutYourPropertyComponent.getAddressField().click();
        aboutYourPropertyComponent.getAddressField().sendKeys(address);
        aboutYourPropertyComponent.getAddressField().sendKeys(Keys.ARROW_DOWN);
        aboutYourPropertyComponent.getAddressField().sendKeys(Keys.RETURN);
    }
}
