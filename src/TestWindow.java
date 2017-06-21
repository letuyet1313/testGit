import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestWindow {
	WebDriver driver;
	WebElement linkClick;
	
	@BeforeClass
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://daominhdam.890m.com");
		driver.manage().window().maximize();
		
		//linkClick = driver.findElement(By.xpath("html/body/form/fieldset[5]/a"));
	}
	
	@Test
	public void clickHere(){
		driver.findElement(By.linkText("Click Here")).click();
		System.out.println(driver.getTitle());
		//Assert.assertEquals("Google", driver.getTitle());
		

	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
}