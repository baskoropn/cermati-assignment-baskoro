Feature: Registration Feature

  Scenario: [NEGATIVE] As a user, I want to fill Cermati Registration page with filling invalid phone, invalid email, invalid first name, and invalid last name
    Given I am on the registration page
    Then All registration fields should be there
    When User fill phone with "0" and user fill email with "0" and user fill first name with "0" and user fill last name with "0"
    And User wait for 1 seconds
    Then Daftar button should be disabled
    And I should see error message "Nomor handphone tidak valid"
    And I should see error message "Format email tidak valid"
    And I should see error message "Input harus berupa huruf"

  Scenario: [NEGATIVE] As a user, I want to fill Cermati Registration page with filling valid phone, invalid email, invalid first name, and invalid last name
    Given I am on the registration page
    Then All registration fields should be there
    When User fill phone with "0817805298" and user fill email with "0" and user fill first name with "0" and user fill last name with "0"
    And User wait for 1 seconds
    Then Daftar button should be disabled
    And I should see error message "Format email tidak valid"
    And I should see error message "Input harus berupa huruf"

  Scenario: [NEGATIVE] As a user, I want to fill Cermati Registration page with filling valid phone, valid email, invalid first name, and invalid last name
    Given I am on the registration page
    Then All registration fields should be there
    When User fill phone with "0817805298" and user fill email with "bosbas97@gmail.com" and user fill first name with "0" and user fill last name with "0"
    And User wait for 1 seconds
    Then Daftar button should be disabled
    And I should see error message "Input harus berupa huruf"

  Scenario: [NEGATIVE] As a user, I want to fill Cermati Registration page with filling valid phone, valid email, valid first name, and invalid last name
    Given I am on the registration page
    Then All registration fields should be there
    When User fill phone with "0817805298" and user fill email with "bosbas97@gmail.com" and user fill first name with "BASKORO" and user fill last name with "0"
    And User wait for 1 seconds
    Then Daftar button should be disabled
    And I should see error message "Input harus berupa huruf"

  Scenario: [NEGATIVE] As a user, I want to fill Cermati Registration page with all valid but name characters count more than 100,
    Given I am on the registration page
    Then All registration fields should be there
    When User fill phone with "0817805298" and user fill email with "bosbas97@gmail.com" and user fill first name with "Lorem ipsum dolor sit amet consectetur adipiscing elit Ut magna eros pharetra eu fermentum sit amet euismod a elit Phasellus vel sollicitudin ex" and user fill last name with "Lorem ipsum dolor sit amet consectetur adipiscing elit Ut magna eros pharetra eu fermentum sit amet euismod a elit Phasellus vel sollicitudin ex"
    And User wait for 1 seconds
    Then Daftar button should be disabled
    And I should see error message "Jumlah karakter tidak boleh lebih dari 100"

  Scenario: [NEGATIVE] As a user, I want to fill Cermati Registration page with filling invalid phone (not starting with 08), valid email, valid first name, and valid last name
    Given I am on the registration page
    Then All registration fields should be there
    When User fill phone with "2317805298" and user fill email with "bosbas97@gmail.com" and user fill first name with "BASKORO" and user fill last name with "PRAMUDITO"
    And User wait for 1 seconds
    Then Daftar button should be disabled
    And I should see error message "Nomor handphone tidak valid"

  Scenario: [NEGATIVE] As a user, I want to fill Cermati Registration page with filling valid phone, invalid email (without using @), valid first name, and valid last name
    Given I am on the registration page
    Then All registration fields should be there
    When User fill phone with "0817805298" and user fill email with "bosbas97gmail.com" and user fill first name with "BASKORO" and user fill last name with "PRAMUDITO"
    And User wait for 1 seconds
    Then Daftar button should be disabled
    And I should see error message "Format email tidak valid"

  Scenario: [NEGATIVE] As a user, I want to fill Cermati Registration page with filling valid phone, invalid email (without using @), valid first name, and valid last name
    Given I am on the registration page
    Then All registration fields should be there
    When User fill phone with "0817805298" and user fill email with "bosbas97gmail.com" and user fill first name with "BASKORO" and user fill last name with "PRAMUDITO"
    And User wait for 1 seconds
    Then Daftar button should be disabled
    And I should see error message "Format email tidak valid"

  Scenario: [POSITIVE] As a user, I want to be able to click TnC Syarat dan Ketentuan
    Given I am on the registration page
    Then All registration fields should be there
    When User clicks TnC
    Then User should be able to redirect to "https://www.cermati.com/pages/terms-and-conditions"

  Scenario: [POSITIVE] As a user, I want to be able to click TnC Kebijakan Privasi
    Given I am on the registration page
    Then All registration fields should be there
    When User clicks Privacy Policy
    Then User should be able to redirect to "https://www.cermati.com/pages/privacy-policy"

  Scenario: [POSITIVE] As a user, I want to register in Cermati page
    Given I am on the registration page
    Then All registration fields should be there
    When User fill phone with "0817805298" and user fill email with "bosbas97@gmail.com" and user fill first name with "BASKORO" and user fill last name with "PRAMUDITO"
    And User wait for 1 seconds
    Then Daftar button should be enabled
    When User clicks the daftar button
    And User wait for 10 seconds
