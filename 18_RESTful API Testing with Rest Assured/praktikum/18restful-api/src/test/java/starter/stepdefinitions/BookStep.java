package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.book.Delete;
import starter.book.Get;
import starter.book.Post;
import starter.book.Put;


public class BookStep {
    @Steps
    Get get;
    @Steps
    Post post;
    @Steps
    Put put;
    @Steps
    Delete delete;


    @Given("^I set \"([^\"]*)\" api endpoint$")
    public void getApiEndPoint(String method){
        if (method.equals("get")) {
            get.setGetApiEndPoint();
        } else if (method.equals("post")) {
            post.setPostApiEndPoint();
        } else if (method.equals("put")) {
            put.setPutApiEndPoints();
        } else if (method.equals("delete")) {
            delete.setDeleteApiEndPoints();
        }
    }
    @When("^I send \"([^\"]*)\" http request$")
    public void sendGetHttpRequest(String method){
        if (method.equals("get")) {
            get.sendGetHttpRequest();
        } else if (method.equals("post")) {
            post.postHttpRequest();
        } else if (method.equals("put")) {
            put.sendPutHttpRequest();
        } else if (method.equals("delete")) {
            delete.sendDeleteHttpRequest();
        }
    }
    @Then("^I receive valid data for \"([^\"]*)\" book$")
    public void receiveValidDataForDetailBook(String action){
        if (action.equals("detail")) {
            get.receiveValidDataForDetailBook();
        } else if (action.equals("add")) {
            post.receiveValidDataForAddBook();
        } else if (action.equals("update")) {
            put.receiveValidDataForUpdateBook();
        } else if (action.equals("delete")) {
            delete.receiveValidHttpResponseCode204();
        }
    }
}
