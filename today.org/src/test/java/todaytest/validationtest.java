package todaytest;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import todayyyy.Sell;
import todayyyy.llog;
import todayyyy.logout;
import todayyyy.minitv;
import todayyyy.search;

public class validationtest {
	WebDriver driver;
	llog l;
	search S;
	logout log;
	Sell s;
	minitv m;
	
	@BeforeTest
    public void browser() {

		
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\shree\\Desktop\\IMPL\\chrome-win64\\chrome-win32\\chrome.exe");

      //  driver=new ChromeDriver();

        
		driver=new FirefoxDriver();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.get("https://www.amazon.in");
     }
	
	@BeforeClass
	public void beforeclass() {
		l=new llog(driver);
		S=new search(driver);
		log=new logout(driver);
	    s=new Sell(driver);
	    m=new minitv(driver);

		
	}
	
	@BeforeMethod
	public void loginobject() {
//		 l.Loginlink();
//		 l.username();
//		 l.UNbutton();
//		 l.enterpass();
//		 l.passbutton();
	}
	@Test      
	public void verify_search() {
		
				
		S.Search();
		
        driver.navigate().back();
		
		
	}
	@Test       (priority=3)
	public void verify_minitv() {
		
		m.MXplayer();
		driver.navigate().back();
	}
	
	@Test       
	public void verify_sell() {
				//s.sell();
		 log.All(driver);
	   	   
		
	}
	
	@AfterMethod
	public void Logout() {
		
//	   	   log.All(driver);
//	   	   log.SignOut(driver);
//	   	  
	   	 //  log.scrolldown(driver);
	   	  	} 
	
	@AfterClass
	
	public void closebrowsercode() {
		log=null;
	    S=null;
	    
		
	}
	
	@AfterTest
	public void aftertest() {
		System.gc();
		driver.close();
	}

}
