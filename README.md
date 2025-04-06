# Cermati Registration Page Automation - Baskoro

This project automates the testing of the **Cermati Registration Page** using Selenium, Cucumber (BDD), and ExtentReports.

It includes both positive and negative scenarios with validation checks and structured reporting.

---

## Stacks

| Tool            | Description                                |
|------------------|--------------------------------------------|
| Java             | Programming language                       |
| Selenium WebDriver | UI automation engine                     |
| Cucumber         | Gherkin-style BDD test framework           |
| JUnit            | Test runner                                |
| Maven            | Dependency & build management              |
| ExtentReports    | Custom test reporting                      |

---

## How to Run

### Prerequisites

- Java
- Maven 3.6+
- Chrome browser
- Correct matching version of ChromeDriver https://developer.chrome.com/docs/chromedriver/downloads

### To execute tests:

1. mvn clean install
2. mvn test

## Reports
Extent report will be generated at: target/test-reports/cucumber-reports-with-extent.html

## List of Scenario
- Scenario: [NEGATIVE] As a user, I want to fill Cermati Registration page with filling invalid phone, invalid email, invalid first name, and invalid last name
- Scenario: [NEGATIVE] As a user, I want to fill Cermati Registration page with filling valid phone, invalid email, invalid first name, and invalid last name
- Scenario: [NEGATIVE] As a user, I want to fill Cermati Registration page with filling valid phone, valid email, invalid first name, and invalid last name
- Scenario: [NEGATIVE] As a user, I want to fill Cermati Registration page with filling valid phone, valid email, valid first name, and invalid last name
- Scenario: [NEGATIVE] As a user, I want to fill Cermati Registration page with all valid but name characters count more than 100,
- Scenario: [NEGATIVE] As a user, I want to fill Cermati Registration page with filling invalid phone (not starting with 08), valid email, valid first name, and valid last name
- Scenario: [NEGATIVE] As a user, I want to fill Cermati Registration page with filling valid phone, invalid email (without using @), valid first name, and valid last name
- Scenario: [POSITIVE] As a user, I want to be able to click TnC Syarat dan Ketentuan
- Scenario: [POSITIVE] As a user, I want to be able to click TnC Kebijakan Privasi
- Scenario: [POSITIVE] As a user, I want to register in Cermati page


### Disclaimer

This project is for assignment only

### Author
BASKORO PRAMUDITO NUGROHO
bosbas97@gmail.com

