package starter.job;

import net.thucydides.core.annotations.Step;

public class Job {
    @Step("User on the home page")
    public void onTheHomePage(){
        System.out.println("User on the home page\"");
    }

    @Step("User click button Jobs")
    public void clickButtonJob(){
        System.out.println("User click button Jobs");
    }

    @Step("User search the job")
    public void searchJob(){
        System.out.println("User search the job");
    }

    @Step("User can apply the job")
    public void applyJob(){
        System.out.println("User can apply the job");
    }


}
