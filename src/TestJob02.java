import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestJob02 {
	WebDriver driver;
	WebElement lbdropList02, dropList02;
	
	
	@BeforeClass
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://daominhdam.890m.com");
		driver.manage().window().maximize();
		
		lbdropList02 = driver.findElement(By.xpath("html/body/form/fieldset[2]/label[4]"));
		dropList02 = driver.findElement(By.xpath(".//*[@id='job2']"));
		
	}
	
	@Test
	public void LabelJob02IsEnable(){
		
		if(lbdropList02.isEnabled()){
			System.out.println("Label Job02 is Enable!");
		}else{
			System.out.println("Label Job02 is Disable!");
		}
	}
	
	@Test
	public void LabelJob02IsSelected(){
		
		if(lbdropList02.isSelected()){
			System.out.println("Label Job02 is Selected!");
		}else{
			System.out.println("Label Job02 isn't Selected!");
		}
	}
	
	@Test
	public void LabelJob02IsDisplay(){
		
		if(lbdropList02.isDisplayed()){
			System.out.println("Label Job02 is Displayed!");
		}else{
			System.out.println("Label Job02 isn't Displayed!");
		}
	}
	
	@Test
	public void DisplayLabelJob02(){
		Assert.assertEquals("Job Role 02:", lbdropList02.getText());
	}
	
	@Test
	public void DropdownListJob02IsEnable(){
		
		if(dropList02.isEnabled()){
			System.out.println("DropdownList Job02 is Enable!");
		}else{
			System.out.println("DropdownList Job02 is Disable!");
		}
	}
	
	@Test
	public void DropdownListJob02IsSelected(){
		
		if(dropList02.isSelected()){
			System.out.println("DropdownList Job02 is Selected!");
		}else{
			System.out.println("DropdownList Job02 isn't Selected!");
		}
	}
	
	@Test
	public void DropdownListJob02IsDisplay(){
		
		if(dropList02.isDisplayed()){
			System.out.println("DropdownList Job02 is Displayed!");
		}else{
			System.out.println("DropdownList Job02 isn't Displayed!");
		}
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
}