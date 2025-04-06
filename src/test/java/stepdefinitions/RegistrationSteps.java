package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.RegistrationPage;
import utils.WebDriverManager;

import static org.junit.Assert.*;

public class RegistrationSteps {

    WebDriver driver;
    RegistrationPage registrationPage;

    @Before
    public void setUp() {
        driver = WebDriverManager.getDriver();
    }

    @Given("I am on the registration page")
    public void i_am_on_the_registration_page() {
        driver.get("https://www.cermati.com/app/gabung");
        registrationPage = new RegistrationPage(driver);
    }

    @When("I fill phone with {string}")
    public void i_fill_phone_with(String phone) {
        registrationPage.enterPhone(phone);
    }

    @When("I fill email with {string}")
    public void i_fill_email_with(String email) {
        registrationPage.enterEmail(email);
    }

    @When("I fill first name with {string}")
    public void i_fill_first_name_with(String firstName) {
        registrationPage.enterFirstName(firstName);
    }

    @When("I fill last name with {string}")
    public void i_fill_last_name_with(String lastName) {
        registrationPage.enterLastName(lastName);
    }


    @When("I submit the registration form")
    public void i_submit_the_registration_form() {
        registrationPage.clickSubmit();
    }

    @Then("I should see validation errors for phone, email, first name, and last name")
    public void i_should_see_validation_errors() throws InterruptedException {
        Thread.sleep(1000); // Replace with WebDriverWait later

        String phoneError = registrationPage.getPhoneErrorText();
        String emailError = registrationPage.getEmailErrorText();
        String firstNameError = registrationPage.getFirstNameErrorText();
        String lastNameError = registrationPage.getLastNameErrorText();

        assertFalse(phoneError.isEmpty());
        assertFalse(emailError.isEmpty());
        assertFalse(firstNameError.isEmpty());
        assertFalse(lastNameError.isEmpty());
    }

    @And("User wait for {int} seconds")
    public void user_wait_for_seconds(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000);
    }

    @When("User fill phone with {string} and user fill email with {string} and user fill first name with {string} and user fill last name with {string}")
    public void user_fill_all_inputs(String phone, String email, String firstName, String lastName) {
        registrationPage.enterPhone(phone);
        registrationPage.enterEmail(email);
        registrationPage.enterFirstName(firstName);
        registrationPage.enterLastName(lastName);
        //to simulate input keys TAB after entering field last name to show error message if necessary
        registrationPage.blurLastName();
    }

    @Then("Daftar button should be disabled")
    public void the_submit_button_should_be_disabled() {
        boolean isEnabled = registrationPage.isDaftarButtonEnabled();
        assertFalse("Expected the submit button to be disabled, but it was enabled.", isEnabled);
    }

    @Then("Daftar button should be enabled")
    public void the_submit_button_should_be_enabled() {
        boolean isEnabled = registrationPage.isDaftarButtonEnabled();
        assertTrue("Expected the submit button to be enabled, but it was disabled.", isEnabled);
    }

    @Then("I should see error message {string}")
    public void i_should_see_error_message(String expectedMessage) {
        String actualMessage = driver.findElement(By.xpath("//*[contains(text(),'" + expectedMessage + "')]")).getText();
        assertEquals(expectedMessage, actualMessage);
    }

    @Then("I should see the correct Terms and Condition")
    public void i_should_see_the_tnc() {
        String expectedText = "Dengan klik Daftar, Saya telah membaca dan menyetujui Syarat dan Ketentuan dan Kebijakan Privasi dan bersedia untuk dihubungi oleh Cermati.com.";
        String actualText = registrationPage.getTnCText();
        assertEquals("TnC text does not match!", expectedText, actualText);
    }

    @Then("All registration fields should be there")
    public void all_registration_fields_should_be_there() {
        boolean fieldsAreVisible = registrationPage.areAllRegistrationFieldsVisible();
        assertTrue("One or more registration fields are not visible.", fieldsAreVisible);
    }

    @When("User clicks TnC")
    public void user_clicks_tnc() {
        registrationPage.clickTnC();
    }

    @When("User clicks Privacy Policy")
    public void user_clicks_privacy_policy() {
        registrationPage.clickPrivacyPolicy();
    }

    @Then("User should be able to redirect to {string}")
    public void redirect(String expectedUrl) {
        String actualUrl = driver.getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
    }

    @When("User clicks the daftar button")
    public void user_clicks_daftar_button() {
        registrationPage.clickDaftarButton();
    }


}
