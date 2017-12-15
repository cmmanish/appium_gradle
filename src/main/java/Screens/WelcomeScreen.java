package Screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

import io.appium.java_client.AppiumDriver;

public class WelcomeScreen extends ScreenBaseClass {

    final private static Logger log = Logger.getLogger(String.valueOf(WelcomeScreen.class));
    private AppiumDriver driver;

    public WelcomeScreen(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    //Localization
    @iOSFindBy(xpath = "//*[@name='Raise money for life's most important moments.']")
    @AndroidFindBy(id = "com.GoFundMe.GoFundMe:id/create_campaign_description_label")
    MobileElement campaignDescriptionlabel;

    @iOSFindBy(xpath = "//*[@name='Raise money for life's most important moments.']")
    @AndroidFindBy(id = "com.GoFundMe.GoFundMe:id/gfm_terms_textview")
    MobileElement gfmTOS;

    //Buttons
    @iOSFindBy(xpath = "//*[@name='SignUpFacebookButton']")
    @AndroidFindBy(id = "com.GoFundMe.GoFundMe:id/facebook_sign_in")
    public MobileElement fbSignUpButton;

    @iOSFindBy(xpath = "//*[@name='SignUpEmailButton']")
    @AndroidFindBy(id = "com.GoFundMe.GoFundMe:id/get_started")
    MobileElement emailSignUpButton;

    @iOSFindBy(xpath = "//*[@name='SignUpFacebookButton']")
    @AndroidFindBy(id = "com.GoFundMe.GoFundMe:id/login_button")
    public MobileElement signInButton;


    public boolean isWelcomeScreenPresent() {

        try {
            waitForElementToAppear(driver, campaignDescriptionlabel, 3);
            waitForElementToAppear(driver, gfmTOS, 3);
            waitForElementToAppear(driver, fbSignUpButton, 3);
            waitForElementToAppear(driver, emailSignUpButton, 3);
            waitForElementToAppear(driver, signInButton, 3);
            log.info("On Welcome Screen All the widgets present");
            return true;
        } catch (Exception e) {
            log.info(e.getMessage());
            return false;
        }
    }


    public boolean tapFacebookSignUpButton() {
        try {
            waitForElementToAppear(driver, fbSignUpButton, 3);
            fbSignUpButton.click();
            log.info(fbSignUpButton.getText().toString() + "Clicked");
            return true;
        } catch (Exception e) {
            log.info(e.getMessage());
            return false;
        }
    }

    public boolean tapEmailSignUpButton() {
        try {
            waitForElementToAppear(driver, emailSignUpButton, 3);
            emailSignUpButton.click();
            log.info(emailSignUpButton.getText().toString() + "Clicked");
            return true;
        } catch (Exception e) {
            log.info(e.getMessage());
            return false;
        }
    }

    public boolean tapSignInButton() {

        try {

            waitForElementToAppear(driver, signInButton, 3);
            signInButton.click();
            log.info(signInButton.getText().toString() + "Clicked");
            return true;
        } catch (Exception e) {
            log.info(e.getMessage());
            return false;
        }
    }
}