import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestFile {
	WebDriver driver;
	WebElement downloadFile;
	
	@BeforeClass
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://daominhdam.890m.com");
		driver.manage().window().maximize();
		
		downloadFile = driver.findElement(By.xpath("html/body/form/fieldset[6]/a"));
	}
	
	@Test
	public void checkDownload(){
		String sourceLocator = downloadFile.getAttribute("href");
		System.out.println(sourceLocator);
		String wget_command = "cmd /c wget -P c:" + sourceLocator;
		try{
			Process exec = Runtime.getRuntime().exec(wget_command);
			int exitVal = exec.waitFor();
			System.out.println("Exit value: " + exitVal);
		}catch(InterruptedException | IOException ex){
			System.out.println(ex.toString());
		}
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}

}