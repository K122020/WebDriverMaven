import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginTest {
	
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp(){
		WebDriverManager.chromedriver().setup();
		//driver = new FirefoxDriver();
		
		driver = new ChromeDriver();
		
		
	}

	@Test
	public void doLogin() throws InterruptedException{
		
			
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Hi Gaurav");
		Thread.sleep(10000);
	/*
	 * 
	 * added new comments
	 * 
	 */
	
	
	}
	
	@AfterSuite
	public void tearDown(){
		
		driver.quit();
	}
	
}
