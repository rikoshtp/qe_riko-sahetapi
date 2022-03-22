package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.job.Job;

public class SearchjobStep {
    @Steps
    Job job;

    @Given("User on the home page")
    public void onTheHomePage(){
        job.onTheHomePage();
    }

    @When("User click button Jobs")
    public void clickButtonJob(){
        job.clickButtonJob();
    }

    @And("User search the job")
    public void searchJob(){
        job.searchJob();
    }

    @Then("User can apply the job")
    public void applyJob(){
        job.applyJob();
    }
}
