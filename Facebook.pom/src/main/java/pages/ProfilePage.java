package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.relevantcodes.extentreports.ExtentTest;

import basePage.BasePage;

public class ProfilePage extends BasePage{
	@FindBy(how = How.XPATH, using = "//div[@id='u_0_a']/div/div/div/a/span/span")
	public WebElement gotoprofile1;

	public ProfilePage(WebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public void gotoprofile() throws Exception {
		Thread.sleep(3000);
		gotoprofile1.click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		ScreenShot(driver, test);
		
	}
}
