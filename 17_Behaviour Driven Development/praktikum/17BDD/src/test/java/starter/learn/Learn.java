package starter.learn;

import net.thucydides.core.annotations.Step;

public class Learn {

    @Step("User on the home page")
    public void onTheHomePage() {
        System.out.println("User on the home page");
    }

    @Step("User click button Learning")
    public void clickButtonLearning() {
        System.out.println("User click button Learning");
    }

    @Step("User searches for the desired course")
    public void searchCourse(){
        System.out.println("User searches for the desired course");
    }

    @Step("Users can view and join the course")
    public void joinCourse() {
        System.out.println("Users can view and join the course");
    }
}
