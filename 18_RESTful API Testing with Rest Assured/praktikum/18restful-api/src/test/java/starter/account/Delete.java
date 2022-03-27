package starter.account;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Delete {
    protected String url = "https://demoqa.com/Account/v1/User/63ed5293-e3eb-44cc-93b6-cd5ccf5f8565";
    public Response response;

    @Step("I set DELETE api endpoints")
    public String setDeleteApiEndPoints(){
        return url + "users/2";
    }

    @Step("I receive valid data id for \"delete\" user")
    public void deleteHttpRequest(){
        response = SerenityRest.given().delete(setDeleteApiEndPoints());
    }
    @Step("I receive valid http response code 200")
    public void receiveValidHttpResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
