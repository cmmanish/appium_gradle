import io.appium.java_client.MobileElement;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import Screens.WelcomeScreen;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.PageFactory;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by mmadhu on 10/25/17.
 */

public class TestCreateAccount extends TestBaseClass {

    final private static Logger log = Logger.getLogger(String.valueOf(TestCreateAccount.class));

    @Test
    public void testCreateAccountViaEmail() throws Exception {

        log.info("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< End");

        WelcomeScreen welcomeScreen = new WelcomeScreen(driver);
        Assert.assertTrue(welcomeScreen.isWelcomeScreenPresent());

        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> End");
    }
}

//    MobileElement me = (MobileElement) driver.findElementById("com.GoFundMe.GoFundMe:id/get_started");
//        me.click();
