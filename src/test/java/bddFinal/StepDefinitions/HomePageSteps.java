package bddFinal.StepDefinitions;

import bddFinal.Pages.HomePageObject;
import bddFinal.utility.SeleniumUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class HomePageSteps extends SeleniumUtility {

    @Given("open browser and navigate to retail app")
    public void open_browser_and_navigate_to_retail_app() {
        openBrowser();
    }
    @Then("validate TEK Insurance UI is exist")
    public void validate_tek_insurance_ui_is_exist() {
        String tekInsuranceText = getElementText(HomePageObject.TEK_INSURANCE_UI_TEXT);
        Assert.assertEquals("TEK Insurance App", tekInsuranceText);
        System.out.println(tekInsuranceText);
    }
    @Then("validate Create Primary Account is exist")
    public void validate_create_primary_account_is_exist() {
        String createPrimaryAccountText = getElementText(HomePageObject.CREATE_PRIMARY_ACCOUNT_BUTTON);
        Assert.assertEquals("Create Primary Account",createPrimaryAccountText);
        System.out.println(createPrimaryAccountText);
    }
    @Then("validate Login button is enabled")
    public void validate_login_button_is_enabled() {
        boolean loginBtnText = isElementIsEnabled(HomePageObject.LOGIN_BUTTON);
        Assert.assertTrue("Login button should be enabled", loginBtnText);
    }
    @Then("validate color mode button is displayed")
    public void validate_color_mode_button_is_displayed() {
        boolean colorModeOption = isElementIsDisplayed(HomePageObject.COLOR_MOOD_BUTTON);
        Assert.assertTrue("Dark mode color button must be displayed", colorModeOption);
    }

    }

