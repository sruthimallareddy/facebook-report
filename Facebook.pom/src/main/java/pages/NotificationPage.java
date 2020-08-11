package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.relevantcodes.extentreports.ExtentTest;

import basePage.BasePage;

public class NotificationPage extends BasePage{
	@FindBy(how = How.XPATH, using = "//a[@id='u_0_g']")
	public WebElement Markasread;
	
	@FindBy(how = How.XPATH, using = "//div[@class='uiHeaderActions fsm fwn fcg']//a[contains(text(),'Settings')]")
	public WebElement Settings;
	
	public NotificationPage(WebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test = test;
	}

	public void markasread() throws Exception {
		
		
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(Markasread).click().build().perform();
	}
		public void settings() throws Exception {
			Thread.sleep(3000);
			Actions action1 = new Actions(driver);
			action1.moveToElement(Settings).click().build().perform();
		}
	
	
	

}
