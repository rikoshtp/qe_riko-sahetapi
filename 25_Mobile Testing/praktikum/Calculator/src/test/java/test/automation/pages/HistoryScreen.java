package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class HistoryScreen extends BasePageObject {
    private By landingPage() {
        return MobileBy.AccessibilityId("Calculator");
    }

    private By historyButton() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"); }

    private By historyPage() {
        return MobileBy.AccessibilityId("History");
    }

    @Step
    public boolean onPage() {
        return waitUntilPresence(landingPage()).isDisplayed();
    }

    @Step
    public void tapHistoryButton() {
        onClick(historyButton());
    }

    @Step
    public boolean onHistory() {
        return waitUntilPresence(historyPage()).isDisplayed();
    }
}
