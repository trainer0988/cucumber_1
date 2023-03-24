package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.action.HomePageActions;
import utils.SeleniumDriver;

public class Registration {
	HomePageActions homePageActions = new HomePageActions();

	@Given("I am on the home page {string}")
	public void i_am_on_the_home_page(String string) {
	    System.out.println("Url : " +string);
	    SeleniumDriver.openPage(string);
	}

	@When("I move to the user profile")
	public void i_move_to_the_user_profile() {
	    System.out.println("move to profile");
	    homePageActions.moveToProfile();
	    
	}

	@And("click on register")
	public void click_on_register() {
	   System.out.println("click on registration");
	   homePageActions.clickOnRegister();
	}

	@Then("Registration page should be displayed")
	public void registration_page_should_be_displayed() {
	   System.out.println("page displayed");
	   System.out.println(SeleniumDriver.getDriver().getTitle());
	}

	@And("url should be {string}")
	public void url_should_be(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("expecetd url : " +string);
	    System.out.println(SeleniumDriver.getDriver().getCurrentUrl());
	}

	
}
