package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class RegistrationPage {
    private final By phoneField = By.xpath("//input[@id='mobilePhone']");
    private final By emailField = By.xpath("//input[@id='email']");
    private final By firstNameField = By.xpath("//input[@id='firstName']");
    private final By lastNameField = By.xpath("//input[@id='lastName']");
    private final By daftarButton = By.xpath("//button[normalize-space()='Daftar']");
    // These may need refinement depending on how error messages show up
    private final By phoneError = By.xpath("//input[@id='mobilePhone']/following-sibling::span");
    private final By emailError = By.xpath("//input[@id='email']/following-sibling::span");
    private final By firstNameError = By.xpath("//input[@id='firstName']/following-sibling::span");
    private final By lastNameError = By.xpath("//input[@id='lastName']/following-sibling::span");
    private final By tnc = By.xpath("//span[@class='TermsAndConditions_checkbox__text__Tl4Uv']");
    private final By tncLink = By.xpath("//a[normalize-space()='Syarat dan Ketentuan']");
    private final By privacyPolicyLink = By.xpath("//a[normalize-space()='Kebijakan Privasi']");
    private WebDriver driver;
    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterPhone(String phone) {
        driver.findElement(phoneField).sendKeys(phone);
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterFirstName(String name) {
        driver.findElement(firstNameField).sendKeys(name);
    }

    public void clickSubmit() {
        driver.findElement(daftarButton).click();
    }

    public String getPhoneErrorText() {
        return driver.findElement(phoneError).getText();
    }

    public String getEmailErrorText() {
        return driver.findElement(emailError).getText();
    }

    public String getFirstNameErrorText() {
        return driver.findElement(firstNameError).getText();
    }

    public void enterLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void blurLastName() {
        driver.findElement(lastNameField).sendKeys(Keys.TAB);
    }

    public String getLastNameErrorText() {
        return driver.findElement(lastNameError).getText();
    }

    public boolean isDaftarButtonEnabled() {
        return driver.findElement(daftarButton).isEnabled();
    }

    public String getTnCText() {
        return driver.findElement(tnc).getText();
    }

    public boolean areAllRegistrationFieldsVisible() {
        return driver.findElement(phoneField).isDisplayed() &&
                driver.findElement(emailField).isDisplayed() &&
                driver.findElement(firstNameField).isDisplayed() &&
                driver.findElement(lastNameField).isDisplayed() &&
                driver.findElement(daftarButton).isDisplayed();
    }


    public void clickTnC() {
        driver.findElement(tncLink).click();
    }

    public void clickPrivacyPolicy() {
        driver.findElement(privacyPolicyLink).click();
    }

    public void clickDaftarButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(daftarButton));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
        button.click();
    }

}
