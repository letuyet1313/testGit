import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestSlider02 {
	WebDriver driver;
	WebElement rangeSlide02;
	
	@BeforeClass
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://daominhdam.890m.com");
		driver.manage().window().maximize();
		
		rangeSlide02 = driver.findElement(By.id("slider-2"));
	}
	
	@Test
	public void Slide02IsEnable(){
		
		if(rangeSlide02.isEnabled()){
			System.out.println("Slider 02 is Enable!");
		}else{
			System.out.println("Slider 02 is Disable!");
		}
	}
	
	@Test
	public void Slide02IsSelected(){
		
		if(rangeSlide02.isSelected()){
			System.out.println("Slider 02 is Selected!");
		}else{
			System.out.println("Slider 02 isn't Selected!");
		}
	}
	
	@Test
	public void Slide02IsDisplay(){
		
		if(rangeSlide02.isDisplayed()){
			System.out.println("Slider 02 is Displayed!");
		}else{
			System.out.println("Slider 02 isn't Displayed!");
		}
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}

}