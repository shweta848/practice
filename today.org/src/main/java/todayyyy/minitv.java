package todayyyy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class minitv {
	
	@FindBy(xpath="html/body/div/header/div/div[4]/div[2]/div/div/a[2]")private WebElement mini;
	
	public minitv(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void MXplayer() {
		
		mini.click();
	}
	

}
