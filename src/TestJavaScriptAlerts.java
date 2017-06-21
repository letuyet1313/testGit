import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestJavaScriptAlerts {
	WebDriver driver;
	WebElement btAlert, btConfirm, btPrompt;
	
	@BeforeClass
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://daominhdam.890m.com");
		driver.manage().window().maximize();
		
		btAlert = driver.findElement(By.xpath(".//*[@id='content']/div/ul/li[1]/button"));
		btConfirm = driver.findElement(By.xpath(".//*[@id='content']/div/ul/li[2]/button"));
		btPrompt = driver.findElement(By.xpath(".//*[@id='content']/div/ul/li[3]/button"));
	}
	
	@Test
	public void checkJSAlert(){
		btAlert.click();
		Alert alertAlert = driver.switchTo().alert();
		Assert.assertEquals("I am a JS Alert", alertAlert.getText());
		alertAlert.accept();
	}
	
	@Test
	public void checkJSConfirmOk(){
		btConfirm.click();
		Alert alertComfirm = driver.switchTo().alert();
		Assert.assertEquals("I am a JS Confirm", alertComfirm.getText());
		alertComfirm.accept();
	}
	
	@Test
	public void checkJSConfirmCancel(){
		btConfirm.click();
		Alert alertComfirm = driver.switchTo().alert();
		Assert.assertEquals("I am a JS Confirm", alertComfirm.getText());
		alertComfirm.dismiss();
	}
	
	@Test
	public void checkJSPrompt(){
		btPrompt.click();
		Alert alertPrompt = driver.switchTo().alert();
		Assert.assertEquals("I am a JS prompt",alertPrompt.getText());
		alertPrompt.sendKeys("This is a prompt pop up");
		alertPrompt.accept();
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}

}