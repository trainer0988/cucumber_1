package pages.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPageLocators {
	@FindBy(how = How.XPATH, using = "//input[@id = 'FirstName']")
	public WebElement firstName;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id = 'LastName']")
	public WebElement lastName;

}
