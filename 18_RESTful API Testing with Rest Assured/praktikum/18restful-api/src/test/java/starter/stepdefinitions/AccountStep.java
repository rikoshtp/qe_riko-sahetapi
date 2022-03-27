package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.Get;
import starter.account.Post;
import starter.account.Delete;

public class AccountStep {
    @Steps
    Post post;
    @Steps
    Get get;
    @Steps
    Delete delete;

    @Given("^I set \"([^\"]*)\" api endpoints$")
    public void setGetApiEndPoints(String method){
        if (method.equals("post")) {
            post.setPostApiEndPoints();
        } else if (method.equals("get")) {
            get.setGetApiEndPoints();
        } else if (method.equals("delete")) {
            delete.setDeleteApiEndPoints();
        }
    }
    @When("^I send \"([^\"]*)\" http requests$")
    public void iGetHttpRequest(String method){
        if (method.equals("post")) {
            post.iSendPostHttpRequest();
        } else if (method.equals("get")) {
            get.iGetHttpRequest();
        } else if (method.equals("delete")) {
            delete.deleteHttpRequest();
        }
    }
    @Then("^I receive valid data for \"([^\"]*)\" user$")
    public void receiveValidDataForDetailUser(String action){
        if (action.equals("login")) {
            post.receiveValidDataForLoginUser();
        } else if (action.equals("detail")) {
            post.receiveValidDataForLoginUser();
            get.receiveValidDataForDetailUser();
        } else if (action.equals("delete")) {
            delete.receiveValidHttpResponseCode200();
        }
    }
}
