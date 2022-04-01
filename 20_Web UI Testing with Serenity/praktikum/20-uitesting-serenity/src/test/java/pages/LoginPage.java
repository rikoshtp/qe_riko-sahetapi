package pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By usernameField(){
        return By.id("userName");
    }

    private By passwordField(){
        return By.id("password");
    }

    private By loginButton(){
        return By.id("login");

    }

    @Step
    public void validateOnLoginPage(){
        $(loginButton()).isDisplayed();
    }

    @Step
    public void inputUserName(String username){
        $(usernameField()).type(username);
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton(){
        $(loginButton()).click();
    }



}
