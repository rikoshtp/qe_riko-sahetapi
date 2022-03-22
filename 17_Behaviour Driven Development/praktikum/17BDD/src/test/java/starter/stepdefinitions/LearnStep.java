package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.learn.Learn;

public class LearnStep {
    @Steps
    Learn learn;

    @When("User click button Learning")
    public void clickButtonLearning(){
        learn.clickButtonLearning();
    }

    @And("User searches for the desired course")
    public void searchCourse(){
        learn.searchCourse();
    }

    @Then("Users can view and join the course")
    public void joinCourse(){
        learn.joinCourse();
    }
}
