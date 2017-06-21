import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestInterests {
	WebDriver driver;
	WebElement CkbInterests, CkbDev, CkbDesign, CkbOther;
	
	@BeforeClass
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://daominhdam.890m.com");
		driver.manage().window().maximize();
		
		CkbInterests = driver.findElement(By.xpath("html/body/form/fieldset[2]/label[5]"));
		CkbDev = driver.findElement(By.xpath("html/body/form/fieldset[2]/label[6]"));
		CkbDesign = driver.findElement(By.xpath("html/body/form/fieldset[2]/label[7]"));
		CkbOther = driver.findElement(By.xpath("html/body/form/fieldset[2]/label[8]"));
	}
	
	@Test
	public void LabelInterestsIsEnable(){
		
		if(CkbInterests.isEnabled()){
			System.out.println("Label Interests is Enable!");
		}else{
			System.out.println("Label Interests is Disable!");
		}
	}
	
	@Test
	public void LabelInterestsIsSelected(){
		
		if(CkbInterests.isSelected()){
			System.out.println("Label Interests is Selected!");
		}else{
			System.out.println("Label Interests isn't Selected!");
		}
	}
	
	@Test
	public void LabelInterestsIsDisplay(){
		
		if(CkbInterests.isDisplayed()){
			System.out.println("Label Interests is Displayed!");
		}else{
			System.out.println("Label Interests isn't Displayed!");
		}
	}
	
	@Test
	public void DisplayLabelInterests(){
		Assert.assertEquals("Interests:", CkbInterests.getText());
	}
	
	@Test
	public void InterestDevIsEnable(){
		
		if(CkbDev.isEnabled()){
			System.out.println("Interest Development is Enable!");
		}else{
			System.out.println("Interest Development is Disable!");
		}
	}
	
	@Test
	public void InterestDevIsSelected(){
		
		if(CkbDev.isSelected()){
			System.out.println("Interest Development is Selected!");
		}else{
			System.out.println("Interest Development isn't Selected!");
		}
	}
	
	@Test
	public void InterestDevIsDisplay(){
		
		if(CkbDev.isDisplayed()){
			System.out.println("Interest Development is Displayed!");
		}else{
			System.out.println("Interest Development isn't Displayed!");
		}
	}
	
	@Test
	public void InterestDevClick(){
		CkbDev.click();
	}

	
	@Test
	public void InterestDesignIsEnable(){
		
		if(CkbDesign.isEnabled()){
			System.out.println("Interest Design is Enable!");
		}else{
			System.out.println("Interest Design is Disable!");
		}
	}
	
	@Test
	public void InterestDesignIsSelected(){
		
		if(CkbDesign.isSelected()){
			System.out.println("Interest Design is Selected!");
		}else{
			System.out.println("Interest Design isn't Selected!");
		}
	}
	
	@Test
	public void InterestDesignIsDisplay(){
		
		if(CkbDesign.isDisplayed()){
			System.out.println("Interest Design is Displayed!");
		}else{
			System.out.println("Interest Design isn't Displayed!");
		}
	}
	
	@Test
	public void InterestDesignClick(){
		CkbDesign.click();
	}
	
	@Test
	public void InterestOtherIsEnable(){
		
		if(CkbOther.isEnabled()){
			System.out.println("Interest Other is Enable!");
		}else{
			System.out.println("Interest Other is Disable!");
		}
	}
	
	@Test
	public void InterestOtherIsSelected(){
		
		if(CkbOther.isSelected()){
			System.out.println("Interest Other is Selected!");
		}else{
			System.out.println("Interest Other isn't Selected!");
		}
	}
	
	@Test
	public void InterestOtherIsDisplay(){
		
		if(CkbOther.isDisplayed()){
			System.out.println(" Interest Other is Displayed!");
		}else{
			System.out.println("Interest Other isn't Displayed!");
		}
	}
	
	@Test
	public void InterestOtherClick(){
		CkbOther.click();
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}

}
