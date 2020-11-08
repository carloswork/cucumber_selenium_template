Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser is open for TestProject
    And user is on login page "https://example.testproject.io/web/"
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to the home page

    Examples:
    | username | password |
    | "Tom" | "12345" |
    | "Peter" | "12345" |