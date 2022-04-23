package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class ClearNumberScreen extends BasePageObject{
        private By sixButton() {
            return MobileBy.AccessibilityId("6");
        }
        private By threeButton() {
            return MobileBy.AccessibilityId("3");
        }
        private By acButton() {
            return MobileBy.AccessibilityId("AC");
        }

        @Step
        public boolean isPage() {
            return waitUntilPresence(sixButton()).isDisplayed();
        }

        @Step
        public void tapSixButton(){onClick(sixButton());
        }

        @Step
        public void tapThreeButton(){onClick(threeButton());
        }

        @Step
        public void tapACButton() {onClick(acButton());
        }

        @Step
        public int noNumber() {
            return(0);
        }
}
