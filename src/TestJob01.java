import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestJob01 {
	WebDriver driver;
	WebElement lbDropList01;
	WebElement dropList01, dropList01_1, dropList01_2, dropList01_3, dropList01_4, dropList01_5;
	
	@BeforeClass
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://daominhdam.890m.com");
		driver.manage().window().maximize();
		
		lbDropList01 = driver.findElement(By.xpath("html/body/form/fieldset[2]/label[3]"));
		dropList01 = driver.findElement(By.xpath(".//*[@id='job1']"));
		dropList01_1 = driver.findElement(By.xpath(".//*[@id='job1']/option[1]"));
		dropList01_2 = driver.findElement(By.xpath(".//*[@id='job1']/option[2]"));
		dropList01_3 = driver.findElement(By.xpath(".//*[@id='job1']/option[3]"));
		dropList01_4 = driver.findElement(By.xpath(".//*[@id='job1']/option[4]"));
		dropList01_5 = driver.findElement(By.xpath(".//*[@id='job1']/option[5]"));
	}
	
	@Test
	public void LabelJob01IsEnable(){
		
		if(lbDropList01.isEnabled()){
			System.out.println("Label Job Role 01 is Enable!");
		}else{
			System.out.println("Label Job Role 01 is Disable!");
		}
	}
	
	@Test
	public void LabelJob01IsSelected(){
		
		if(lbDropList01.isSelected()){
			System.out.println("Label Job Role 01 is Selected!");
		}else{
			System.out.println("Label Job Role 01 isn't Selected!");
		}
	}
	
	@Test
	public void LabelJob01IsDisplay(){
		
		if(lbDropList01.isDisplayed()){
			System.out.println("Label Job Role 01 is Displayed!");
		}else{
			System.out.println("Label Job Role 01 isn't Displayed!");
		}
	}
	
	@Test
	public void DisplayLabelJob01(){
		Assert.assertEquals("Job Role 01:", lbDropList01.getText());
	}
	
	@Test
	public void DropdownListJob01IsEnable(){
		
		if(dropList01.isEnabled()){
			System.out.println("DropdownList Job01 is Enable!");
		}else{
			System.out.println("DropdownList Job01 is Disable!");
		}
	}
	
	@Test
	public void DropdownListJob01IsSelected(){
		
		if(dropList01.isSelected()){
			System.out.println("DropdownList Job01 is Selected!");
		}else{
			System.out.println("DropdownList Job01 isn't Selected!");
		}
	}
	
	@Test
	public void DropdownListJob01IsDisplay(){
		
		if(dropList01.isDisplayed()){
			System.out.println("DropdownList Job01 is Displayed!");
		}else{
			System.out.println("DropdownList Job01 isn't Displayed!");
		}
	}
	
	@Test
	public void Job01DropdownList() throws Exception {
		 // Select using ID attribute
		 Select select = new Select(driver.findElement(By.xpath(".//*[@id='job1']")));
		 // Verify Dropdown doesn't support multi-select
		 Assert.assertFalse(select.isMultiple());
		 // Verify Dropdown has five options
		 Assert.assertEquals(5, select.getOptions().size());
		 // Select an option in Dropdown using visible text
		 //select.selectByVisibleText("Automation Tester");
		 
		 select.selectByIndex(0);
		 Assert.assertEquals("Automation Tester", select.getFirstSelectedOption().getText());
		 select.selectByIndex(1);
		 Assert.assertEquals("Manual Tester", select.getFirstSelectedOption().getText());
		 select.selectByIndex(2);
		 Assert.assertEquals("Website Tester", select.getFirstSelectedOption().getText());
		 select.selectByIndex(3);
		 Assert.assertEquals("Mobile Tester", select.getFirstSelectedOption().getText());
		 select.selectByIndex(3);
		 Assert.assertEquals("Mobile Tester", select.getFirstSelectedOption().getText());
//		 select.selectByIndex(4);
//		 Assert.assertEquals("Dropdown disable", select.getFirstSelectedOption().getText());
		 // Select an option in Dropdown using value attribute
		 
		 select.selectByValue("automation");
		 Assert.assertEquals("Automation Tester", select.getFirstSelectedOption().getText());
		 select.selectByValue("manual");
		 Assert.assertEquals("Manual Tester", select.getFirstSelectedOption().getText());
		 select.selectByValue("website");
		 Assert.assertEquals("Website Tester", select.getFirstSelectedOption().getText());
		 select.selectByValue("mobile");
		 Assert.assertEquals("Mobile Tester", select.getFirstSelectedOption().getText());
//		 select.selectByValue("disabled");
//		 Assert.assertEquals("Dropdown disable", select.getFirstSelectedOption().getText());
		
		 }
	@Test
	public void Job01_option1IsEnable(){
		
		if(dropList01.isEnabled()){
			System.out.println("DropdownList Job01_option1 is Enable!");
		}else{
			System.out.println("DropdownList Job01_option1 is Disable!");
		}
	}
	
	@Test
	public void Job01_option1IsSelected(){
		
		if(dropList01.isSelected()){
			System.out.println("DropdownList Job01_option1 is Selected!");
		}else{
			System.out.println("DropdownList Job01_option1 isn't Selected!");
		}
	}
	
	@Test
	public void Job01_option1IsDisplay(){
		
		if(dropList01.isDisplayed()){
			System.out.println("DropdownList Job01_option1 is Displayed!");
		}else{
			System.out.println("DropdownList Job01_option1 isn't Displayed!");
		}
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
}
