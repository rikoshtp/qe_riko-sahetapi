package starter.signin;

import net.thucydides.core.annotations.Step;

public class Signin {
    @Step("User on the login page")
    public void onTheLoginPage(){
        System.out.println("User on the login page");
    }

    @Step("User input email and password correctly")
    public void inputUsernameAndPassword(){
        System.out.println("User input email and password correctly");
    }

    @Step("User click login button")
    public void clickLoginButton(){
        System.out.println("User click login button");
    }

    @Step("User on the home page")
    public void onFeed(){
        System.out.println("User on the home page");
    }

}
