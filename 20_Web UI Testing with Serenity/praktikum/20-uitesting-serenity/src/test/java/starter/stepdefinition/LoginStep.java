package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.BookStorePage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProfilePage;

public class LoginStep {
    @Steps
    HomePage homePage;

    @Steps
    BookStorePage bookStorePage;

    @Steps
    LoginPage loginPage;

    @Steps
    ProfilePage profilePage;

    @Given("I am on Home page")
    public void onHomePage(){
        homePage.openPageHome();
    }

    @When("I click Book Store Application")
    public void clickBookStoreApplication(){
        homePage.clickBookStoreApplication();
        bookStorePage.validateOnBooksPage();
    }

    @And("I click login button for go to the login page")
    public void clickLoginButtonForGoToTheLoginPage(){
        bookStorePage.clickLoginButtonMasuk();
    }

    @And("I am on login page")
    public void onLoginPage(){
        loginPage.validateOnLoginPage();
    }


    @And("I input username {string} and password {string}")
    public void iInputUsernameAndPassword(String username, String password) {
        loginPage.inputUserName("rikos");
        loginPage.inputPassword("Rikos@123");
    }

    @And("I click login button")
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }

    @Then("I am on profile page")
    public void onProfilePage(){
        profilePage.validateOnProfilePage();
    }

}
