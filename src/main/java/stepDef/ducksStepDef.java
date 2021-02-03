package stepDef;

import java.io.IOException;

import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SearchDuckPage;
import pages.ducksHomePage;
import pages.testBase;

public class ducksStepDef extends testBase {

	SearchDuckPage srPage;
	ducksHomePage duckPage;

	
	@Given("^User in Google page$")
	public void user_in_Google_page() throws Throwable {

		CreateReport();
		Initialize_The_Browser();

		
		// Creating the SearchPage object
		srPage = new SearchDuckPage();
		logger = report.startTest("Ducks search Test is started");
		logger.log(LogStatus.PASS, "URL is launched successfully");

		String title = srPage.GoogleTitle();
		System.out.println("Title of the page : " + title);
		Assert.assertEquals(title, "Google");

		logger.log(LogStatus.INFO, "User is in home page");

	}

	@When("^User enters ducks in search field and press enter key$")
	public void user_enters_in_search_field_and_press_enter_key() throws Throwable {
	duckPage = new ducksHomePage();
		srPage = new SearchDuckPage();
		
		logger = report.startTest("User enters ducks in search field and press enter key");
		logger.log(LogStatus.INFO, "User enters ducks in search field and prees enter key");
		duckPage = srPage.SearchDucks("ducks");
		Thread.sleep(2000);

	}

	@Then("^User should able to see ducks page$")
	public void user_should_able_to_see_duchs_page() throws Throwable {
		logger = report.startTest("User should able to see ducks page");
		duckPage = new ducksHomePage();
		String title = duckPage.ducksHomePageTitle();
		System.out.println("Title= " + title);
		logger.log(LogStatus.INFO, "Ducks Home page title "+ "\""+ title +"\""+" is displayed");
		logger.log(LogStatus.INFO, "User is in ducks home page");
		Assert.assertEquals(title, "ducks - Google Search");
	}

	@Then("^Verify ducks were properly searched$")
	public void verify_ducks_were_properly_searched() throws Throwable {

		logger = report.startTest("Verify ducks were properly searched");
		duckPage = new ducksHomePage();

		boolean duck_text = duckPage.Verify_ducksText();
		logger.log(LogStatus.INFO, "Ducks were properly Searched");
		System.out.println("Ducks were searched:" + duck_text);

		Assert.assertTrue(duck_text);
		logger.log(LogStatus.PASS, "Test is Passed");
		close_The_Browser();
		CloseReport();



	}

	
}
