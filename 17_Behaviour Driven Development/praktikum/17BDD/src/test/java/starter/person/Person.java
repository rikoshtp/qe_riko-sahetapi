package starter.person;

import net.thucydides.core.annotations.Step;

public class Person {

    @Step("User on the home page")
    public void onTheHomePage() {
        System.out.println("User on the home page");
    }

    @Step("User click button People")
    public void clickButtonPeople() {
        System.out.println("User click button People");
    }

    @Step("User input first and last name")
    public void inputName() {
        System.out.println("User input first and last name");
    }

    @Step("Showed a list of search users")
    public void showUser() {
        System.out.println("Showed a list of search users");
    }

}
