package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import utils.WebDriverManager;

import java.io.File;
import java.io.IOException;

public class Hooks {

    @BeforeAll
    public static void cleanTestReports() {
        try {
            FileUtils.cleanDirectory(new File("target/test-reports"));
        } catch (IOException e) {
            System.err.println("❌ Failed to clean test-reports folder: " + e.getMessage());
        }
    }

    @After
    public void tearDown(Scenario scenario) {
        WebDriver driver = WebDriverManager.getDriver();
        WebDriverManager.quitDriver();
    }


}
