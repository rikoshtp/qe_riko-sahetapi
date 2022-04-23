package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class PlusScreen extends BasePageObject {
    private By fiveButton() {
        return MobileBy.AccessibilityId("5");
    }
    private By twoButton() {
        return MobileBy.AccessibilityId("2");
    }
    private By plusButton() {
        return MobileBy.xpath("\t\n" + "//android.view.View[@content-desc=\" + \"]");
    }
    private By result() {
        return MobileBy.xpath("\t\n" + "(//android.view.View[@content-desc=\"7\"])[2]");
    }

    @Step
    public boolean isPages() {
        return waitUntilPresence(fiveButton()).isDisplayed();
    }

    @Step
    public void tapFiveButton(){onClick(fiveButton());
    }

    @Step
    public void tapPlusButton(){onClick(plusButton());
    }

    @Step
    public void tapTwoButton(){onClick(twoButton());
    }

    @Step
    public String getResult() {
        return waitUntilVisible(result()).getText();
    }


}
