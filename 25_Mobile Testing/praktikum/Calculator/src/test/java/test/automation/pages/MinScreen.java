package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class MinScreen extends BasePageObject {
    private By oneButton() {
        return MobileBy.AccessibilityId("1");
    }
    private By eightButton() {
        return MobileBy.AccessibilityId("8");
    }
    private By nineButton() {
        return MobileBy.AccessibilityId("9");
    }
    private By minButton() {
        return MobileBy.xpath("\t\n" + "//android.view.View[@content-desc=\" + \"]");
    }
    private By result() {
        return MobileBy.xpath("\t\n" + "(//android.view.View[@content-desc=\"9\"])[1]");
    }

    @Step
    public boolean isPage() {
        return waitUntilPresence(oneButton()).isDisplayed();
    }

    @Step
    public void tapOneButton(){onClick(oneButton());
    }

    @Step
    public void tapEightButton(){onClick(eightButton());
    }

    @Step
    public void tapMinButton(){onClick(minButton());
    }

    @Step
    public void tapNineButton(){onClick(nineButton());
    }

    @Step
    public String getResult() {
        return waitUntilVisible(result()).getText();
    }
}
