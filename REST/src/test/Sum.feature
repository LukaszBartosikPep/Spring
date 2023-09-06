Feature: Test sum
  Scenario: Testing sum of numbers
    Given I test Calculator

    When I give first number
    And I give second number
    And I switch an operator
    And I use the operator on given numbers

    Then Result should be 12