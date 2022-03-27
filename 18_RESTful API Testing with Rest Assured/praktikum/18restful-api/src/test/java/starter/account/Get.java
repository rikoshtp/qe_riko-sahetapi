package starter.account;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class Get {
        protected static String url = "https://demoqa.com/Account/v1/User/63ed5293-e3eb-44cc-93b6-cd5ccf5f8565";
        public Response response;

        @Step("I set \"get\" api endpoints")
        public String setGetApiEndPoints(){
            return url + "users/2";
        }
        @Step("I send \"get\" http request")
        public void iGetHttpRequest(){
            response = SerenityRest.given().when().get(setGetApiEndPoints());
        }
        @Step("I receive valid data for \"detail\" user")
        public void receiveValidDataForDetailUser() {
            restAssuredThat(reponse -> reponse.body("'data'.'id'", equalTo("63ed5293-e3eb-44cc-93b6-cd5ccf5f8565")));
        }
}
