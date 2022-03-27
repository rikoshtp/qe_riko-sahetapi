package starter.book;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class Put {
    protected String url = "https://demoqa.com/swagger/#/BookStore/BookStoreV1BooksByISBNPut";
    public Response response;

    @Step("I set PUT api endpoints")
    public String setPutApiEndPoints(){
        return url + "users/2";
    }
    @Step("I send PUT http request")
    public void sendPutHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("userId","63ed5293-e3eb-44cc-93b6-cd5ccf5f8565");
        requestBody.put("ISBN","9781491950296");
        response = SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutApiEndPoints());

    }
    @Step("I receive valid data for update user")
    public void receiveValidDataForUpdateBook(){
        restAssuredThat(response -> response.body("'ISBN'", equalTo("123")));
    }
}
