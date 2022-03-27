package starter.account;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class Post {
    protected String url = "https://demoqa.com/Account/v1/Authorized";
    public Response response;

    @Step("I set post api endpoints")
    public String setPostApiEndPoints(){
        return url + "users";
    }

    @Step("I send post http request")
    public void iSendPostHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("userName", "string");
        requestBody.put("password", "string");
        response = SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post(setPostApiEndPoints());
    }
    @Step("I receive valid data for login user")
    public void receiveValidDataForLoginUser() {
        restAssuredThat(response -> response.body("'userName'", equalTo("rikosh")));
        restAssuredThat(response -> response.body("'password'", equalTo("Alterra@123")));
    }

}
