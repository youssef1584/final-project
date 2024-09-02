package bddFinal.StepDefinitions;

import bddFinal.Pages.CreateAccountPageObject;
import bddFinal.utility.RandomGenerator;
import bddFinal.utility.SeleniumUtility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CreateAccountSteps extends SeleniumUtility {
    @When("click on Create Primary Account link")
    public void click_on_crate_primary_account_link() {
        clickOnElement(CreateAccountPageObject.CREATE_PRIMARY_ACCOUNT_LINK);
    }
    @Then("validate section title to be Create Primary Account Holder")
    public void validate_section_title_to_be_create_primary_account_holder() {
        String createAccountHolderTitle = getElementText(CreateAccountPageObject.CREATE_PRIMARY_ACCOUNT_HOLDER_TILE);
        Assert.assertEquals("Create Primary Account Holder", createAccountHolderTitle);
    }
    @Then("fill up create account form")
    public void fillUpCreateAccountForm() {
        String prefix = "mostafa";
        String randomEmail = RandomGenerator.randomEmail(prefix);
        sendText(CreateAccountPageObject.EMAIL_INPUT, randomEmail);
        selectFromDropDown(CreateAccountPageObject.PREFIX_SELECT, "Mr.");
        sendText(CreateAccountPageObject.FIRST_NAME_INPUT, "Mostafa");
        sendText(CreateAccountPageObject.LAST_NAME_INPUT, "youssef");
        selectFromDropDown(CreateAccountPageObject.GENDER_SELECT, "Male");
        selectFromDropDown(CreateAccountPageObject.MARITAL_STATUS_SELECT, "Married");
        sendText(CreateAccountPageObject.EMPLOYMENT_STATUS, "Automation Engineer");
        sendText(CreateAccountPageObject.DATE_OF_BIRTH, "03/15/1990");
    }
    @Then("click on Create Account button")
    public void clickOnCreateAccountButton() {
        clickOnElement(CreateAccountPageObject.CREATE_ACCOUNT_BUTTON);
    }

    @Then("validate Sign up your account title is exist")
    public void validateSignUpYourAccountTitleIsExist() {
        String actualSignUpTitle = getElementText(CreateAccountPageObject.SIGN_UP_YOUR_ACCOUNT_TITLE);
        Assert.assertEquals("Sign up your account", actualSignUpTitle);

    }
    @Then("validate user full name is displayed")
    public void validateUserFullNameIsDisplayed() {
        boolean userActualFullName = isElementIsDisplayed(CreateAccountPageObject.USER_FULL_NAME);
        Assert.assertTrue("User full name should be displayed", userActualFullName);

    }
    @Then("validate email address shows as expected")
    public void validateEmailAddressShowsAsExpected() {
        boolean userActualEmailAddress = isElementIsDisplayed(CreateAccountPageObject.USER_EMAIL_ADDRESS_TITLE);
        Assert.assertTrue("Email address must be displayed as expected", userActualEmailAddress);

    }
    @When("when the user fill up sign up form")
    public void whenTheUserFillUpSignUpForm() {
        sendText(CreateAccountPageObject.USERNAME_INPUT, "youssef84");
        sendText(CreateAccountPageObject.PASSWORD_INPUT, "Moe@1984");
        sendText(CreateAccountPageObject.CONFIRM_PASSWORD_INPUT, "Moe@1984");
    }
    @Then("click on submit button")
    public void clickOnSubmitButton() {
        clickOnElement(CreateAccountPageObject.SUBMIT_BUTTON);
    }

    @Then("fill up create account form page")
    public void fillUpCreateAccountFormPage() {

        sendText(CreateAccountPageObject.EMAIL_INPUT, "youssef123@gmail.com");
        selectFromDropDown(CreateAccountPageObject.PREFIX_SELECT, "Mr.");
        sendText(CreateAccountPageObject.FIRST_NAME_INPUT, "mostafa");
        sendText(CreateAccountPageObject.LAST_NAME_INPUT, "youssef");
        selectFromDropDown(CreateAccountPageObject.GENDER_SELECT, "Male");
        selectFromDropDown(CreateAccountPageObject.MARITAL_STATUS_SELECT, "Married");
        sendText(CreateAccountPageObject.EMPLOYMENT_STATUS, "Automation Engineer");
        sendText(CreateAccountPageObject.DATE_OF_BIRTH, "03/15/1990");
    }
    @When("validate account error message")
    public void validateAccountErrorMessage() {
        String errorMessage = getElementText(CreateAccountPageObject.ERROR_MESSAGE);
        Assert.assertEquals("ERROR", errorMessage);
        System.out.println(errorMessage);

    }
}
