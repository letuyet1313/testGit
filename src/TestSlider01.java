import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestSlider01 {
	WebDriver driver;
	WebElement rangeSlide01;
	
	@BeforeClass
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://daominhdam.890m.com");
		driver.manage().window().maximize();
		
		rangeSlide01 = driver.findElement(By.id("slider-1"));
	}
	
	@Test
	public void Slide01IsEnable(){
		
		if(rangeSlide01.isEnabled()){
			System.out.println("Slider 01 is Enable!");
		}else{
			System.out.println("Slider 01 is Disable!");
		}
	}
	
	@Test
	public void Slide01IsSelected(){
		
		if(rangeSlide01.isSelected()){
			System.out.println("Slider 01 is Selected!");
		}else{
			System.out.println("Slider 01 isn't Selected!");
		}
	}
	
	@Test
	public void Slide01IsDisplay(){
		
		if(rangeSlide01.isDisplayed()){
			System.out.println("Slider 01 is Displayed!");
		}else{
			System.out.println("Slider 01 isn't Displayed!");
		}
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}

}