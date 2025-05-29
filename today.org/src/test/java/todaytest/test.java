package todaytest;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import todayyyy.llog;
import todayyyy.search;

public class test {
	WebDriver driver;
	llog log;
	search s;
	
	@BeforeClass
	public void browser() {

		
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\shree\\Desktop\\chromedriver_Win32(2)\\chromedriver.exe");

		//WebDriver driver=new ChromeDriver();
		 driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		  
		
		
		}
	@BeforeMethod
	public void object() {
	 log=new llog(driver);
	 s=new search(driver);
	 log.Loginlink();
	 log.UNbutton();
	 log.UNbutton();
	 log.enterpass();
	 log.passbutton();
		
	}
	
	@Test 
	public void testA() {
		s.Search();
	
		
	}
	
	
	@AfterMethod
	public void cleanup() {
		
		
		
	}
	
	@AfterClass
	public void closeperform() {
		
		
		
	}
	
}
