package org.selenium.test;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class TestEmail {
	public WebDriver driver;
	WebElement tx_email = driver.findElement(By.xpath(".//*[@id='mail']"));
	
	@BeforeMethod
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
		//options.setBinary("C:/Users/Teko/AppData/Local/CocCoc/Browser/Application/browser.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://daominhdam.890m.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void EmailIsEnable(){
		
		if(tx_email.isEnabled()){
			System.out.println("Textbox Email is Enable!");
		}else{
			System.out.println("Textbox Email is Disable!");
		}
	}
	
	@Test
	public void EmailIsSelected(){
		
		if(tx_email.isSelected()){
			System.out.println("Textbox Email is Selected!");
		}else{
			System.out.println("Textbox Email is Selected!");
		}
	}
	
	@Test
	public void EmailIsDisplay(){
		
		if(tx_email.isDisplayed()){
			System.out.println("Textbox Email is Displayed!");
		}else{
			System.out.println("Textbox Email is Displayed!");
		}
	}
	
	@Test
	public void InputEmail(){
		tx_email.sendKeys("email");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
