package pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProfilePage extends PageObject {
    private By title(){
        return By.cssSelector("#app > div > div > div.pattern-backgound.playgound-header > div");
    }

    @Step
    public void validateOnProfilePage(){
        $(title()).isDisplayed();
    }
}
