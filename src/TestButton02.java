import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestButton02{
	WebDriver driver;
	WebElement bt2;
	
	@BeforeClass
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://daominhdam.890m.com");
		driver.manage().window().maximize();
		
		bt2 = driver.findElement(By.xpath(".//*[@id='button-enabled']"));
	}
	
	@Test
	public void Button2IsEnable(){
		
		if(bt2.isEnabled()){
			System.out.println("Button 2 is Enable!");
		}else{
			System.out.println("Button 2 is Disable!");
		}
	}
	
	@Test
	public void Button2IsSelected(){
		
		if(bt2.isSelected()){
			System.out.println("Button 2 is Selected!");
		}else{
			System.out.println("Button 2 isn't Selected!");
		}
	}
	
	@Test
	public void Button2IsDisplay(){
		
		if(bt2.isDisplayed()){
			System.out.println("Button 2 is Displayed!");
		}else{
			System.out.println("Button 2 isn't Displayed!");
		}
	}
	
	@Test
	public void DisplayLabelButton02(){
		Assert.assertEquals("Button is enabled", bt2.getText());
	}
	
	@Test
	public void SubmitButton1(){
		bt2.submit();
	}
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	
	
}
