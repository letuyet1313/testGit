import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;


public class TestBiography {
	WebDriver driver;
	WebElement lbBio, txaBio;
	
	@BeforeClass
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://daominhdam.890m.com");
		driver.manage().window().maximize();
		
		lbBio = driver.findElement(By.xpath("html/body/form/fieldset[2]/label[2]"));
		txaBio = driver.findElement(By.xpath(".//*[@id='bio']"));
		
	}
	
	@Test
	public void LabelBiographyIsEnable(){
		
		if(lbBio.isEnabled()){
			System.out.println("Label Biography is Enable!");
		}else{
			System.out.println("Label Biography is Disable!");
		}
	}
	
	@Test
	public void LabelBiographyIsSelected(){
		
		if(lbBio.isSelected()){
			System.out.println("Label Biography is Selected!");
		}else{
			System.out.println("Label Biography isn't Selected!");
		}
	}
	
	@Test
	public void LabelBiographyIsDisplay(){
		
		if(lbBio.isDisplayed()){
			System.out.println("Label Biography is Displayed!");
		}else{
			System.out.println("Label Biography isn't Displayed!");
		}
	}
	
	@Test
	public void DisplayLabelBiography(){
		Assert.assertEquals("Biography:", lbBio.getText());
	}
	
	@Test
	public void TextareaBiographyIsEnable(){
		
		if(txaBio.isEnabled()){
			System.out.println("Textarea Biography is Enable!");
		}else{
			System.out.println("Textarea Biography is Disable!");
		}
	}
	
	@Test
	public void TextareaBiographyIsSelected(){
		
		if(txaBio.isSelected()){
			System.out.println("Textarea Biography is Selected!");
		}else{
			System.out.println("Textarea Biography isn't Selected!");
		}
	}
	
	@Test
	public void TextareaBiographyIsDisplay(){
		
		if(txaBio.isDisplayed()){
			System.out.println("Textarea Biography is Displayed!");
		}else{
			System.out.println("Textareax Biography isn't Displayed!");
		}
	}
	
	@Test
	public void InputBiography(){
		txaBio.sendKeys("Biography");
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
}
