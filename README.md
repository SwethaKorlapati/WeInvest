# Steps to execute the code
1. Download and install Eclipse https://www.eclipse.org/downloads/packages/
2. Install Natural plugin from Help --> Eclipse Marketplace
3. Import the project to Eclipse, File --> Import --> Existing Maven project
4. Path for runner class: WeInvest_Assignment\src\test\java\testRunner

### Runner_TestA: Teststeps

1. Navigate to https://sfo-demo.herokuapp.com/model-portfolio
2. Select “All Weather Strategy” by clicking on “Explore Investment Ideas” 
3. In next screen click on button “Customize Portfolio” to make changes to portfolio 
4. Click on “Customize” button to enable edit controls 
5. Change slider of “ SPDR S&P 500 ETF TRUST SPY US EQUITY ” to 50% 
6. Click on “Rebalance” button 7. Click on “Invest” button 
8. On next page” verify that “SPDR…” under “What your portfolio contain ?” to be 50%

##### Output
```
When user clicks on Explore Investment Ideas................................passed
Then user clicks on customize portfolio.....................................passed
And user wants to enable edit controls......................................passed
Then user changes the slider and clicks on Rebalance........................passed
Then user clicks on Invest Now..............................................passed
Then verify SPDR............................................................failed
```

### Runner_TestB: Teststeps

1. Navigate to https://sfo-demo.herokuapp.com/model-portfolio  
2. Select “All Weather Strategy” by clicking on “Explore Investment Ideas” 
3. In next screen click on button “Customize Portfolio” to make changes to portfolio 
4. Click on “Customize” button to enable edit controls 
5. Click on “Customise” button and ensure the text change to “Reset” 
6. Click on “+Add Stock”  
7. Click “Add Stock” in “BT Group plc” row. 
8. Click on “Done” 
9. Check whether “BT Group plc” is added to the portfolio 

##### Output
```
When user clicks on Explore Investment Ideas................................passed
Then user clicks on customize portfolio.....................................passed
And user wants to enable edit controls......................................passed
Then check text change to Reset.............................................passed
When user clicks on Add Stock...............................................passed
And adds stock for BT Grp plc...............................................passed
Then stock should be added to the portfolio.................................passed
```
