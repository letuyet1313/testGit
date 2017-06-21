import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestPassword {
	WebDriver driver;
	WebElement lbPassword, txPassword;
	
	@BeforeClass
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://daominhdam.890m.com");
		driver.manage().window().maximize();
		
		lbPassword = driver.findElement(By.xpath("html/body/form/fieldset[1]/label[2]"));
		txPassword = driver.findElement(By.xpath(".//*[@id='password']"));
	}
	
	@Test
	public void LabelPasswordIsEnable(){
		
		if(lbPassword.isEnabled()){
			System.out.println("Label Password is Enable!");
		}else{
			System.out.println("Label Password is Disable!");
		}
	}
	
	@Test
	public void LabelPasswordIsSelected(){
		
		if(lbPassword.isSelected()){
			System.out.println("Label Password is Selected!");
		}else{
			System.out.println("Label Password isn't Selected!");
		}
	}
	
	@Test
	public void LabelPasswordIsDisplay(){
		
		if(lbPassword.isDisplayed()){
			System.out.println("Label Password is Displayed!");
		}else{
			System.out.println("Label Password isn't Displayed!");
		}
	}
	
	@Test
	public void DisplayLabelPassword(){
		Assert.assertEquals("Password:", lbPassword.getText());
	}
	
	@Test
	public void TextboxPasswordIsEnable(){
		
		if(txPassword.isEnabled()){
			System.out.println("Textbox Password is Enable!");
		}else{
			System.out.println("Textbox Password is Disable!");
		}
	}
	
	@Test
	public void TextboxPasswordIsSelected(){
		
		if(txPassword.isSelected()){
			System.out.println("Textbox Password is Selected!");
		}else{
			System.out.println("Textbox Password isn't Selected!");
		}
	}
	
	@Test
	public void TextboxPasswordIsDisplay(){
		
		if(txPassword.isDisplayed()){
			System.out.println("Textbox Password is Displayed!");
		}else{
			System.out.println("Textbox Password isn't Displayed!");
		}
	}
	
	@Test
	public void InputTextboxPassword(){
		txPassword.sendKeys("password");
		
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	
	
}
