package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.person.Person;

public class FindpersonStep {
    @Steps
    Person person;

    @When("User click button People")
    public void clickButtonPeople(){
        person.clickButtonPeople();
    }

    @And("User input first and last name")
    public void inputName(){
        person.inputName();
    }

    @Then("Showed a list of search users")
    public void showUser(){
        person.showUser();
    }

}
