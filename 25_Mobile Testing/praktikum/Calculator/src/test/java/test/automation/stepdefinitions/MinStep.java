package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.automation.pages.MinScreen;

public class MinStep{
    @Steps
    MinScreen minScreen;

    @Given("User on the landing page")
    public void onLandingPage(){
        boolean actual = minScreen.isPage();
        Assert.assertTrue(actual);
    }

    @When("User tap button 1")
    public void tapButtonOne(){
        minScreen.tapOneButton();
    }

    @And("User tap button 8")
    public void tapEightButton(){
        minScreen.tapEightButton();
    }

    @And("User tap button -")
    public void tapButtonMin(){
        minScreen.tapMinButton();
    }

    @And("User tap button 9")
    public void tapNineButton(){
        minScreen.tapNineButton();
    }

    @Then("User can see calculation result")
    public void seeCalculationResult(){
        minScreen.getResult();
    }
}
