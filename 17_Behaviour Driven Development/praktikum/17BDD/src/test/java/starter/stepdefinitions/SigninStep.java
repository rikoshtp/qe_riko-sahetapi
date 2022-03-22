package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.signin.Signin;

public class SigninStep {
    @Steps
    Signin signin;

    @Given("User on the login page")
    public void onTheLoginPage(){
        signin.onTheLoginPage();
    }

    @When("User input email and password correctly")
        public void inputUsernameAndPassword(){
            signin.inputUsernameAndPassword();
        }

    @And("User click login button")
        public void clickLoginButton(){
        signin.clickLoginButton();
    }

    @Then("User on the feed")
        public void onTheHomePage(){
        signin.onFeed();
    }
}
