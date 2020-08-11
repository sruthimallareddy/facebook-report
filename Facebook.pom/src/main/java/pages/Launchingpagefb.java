package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import basePage.BasePage;

public class Launchingpagefb extends BasePage{
	public Launchingpagefb(WebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	public LandingPage openApplication1() throws Exception {
		test.log(LogStatus.INFO, "application should be opened");
		driver.get("https://www.facebook.com/");
		test.log(LogStatus.INFO, "application is opened");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver, 60); //explicit wait
		//wait.until(ExpectedConditions.elementToBeSelected(By.xpath("xpath")));  //explicit wait
		ScreenShot(driver, test);
		LandingPage login = new LandingPage(driver,test);
		PageFactory.initElements(driver, login);
		return login;
	}

}
