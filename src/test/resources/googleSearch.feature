Feature: Google search

  Scenario: Google search is working
    Given browser is open
    And user is on google search page "https://google.com"
    When user enters "hello world" in google search box
    And hits Enter
    Then user is navigated to the search results page "\"Hello, World!\" program"
