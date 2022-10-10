Feature: Is the string capitalized?
  Everybody wants to know if the string is capitalized

Scenario: aBc should be capitalized to ABC
  Given an input string "aBc"
  When I capitalize the string
  Then I should return the string "ABC"

  Scenario: No input string to capitalize
    Given no input string
    When I reverse the string
    Then I should return the string "no input"
