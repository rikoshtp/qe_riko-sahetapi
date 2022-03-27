package starter.book;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class Get {
    protected static String url = "https://demoqa.com/swagger/#/BookStore/BookStoreV1BookGet";
    public Response response;

    @Step("I set \"get\" api endpoints")
    public String setGetApiEndPoint(){
        return url + "book/2";
    }
    @Step("I send \"get\" http request")
    public void sendGetHttpRequest(){
        response = SerenityRest.given().when().get(setGetApiEndPoint());
    }
    @Step("I receive valid data for \"detail\" book")
    public void receiveValidDataForDetailBook() {

    }
}
