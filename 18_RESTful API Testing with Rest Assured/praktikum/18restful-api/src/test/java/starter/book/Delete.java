package starter.book;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Delete {
    protected String url = "https://demoqa.com/swagger/#/BookStore/BookStoreV1BooksDelete";
    public Response response;

    @Step("I set DELETE api endpoints")
    public String setDeleteApiEndPoints(){
        return url + "users/2";
    }

    @Step("I send DELETE http request")
    public void sendDeleteHttpRequest(){
        response = SerenityRest.given().delete(setDeleteApiEndPoints());
    }
    @Step("I receive valid http response code 204")
    public void receiveValidHttpResponseCode204(){
        restAssuredThat(response -> response.statusCode(204));
    }
}
