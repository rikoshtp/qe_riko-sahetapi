package starter.join;

import net.thucydides.core.annotations.Step;

public class Join {
    @Step("User on the sign up page")
    public void onThesignupPage(){
        System.out.println("User on the sign up page");
    }

    @Step("User input email or phone number")
    public void inputEmailOrNumber(){
        System.out.println("User input email or phone number");
    }

    @Step("User input password")
    public void inputPassword(){
        System.out.println("User input email or phone number");
    }

    @Step("User click button \"Agree & Join\"")
    public void clickButtonJoin(){
        System.out.println("User click button \"Agree & Join\"");
    }

    @Step("User on the home page or feed")
    public void onTheHomePage(){
        System.out.println("User on the home page or feed");
    }
}
