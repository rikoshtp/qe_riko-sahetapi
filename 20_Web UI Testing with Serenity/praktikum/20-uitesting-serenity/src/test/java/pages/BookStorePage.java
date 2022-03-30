package pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class BookStorePage extends PageObject{
    private By title(){
        return By.className("main-header");
    }

    private By loginButton(){
        return By.id("login");
    }

    @Step
    public void validateOnBooksPage(){
        $(title()).isDisplayed();
    }

    @Step
    public void clickLoginButton(){
        $(loginButton()).click();
    }


}
