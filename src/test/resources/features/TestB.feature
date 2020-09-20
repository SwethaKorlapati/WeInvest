Feature: TestB

@FunctionalTest
Scenario: Automating TestB scenario
Given user is on home page
When user clicks on Explore Investment Ideas
Then user clicks on customize portfolio
And user wants to enable edit controls 
Then check text change to Reset
When user clicks on Add Stock
And adds stock for BT Grp plc
Then stock should be added to the portfolio
