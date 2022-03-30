package pages;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    private By clickBookStore(){
        return By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(6)");
    }

    @Step
    public void openPageHome(){
        open();
    }

    @Step
    public void clickBookStoreApplication(){
        $(clickBookStore()).click();
    }
}
