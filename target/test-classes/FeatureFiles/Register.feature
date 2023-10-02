Feature: Registration Functionality Scenario

  Scenario: Verify whether user is able to regiter into the application by providing  all the details
    Given User launches the application
    And User Navigates to Registration page
    When User fills the below details
      | FirstName | Mohammad        |
      | Lastname  | Hamza           |
      | email     | abc@yopmail.com |
      | Telephone |      8765654345 |
      | Paassword | Test@123        |
    And User clicks on the privacy policy
    And User clicks on the continue button
    Then User should see that Account has been created successfully