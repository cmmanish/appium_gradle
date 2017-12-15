import Screens.WelcomeScreen;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import io.appium.java_client.AppiumDriver;

/**
 * Created by skloaner on 10/25/17.
 */

public class TestBaseClass {

    final private static Logger log = Logger.getLogger(String.valueOf(WelcomeScreen.class));
    protected static AppiumDriver driver;
    protected String APP_PACKAGE = "com.GoFundMe.GoFundMe";
    protected String APP_ACTIVITY = ".ui.SplashActivity";

    @Before
    public void setUp() throws Exception {

        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "APK");
        File app = new File(appDir, "android-release-v4.1.2_202131-signed_zipped.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("appPackage", APP_PACKAGE);
        capabilities.setCapability("appActivity", APP_ACTIVITY);
        try {
            driver = new AppiumDriver(new URL("http://192.168.60.248:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            log.info("App Launched");

        } catch (WebDriverException e) {
            System.out.print(e.getMessage());
            System.exit(0);
        } catch (Exception e) {
            System.out.print(e.getMessage());
            System.exit(0);
        }
    }

    @After
    public void tearDown() throws Exception {
        if (driver != null) driver.quit();
    }

    @Test
    public void testCreateAccountViaEmail() throws Exception {

        log.info("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< End");

        WelcomeScreen welcomeScreen = new WelcomeScreen(driver);
        Assert.assertTrue(welcomeScreen.isWelcomeScreenPresent());

        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> End");
    }
}