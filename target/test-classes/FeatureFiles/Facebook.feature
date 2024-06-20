Feature: New Account in Facebook

  Background: Application Launch
    Given User Launch Facebook Application "https://www.facebook.com/"
@sanity
  Scenario Outline: Create New Accounts for Multiple Users
    Given user click Create new account
    When user pass first name "<first name>"
    And user pass surname "<last name>"
    And user pass mobile number "<mobile number>"
    And user pass password "<password>"
    And user pass date "<date>"
    And user pass month "<month>"
    And user pass year "<year>"
    And user click gender
    Then user click signup "<screenshot>"

    Examples: 
      | first name | last name | date | month | year | mobile number | password  | screenshot   |
      | vijay      | R         |   17 | Aug   | 2001 | 6379695997    | vijay2001 | s1           |
     