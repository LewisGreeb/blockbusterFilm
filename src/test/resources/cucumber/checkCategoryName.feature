Feature: Get category name.
  Check the getter method returns the correct category name.

  Scenario: Category name is fantasy.
    Given the category is fantasy.
    When I ask what the category is.
    Then I should be told "fantasy"
