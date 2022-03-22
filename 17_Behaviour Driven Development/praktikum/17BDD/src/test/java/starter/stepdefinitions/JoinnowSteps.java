package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.join.Join;

public class JoinnowSteps {
    @Steps
    Join join;

    @Given("User on the sign up page")
    public void onThesignupPage(){
        join.onThesignupPage();
    }

    @When("User input email or phone number")
    public void inputEmailOrNumber(){
        join.inputEmailOrNumber();
    }

    @And("User input password")
    public void inputPassword(){
        join.inputPassword();
    }

    @And("User click button \"Agree & Join\"")
    public void clickButtonJoin(){
        join.clickButtonJoin();
    }

    @Then("User on the home page or feed")
    public void onTheHomePage(){
        join.onTheHomePage();
    }
}
