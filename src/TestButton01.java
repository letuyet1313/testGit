import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestButton01{
	WebDriver driver;
	WebElement bt1;
	
	@BeforeClass
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://daominhdam.890m.com");
		driver.manage().window().maximize();
		
		bt1 = driver.findElement(By.xpath(".//*[@id='button-disabled']"));
	}
	
	@Test
	public void Button1IsEnable(){
		
		if(bt1.isEnabled()){
			System.out.println("Button 1 is Enable!");
		}else{
			System.out.println("Button 1 is Disable!");
		}
	}
	
	@Test
	public void Button1IsSelected(){
		
		if(bt1.isSelected()){
			System.out.println("Button 1 is Selected!");
		}else{
			System.out.println("Button 1 isn't Selected!");
		}
	}
	
	@Test
	public void Button1IsDisplay(){
		
		if(bt1.isDisplayed()){
			System.out.println("Button 1 is Displayed!");
		}else{
			System.out.println("Button 1 isn't Displayed!");
		}
	}
	
	@Test
	public void DisplayLabelButton01(){
		Assert.assertEquals("Button is disabled", bt1.getText());
	}
	
	@Test
	public void SubmitButton1(){
		bt1.submit();
	}
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	
	
}
