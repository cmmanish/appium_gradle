package Screens;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

/**
 * Created by skloaner on 10/25/17.
 */

public class ScreenBaseClass {

    public void waitForScreenToLoad(AppiumDriver lDriver, MobileElement element, int seconds) {

        WebDriverWait wait = new WebDriverWait(lDriver, seconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementToAppear(AppiumDriver lDriver, MobileElement element, int seconds) {

        WebDriverWait wait = new WebDriverWait(lDriver, seconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}
