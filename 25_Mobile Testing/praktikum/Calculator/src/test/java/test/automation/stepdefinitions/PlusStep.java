package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.automation.pages.PlusScreen;

public class PlusStep {
    @Steps
    PlusScreen plusScreen;

    @Given("User on the Homepage")
    public void userOnHomePage() {
        boolean actual = plusScreen.isPages();
        Assert.assertTrue(actual);
    }

    @When("User tap button 5")
    public void tapButtonFive(){
        plusScreen.tapFiveButton();
    }

    @And("User tap button +")
    public void tapButtonPlus(){
        plusScreen.tapPlusButton();
    }

    @And("User tap button 2")
    public void tapButtonTwo(){
        plusScreen.tapTwoButton();
    }

    @Then("User can see calculation results")
    public void seeCalculationResults(){
        plusScreen.getResult();
    }

}
