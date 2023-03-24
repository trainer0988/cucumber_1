package pages.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageLocators {
	
	@FindBy(how = How.XPATH, using = "(//div[@class = 'master-wrapper-page']//ul)[8]/li[3]")
	public WebElement profile;
	
	
	@FindBy(how = How.XPATH, using = "//span[text() = 'Register']")
	public WebElement register;
	
	
	

}
