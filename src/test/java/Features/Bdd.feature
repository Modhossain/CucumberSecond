@tag
Feature: Title of my login feature
  Scenario Outline: As a registed user, I should be able to login Osa forum 
   Given I open the browser 
    And I Click on forum button 
   And I enter the username <username>
    And I enter the password <password>
    When I click on login button
    Then I close the browser
Examples: 
|username|password|
|"mhossain745"|"648757"|
|"ytyafs"|"08230582"|
