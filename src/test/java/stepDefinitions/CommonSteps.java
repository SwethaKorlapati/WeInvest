package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.pages.ExplorePortfolioPage;
import com.pages.HomePage;
import com.pages.SuggestionsPage;
import com.pages.WeatherPortfolioPage;
import com.utilities.*;

public class CommonSteps {

	WebDriver driver = BaseClass.driverInitiatlization();
	
	@Given("^user is on home page$")
	public void user_is_on_home_page() {
	   
	   driver.get(ConfigReader.getProperty("url"));
	   BaseClass.waitForLoad(driver);
	   
	}

	@When("^user clicks on Explore Investment Ideas$")
	public void user_clicks_on_Explore_Investment_Ideas()  {
	   HomePage.exploreInvestmentIdeas(driver).click();
	}

	@Then("^user clicks on customize portfolio$")
	public void user_clicks_on_customize_portfolio() {
		WeatherPortfolioPage.customizePortfolio(driver).click();
	}

	@Then("^user wants to enable edit controls$")
	public void user_wants_to_enable_edit_controls() {
	    ExplorePortfolioPage.customise(driver).click();
	    BaseClass.waitForLoad(driver);
	}
	@Then("^user changes the slider and clicks on Rebalance$")
	public void user_changes_the_slider_and_clicks_on_Rebalance() {
		WebElement slider = ExplorePortfolioPage.slider(driver);
		for (int i = 1; i <= 46; i++) {
			slider.sendKeys(Keys.ARROW_RIGHT);
		}
		ExplorePortfolioPage.reBalance(driver).click();
	}

	@Then("^user clicks on Invest Now$")
	public void user_clicks_on_Invest_Now() {
		ExplorePortfolioPage.investNow(driver).click();
	}
	
	@Then("^verify SPDR$")
	public void verify_spdr()
	{
		WebElement value = SuggestionsPage.spdrValue(driver);
		System.out.println(value.getText());
		Assert.assertEquals(value.getText(), "50");
	}
	
	@Then("^check text change to Reset$")
	public void check_text_change_to_Reset() {
		BaseClass.verify(driver).assertTrue(ExplorePortfolioPage.reset(driver).isDisplayed());
		BaseClass.verify(driver).assertAll();
	}

	@When("^user clicks on Add Stock$")
	public void user_clicks_on_Add_Stock() {
		ExplorePortfolioPage.addStock(driver).click();
	}

	@When("^adds stock for BT Grp plc$")
	public void adds_stock_for_BT_Grp_plc() throws InterruptedException {
		ExplorePortfolioPage.btAddStock(driver).click();
		ExplorePortfolioPage.done(driver).click();
		Thread.sleep(5000);
	}

	@Then("^stock should be added to the portfolio$")
	public void stock_should_be_added_to_the_portfolio(){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ExplorePortfolioPage.checkBTPortfolio(driver));
		Assert.assertTrue(ExplorePortfolioPage.checkBTPortfolio(driver).isDisplayed());
	}
		
}
