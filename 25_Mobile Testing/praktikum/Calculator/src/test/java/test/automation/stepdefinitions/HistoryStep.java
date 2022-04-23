package test.automation.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.automation.pages.HistoryScreen;

public class HistoryStep {
    @Steps
    HistoryScreen historyScreen;

    @Given("User on the Calculator App")
    public void userOnCalculatorApp() {
        boolean actual = historyScreen.onPage();
        Assert.assertTrue(actual);
    }

    @When("User tap button history")
    public void tapHistoryButton() {
        historyScreen.tapHistoryButton();
    }

    @Then("User on history")
    public void onHistory() {
        boolean actual = historyScreen.onHistory();
        Assert.assertTrue(actual);
    }
}
