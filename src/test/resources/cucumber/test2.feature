Feature: Is it not Friday?
  Everybody wants to know when it's not Friday

  Scenario: Tuesday is not Friday
    Given today is Tuesday
    When I ask whether today is not Friday
    Then I should be told "Yes"

  Scenario: Friday is Friday
    Given today is Friday
    When I ask whether today is not Friday
    Then I should be told "No"