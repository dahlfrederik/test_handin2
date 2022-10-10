Feature: Is the string reversed?
  Everybody wants to know if the string is reversed

  Scenario: Input string should be reversed
    Given an input string "aBc"
    When I reverse the string
    Then I should return the string "cBa"

  Scenario: No input string to reverse
    Given no input string
    When I reverse the string
    Then I should return the string "no input"

