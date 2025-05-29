package todayyyy;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout {
	
	//@FindBy(xpath="//span[text()=\"Hello, Manisha\"]") private WebElement signoutlink;
	//@FindBy(xpath="//span[text()=\"Sign Out\"]") private WebElement outsign;
  //  @FindBy(xpath="//span[text()=\"Sign Out\"]") private WebElement signout;
	
	
	
	@FindBy(xpath="//span[@id=\"nav-link-accountList-nav-line-1\"]") private WebElement link;
      
	@FindBy(xpath="//span[text()=\"Sign Out\"]") private WebElement SO;

	
	
	public logout(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
	public void All(WebDriver driver) {
		Actions act=new Actions(driver);
		act.doubleClick(link).build().perform();
	}
		
		
	
		//     public void Logout() {
//		
//	//	Actions act=new Actions(driver);
//	//	act.click(outsign).build().perform();
//    	 outsign.click();
//			}
	
}
