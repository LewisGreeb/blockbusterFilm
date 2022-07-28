Feature: Get language name.
  Check the getter method returns the correct language name.

  Scenario: Language name is English.
    Given the language is English.
    When I ask what the language is.
    Then I should be told "English"
