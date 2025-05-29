package todayyyy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sell {
	@FindBy(xpath="html/body/div/header/div/div[4]/div[2]/div/div/a[4]")private WebElement cell;
	
	
	public Sell(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void sell() {
		cell.click();
	}

}
