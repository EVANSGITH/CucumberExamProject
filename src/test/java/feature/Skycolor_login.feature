@End2End
Feature: Validate background color change

Background:
Given user is on the techfios test page


@Scenario1
Scenario: User should be able to Click the set Blue Background button
When user clicks on set skyBlue background button
Then the background color should change to skyBlue

@Scenario2
Scenario: User should be able to click set white background button
When user clicks on the set white background button
Then the background color should change to white
  
