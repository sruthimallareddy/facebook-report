package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import basePage.BasePage;

public class CreatePage extends BasePage{
	@FindBy(how = How.XPATH, using = "//div[@class='_273_ _2iev'][contains(text(),'Page')]")
	public WebElement page;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Advertise your business, brand or organisation')]")
	public WebElement ads;

	public CreatePage(WebDriver driver) {
		this.driver=driver;
	}

	public void page1() throws Exception {
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(page).click().build().perform();
	
	}
	public void advertise() throws Exception {
		Thread.sleep(3000);
		Actions action1 = new Actions(driver);
		action1.moveToElement(ads).click().build().perform();
	}
	
}
