package config;
 
import java.util.concurrent.TimeUnit;

import static executionEngine.DriverScript.OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Log;
 
public class ActionKeywords {
 
		public static WebDriver driver;
 
	public static void openBrowser(String object){		
		Log.info("Opening Browser");
		System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
 
	public static void navigate(String object){	
		Log.info("Navigating to URL");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constants.URL);
		}
 
	public static void click(String object){
		Log.info("Clicking on Webelement "+ object);
		driver.findElement(By.xpath(OR.getProperty(object))).click();
		}
 
	public static void input_UserName(String object){
		Log.info("Entering the text in UserName");
		driver.findElement(By.xpath(OR.getProperty(object))).sendKeys(Constants.UserName); 
		}
 
	public static void input_Password(String object){
		Log.info("Entering the text in Password");
		driver.findElement(By.xpath(OR.getProperty(object))).sendKeys(Constants.Password);
		}
 
	public static void waitFor(String object) throws Exception{
		Log.info("Wait for 5 seconds");
		Thread.sleep(5000);
		}
 
	public static void closeBrowser(String object){
		Log.info("Closing the browser");
		driver.quit();
		}
 
	}