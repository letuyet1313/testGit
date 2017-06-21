import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestAge {
	WebDriver driver;
	WebElement rb_age, rb_age01, rb_age02, rb_age03;
	@BeforeClass
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://daominhdam.890m.com");
		driver.manage().window().maximize();
		
		rb_age = driver.findElement(By.xpath("html/body/form/fieldset[1]/label[3]")); 
		rb_age01 = driver.findElement(By.xpath("html/body/form/fieldset[1]/label[4]"));
		rb_age02 = driver.findElement(By.xpath("html/body/form/fieldset[1]/label[5]"));
		rb_age03 = driver.findElement(By.xpath("html/body/form/fieldset[1]/label[6]"));
	}
	
	
	@Test
	public void RadioAgeIsEnable(){
		
		if(rb_age.isEnabled()){
			System.out.println("Radio Age is Enabled!");
		}else{
			System.out.println("Radio Age is Disabled!");
		}
	}
	
	@Test
	public void RadioAgeIsSelected(){
		
		if(rb_age.isSelected()){
			System.out.println("Radio Age is Selected!");
		}else{
			System.out.println("Radio Age isn't Selected!");
		}
	}
	
	@Test
	public void RadioAgeIsDisplay(){
		
		if(rb_age.isDisplayed()){
			System.out.println("Radio Age is Displayed!");
		}else{
			System.out.println("Radio Age isn't Displayed!");
		}
	}
	
	@Test
	public void DisplayLabelAge(){
		Assert.assertEquals("Age:", rb_age.getText());
	}
	
	@Test
	public void RadioIsEnable_1(){
		
		if(rb_age01.isEnabled()){
			System.out.println("Radio Under 18 is Enabled!");
		}else{
			System.out.println("Radio Under 18 is Disabled!");
		}
	}
	
	@Test
	public void RadioIsSelected_1(){
		
		if(rb_age01.isSelected()){
			System.out.println("Radio Under 18 is Selected!");
		}else{
			System.out.println("Radio Under 18 isn't Selected!");
		}
	}
	
	@Test
	public void RadioIsDisplay_1(){
		
		if(rb_age01.isDisplayed()){
			System.out.println("Radio Under 18 is Displayed!");
		}else{
			System.out.println("Radio Under 18 isn't Displayed!");
		}
	}
	
	@Test
	public void DisplayLabelAge_1(){
		Assert.assertEquals("Under 18", rb_age01.getText());
	}
	
	@Test
	public void RadioClick_1(){
		rb_age01.click();
	}
	
	@Test
	public void RadioIsEnable_2(){
		
		if(rb_age02.isEnabled()){
			System.out.println("Radio 18 or older is Enable!");
		}else{
			System.out.println("Radio 18 or older is Disable!");
		}
	}
	
	@Test
	public void RadioIsSelected_2(){
		
		if(rb_age02.isSelected()){
			System.out.println("Radio 18 or older is Selected!");
		}else{
			System.out.println("Radio 18 or older isn't Selected!");
		}
	}
	
	@Test
	public void RadioIsDisplay_2(){
		
		if(rb_age02.isDisplayed()){
			System.out.println("Radio 18 or older is Displayed!");
		}else{
			System.out.println("Radio 18 or older isn't Displayed!");
		}
	}
	
	@Test
	public void DisplayLabelAge_2(){
		Assert.assertEquals("18 or older", rb_age02.getText());
	}
	
	@Test
	public void RadioClick_2(){
		rb_age02.click();
	}
	
	@Test
	public void RadioIsEnable_3(){
		
		if(rb_age03.isEnabled()){
			System.out.println("Radiobutton is Enable!");
		}else{
			System.out.println("Radiobutton is Disable!");
		}
	}
	
	@Test
	public void RadioIsSelected_3(){
		
		if(rb_age03.isSelected()){
			System.out.println("Radiobutton is Selected!");
		}else{
			System.out.println("Radiobutton isn't Selected!");
		}
	}
	
	@Test
	public void RadioIsDisplay_3(){
		
		if(rb_age03.isDisplayed()){
			System.out.println("Radiobutton is Displayed!");
		}else{
			System.out.println("Radiobutton isn't Displayed!");
		}
	}
	
	@Test
	public void DisplayLabelAge_3(){
		Assert.assertEquals("Radiobutton is disabled", rb_age03.getText());
	}
	
	@Test
	public void RadioClick_3(){
		rb_age03.click();
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	
	
}
