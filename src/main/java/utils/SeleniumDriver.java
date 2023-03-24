package utils;

import java.time.Duration;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {
	
	private static SeleniumDriver seleniumDriver;
	
	private static WebDriver driver;
	private static Actions actions;
	private TakesScreenshot takesScreenshot;
	private static WebDriverWait wait;
	private final static int timeout = 30;
	private final static int page_load_timeout=50;
	
	public SeleniumDriver()
	{
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(page_load_timeout));
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(page_load_timeout));
	}
	
	public static void openPage(String url)
	{
		driver.get(url);
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	public TakesScreenshot getScreenshot()
	{
		return (TakesScreenshot)driver;
	}
	
	public static Actions getActions()
	{
		return actions;
	}
	
	public static void setUpDriver()
	{
		if(seleniumDriver==null)
		{
			seleniumDriver = new SeleniumDriver();
		}
	}
	
	public static void tearDown()
	{
		if(driver!=null)
		{
			driver.quit();
		}
		seleniumDriver = null;
		
	}

}
