package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.automation.pages.ClearNumberScreen;

public class ClearNumberStep {
    @Steps
    ClearNumberScreen clearNumberScreen;

    @Given("User on the Calculator")
    public void userOnCalculator() {
        boolean actual = clearNumberScreen.isPage();
        Assert.assertTrue(actual);
    }
    @When("User tap 6 button")
    public void userTapSixButton() {
        clearNumberScreen.tapSixButton();
    }
    @And("User tap 3 button")
    public void userTapThreeButton() {
        clearNumberScreen.tapThreeButton();
    }
    @And("User tap AC button")
    public void userTapACButton() {
        clearNumberScreen.tapACButton();
    }
    @Then("User see no number")
    public void userSeeCalculateResult() {
        clearNumberScreen.noNumber();
    }
}
