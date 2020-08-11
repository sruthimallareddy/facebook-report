package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import basePage.BasePage;

public class HomePage extends BasePage{
	@FindBy(how = How.XPATH, using = "//span[@class='_1vp5']")
	public WebElement profile;
	
	@FindBy(how = How.XPATH, using = "//a[@class='_2s25']")
	public WebElement home1;
	
	@FindBy(how = How.XPATH, using = "//a[@id='creation_hub_entrypoint']")
	public WebElement create1;
	
	@FindBy(how = How.XPATH, using = "//div[@id='fbRequestsJewel']/a/div")
	public WebElement friends1;
	
	@FindBy(how = How.XPATH, using = "//div[@id='u_0_e']/a/div")
	public WebElement messenger1;
	
	@FindBy(how = How.XPATH, using = "//div[@id='fbNotificationsJewel']/a/div")
	public WebElement notifications1;
	
	@FindBy(how = How.XPATH, using = "//div[@class='_59fb _tmz']")
	public WebElement quickhelp1;
	
	@FindBy(how = How.XPATH, using = "//a[@id='pageLoginAnchor']/div")
	public WebElement fbdropdown1;
	
	
	
	public HomePage(WebDriver driver, ExtentTest test) {
		this.driver= driver;
		this.test = test;
	}
	public ProfilePage Profile() throws Exception {
		test.log(LogStatus.INFO, "open profile page");
		Thread.sleep(3000);
		profile.click();
		test.log(LogStatus.INFO, "profile page is opened");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		ScreenShot(driver, test);
		ProfilePage gotoprofile1 = new ProfilePage(driver,test);
		PageFactory.initElements(driver,  gotoprofile1);
		return gotoprofile1;
	}
public void home() throws Exception {
	Thread.sleep(3000);
	home1.click();

}
	public CreatePage create() throws Exception {
		test.log(LogStatus.INFO, "open create page");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		create1.click();
		test.log(LogStatus.INFO, "create page is opened");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		ScreenShot(driver, test);
		CreatePage cp = new CreatePage(driver);
		PageFactory.initElements(driver, cp);
		return cp;

	}
	public void freinds() throws Exception {
		test.log(LogStatus.INFO, "open friends");
		Thread.sleep(3000);
		friends1.click();
		test.log(LogStatus.INFO, "friends is opened");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		ScreenShot(driver, test);
	}
		public void messenger() throws Exception {
			test.log(LogStatus.INFO, "messenger is opened");
			Thread.sleep(3000);
			messenger1.click();
		}
		public NotificationPage notifications() throws Exception {
			Thread.sleep(3000);
			notifications1.click();
			NotificationPage np = new NotificationPage(driver,test);
			PageFactory.initElements(driver, np);
			return np;
		}
		
		public void quickhelp() throws Exception {
			Thread.sleep(3000);
			quickhelp1.click();
		}
		
	public void fbDropdown() throws Exception {
		Thread.sleep(3000);
		fbdropdown1.click();
	}
	
	
	
}
