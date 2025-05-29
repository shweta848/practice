package todayyyy;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class search {
	
	@FindBy(xpath="//input[@id=\"twotabsearchtextbox\"]") private WebElement Sear;
	@FindBy(xpath="//input[@id=\"nav-search-submit-button\"]")private WebElement button;
	
	
	public search(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Search() {
		Sear.sendKeys("womens dresses");	
		button.click();
		Sear.clear();
		Sear.sendKeys("boye dresses");
		button.click();
		Sear.clear();
		Sear.sendKeys("makeup boxes");
		button.click();
		//System.out.print(Sear.getSize());
	    //we can perform both methods are easy
		button.click();
		Sear.clear();
		Sear.sendKeys("mens coats for marriage");
		button.click();
		Sear.clear();
			
	}
	
	
}
