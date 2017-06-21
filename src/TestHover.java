import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestHover {
	WebDriver driver;
	WebElement ima1;
	
	@BeforeClass
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://daominhdam.890m.com");
		driver.manage().window().maximize();
		
		ima1 = driver.findElement(By.xpath("html/body/form/fieldset[7]/div[1]/img"));
	}
	
	@Test
	public void checkHover(){
		Actions actions = new Actions(driver);
		actions.moveToElement(ima1).moveToElement(driver.findElement(By.xpath("html/body/form/fieldset[7]/div[1]/div/a"))).click().perform();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.titleContains("SELENIUM WEBDRIVER FORM DEMO"));
		
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}

}