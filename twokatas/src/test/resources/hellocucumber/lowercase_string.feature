Feature: Is the string lowercase?
  Everybody wants to know if the string is lowercase


Scenario: aBc should be lowercased to abc
  Given an input string "aBc"
  When I lowercase the string
  Then I should return the string "abc"

  Scenario: No input string to lowercase
    Given no input string
    When I reverse the string
    Then I should return the string "no input"
