import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestTable {
	WebDriver driver;
	WebElement headerNumber, titleDisplay, linkDisplay;
	WebElement innerText;
	
	@BeforeClass
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://daominhdam.890m.com");
		driver.manage().window().maximize();
		
		//headerNumber = driver.findElement(By.id(".//*[@id='table-column-toggle']/thead/tr/th[1]"));
		//titleDisplay = driver.findElement(By.id(".//*[@id='table-column-toggle']/tbody/tr[1]/td[1]/a"));
		//linkDisplay = driver.findElement(By.linkText("Element is display"));
		innerText = driver.findElement(By.xpath("//fieldset/table/tbody/tr[1]/td[2]"));
	}
	
	@Test
	public void DisplayInner(){
		Assert.assertEquals("2013", innerText.getText());
	}
	
	@Test
	public void AccessLinkElementIsDisplay(){
		driver.findElement(By.linkText("Element is display")).click();
		Assert.assertEquals("[Java – Webdriver 08] – Kiểm tra phần tử hiển thị trên page – Automation Testing Tutorials", driver.getTitle());
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}

}