package pages.action;

import org.openqa.selenium.support.PageFactory;

import pages.locator.HomePageLocators;
import utils.SeleniumDriver;

public class HomePageActions {
	
	HomePageLocators homePageLocators;
	
	public HomePageActions()
	{
		homePageLocators = new HomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), homePageLocators);
	}

	
	public void moveToProfile()
	{
		SeleniumDriver.getActions().moveToElement(homePageLocators.profile).build().perform();
	}
	
	public void clickOnRegister()
	{
		homePageLocators.register.click();
	}
}
