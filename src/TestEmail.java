import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestEmail {
	WebDriver driver;
	WebElement lbEmail, txEmail;
	
	@BeforeClass
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://daominhdam.890m.com");
		driver.manage().window().maximize();
		
		lbEmail = driver.findElement(By.xpath("html/body/form/fieldset[1]/label[1]"));
		txEmail = driver.findElement(By.xpath(".//*[@id='mail']"));
	}
	
	@Test
	public void LabelEmailIsEnable(){
		
		if(lbEmail.isEnabled()){
			System.out.println("Label Email is Enable!");
		}else{
			System.out.println("Label Email is Disable!");
		}
	}
	
	@Test
	public void LabelEmailIsSelected(){
		
		if(lbEmail.isSelected()){
			System.out.println("Label Email is Selected!");
		}else{
			System.out.println("Label Email isn't Selected!");
		}
	}
	
	@Test
	public void LabelEmailIsDisplay(){
		
		if(lbEmail.isDisplayed()){
			System.out.println("Label Email is Displayed!");
		}else{
			System.out.println("Label Email isn't Displayed!");
		}
	}
	
	@Test
	public void DisplayLabelEmail(){
		Assert.assertEquals("Email:", lbEmail.getText());
	}
	
	@Test
	public void TextboxEmailIsEnable(){
		
		if(txEmail.isEnabled()){
			System.out.println("Textbox Email is Enable!");
		}else{
			System.out.println("Textbox Email is Disable!");
		}
	}
	
	@Test
	public void TextboxEmailIsSelected(){
		
		if(txEmail.isSelected()){
			System.out.println("Textbox Email is Selected!");
		}else{
			System.out.println("Textbox Email isn't Selected!");
		}
	}
	
	@Test
	public void TextboxEmailIsDisplay(){
		
		if(txEmail.isDisplayed()){
			System.out.println("Textbox Email is Displayed!");
		}else{
			System.out.println("Textbox Email isn't Displayed!");
		}
	}
	
	@Test
	public void InputTextboxEmail(){
		txEmail.sendKeys("email");
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}

}
