package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            // Suppress Selenium/ChromeDriver logs
            System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "error");
            System.setProperty("java.util.logging.config.file", "F:\\kodingan\\baskoro-cermati-web\\src\\test\\resources\\logging.properties");
            System.out.println("Log config loaded from: " + "F:\\kodingan\\baskoro-cermati-web\\src\\test\\resources\\logging.properties");
            System.setProperty("webdriver.chrome.silentOutput", "true");

            // Set your chromedriver path
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\BOSKI\\Documents\\chromedriver-win64-135.0.7049.42\\chromedriver-win64\\chromedriver.exe");

            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }


    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
