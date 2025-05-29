package todayyyy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class llog {
	
	@FindBy(xpath="html/body/div[1]/header/div[1]/div[1]/div[3]/div[1]/a[2]/div[1]/span")private WebElement loginlink;
	
	@FindBy(xpath="//input[@type=\"email\"]")private WebElement uN;
	
	@FindBy(xpath="//input[@class=\"a-button-input\"]") private WebElement sutmit;
	
	@FindBy(xpath="//input[@type=\"password\"]")private WebElement pass;
	
	@FindBy(xpath="//input[@id=\"signInSubmit\"]")private WebElement signin;//i have done changes
	
	public llog(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Loginlink() {
		loginlink.click();
	}
	public void username() {
		uN.sendKeys("8888569592");
	}
	public void UNbutton() {
		sutmit.click();
	}
    public void enterpass() {
    	pass.sendKeys("Shweta1234@#");
    }
    public void passbutton() {
    	signin.click();
    }
}
