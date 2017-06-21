import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestEducation {
	WebDriver driver;
	WebElement lbEdu, txaEdu;
	
	@BeforeClass
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://daominhdam.890m.com");
		driver.manage().window().maximize();
		
		lbEdu = driver.findElement(By.xpath("html/body/form/fieldset[2]/label[1]"));
		txaEdu = driver.findElement(By.xpath(".//*[@id='edu']"));
	}
	
	@Test
	public void LabelEducationIsEnable(){
		
		if(lbEdu.isEnabled()){
			System.out.println("Label Education is Enable!");
		}else{
			System.out.println("Label Education is Disable!");
		}
	}
	
	@Test
	public void LabelEducationIsSelected(){
		
		if(lbEdu.isSelected()){
			System.out.println("Label Education is Selected!");
		}else{
			System.out.println("Label Education isn't Selected!");
		}
	}
	
	@Test
	public void LabelEducationIsDisplay(){
		
		if(lbEdu.isDisplayed()){
			System.out.println("Label Education is Displayed!");
		}else{
			System.out.println("Label Education isn't Displayed!");
		}
	}
	
	@Test
	public void DisplayLabelEducation(){
		Assert.assertEquals("Education:", lbEdu.getText());
	}
	
	@Test
	public void TextareaEducationIsEnable(){
		
		if(txaEdu.isEnabled()){
			System.out.println("Textarea Education is Enable!");
		}else{
			System.out.println("Textarea Education is Disable!");
		}
	}
	
	@Test
	public void TextareaEducationIsSelected(){
		
		if(txaEdu.isSelected()){
			System.out.println("Textarea Education is Selected!");
		}else{
			System.out.println("Textarea Education isn't Selected!");
		}
	}
	
	@Test
	public void TextareaEducationIsDisplay(){
		
		if(txaEdu.isDisplayed()){
			System.out.println("Textarea Education is Displayed!");
		}else{
			System.out.println("Textarea Education isn't Displayed!");
		}
	}
	
	
	@Test
	public void InputEducation(){
		txaEdu.sendKeys("Education");
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
}
