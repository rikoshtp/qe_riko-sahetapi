package starter.book;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class Post {
    protected String url = "https://demoqa.com/swagger/#/BookStore/BookStoreV1BooksPost";
    public Response response;

    @Step("I set post api endpoints")
    public String setPostApiEndPoint(){
        return url + "users";
    }

    @Step("I send post http request")
    public void postHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("userId", "6c2db9bf-ceb2-4c39-90fb-c0b1d01ddc0");
        requestBody.put("ISBN", "9781491950296");
        response = SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post(setPostApiEndPoint());
    }
    @Step("I receive valid data for add book")
    public void receiveValidDataForAddBook() {
        restAssuredThat(response -> response.body("'userId'", equalTo("6c2db9bf-ceb2-4c39-90fb-c0b1d01ddc0")));
        restAssuredThat(response -> response.body("'ISBN'", equalTo("9781491950296")));
    }
}
