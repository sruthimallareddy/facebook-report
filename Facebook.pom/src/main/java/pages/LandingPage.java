package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import basePage.BasePage;

public class LandingPage extends BasePage{
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	public WebElement emailid;
	@FindBy(how = How.XPATH, using = "//input[@id='pass']")
	public WebElement password;
	@FindBy(how = How.XPATH, using = "//label[@class='login_form_login_button uiButton uiButtonConfirm']//input")
	public WebElement login;
	
	
	@FindBy(how = How.XPATH, using = "//input[@name='firstname']")
	public WebElement firstname;
	@FindBy(how = How.XPATH, using = "//input[@name='lastname']")
	public WebElement  surname;
	@FindBy(how = How.XPATH, using = "//input[@name='reg_email__']")
	public WebElement emailaddress;
	@FindBy(how = How.XPATH, using = "//input[@name='reg_email_confirmation__']")
	public WebElement confirmemail;
	@FindBy(how = How.XPATH, using = "//input[@name='reg_passwd__']")
	public WebElement newpassword;
	@FindBy(how = How.XPATH, using = "//select[@name='birthday_day']")
	public WebElement day;
	@FindBy(how = How.XPATH, using = "//select[@name='birthday_month']")
	public WebElement month;
	@FindBy(how = How.XPATH, using = "//select[@id='year']")
	public WebElement year;
	@FindBy(how = How.XPATH, using = "//input[@id='u_0_6']")
	public WebElement gender;
	@FindBy(how = How.XPATH, using = "//button[@name='websubmit']")
	public WebElement signup;
	public LandingPage(WebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test = test;
	}

	public HomePage Login() throws Exception {
		test.log(LogStatus.INFO, "login page is opened");
	Thread.sleep(3000);
	test.log(LogStatus.INFO, "enter email id");
	emailid.sendKeys("sruthiece@gmail.com");
	test.log(LogStatus.INFO, "enter email id is entered");
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	ScreenShot(driver, test);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	test.log(LogStatus.INFO, "enter password ");
	password.sendKeys("may06may10may30");
	test.log(LogStatus.INFO, "password is entered");
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	ScreenShot(driver, test);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	
			login.click();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			ScreenShot(driver, test);
			
			HomePage hp = new HomePage(driver, test);
			PageFactory.initElements(driver, hp);
			return hp;
	}
	
	public void CreateAccount() throws Exception {
		Thread.sleep(3000);
		test.log(LogStatus.INFO, "enter first name");
		firstname.sendKeys("sruthi");
		test.log(LogStatus.INFO, "first name is entered");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		test.log(LogStatus.INFO, "enter surname");
		surname.sendKeys("mallareddy");
		test.log(LogStatus.INFO, "surname is entered");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		test.log(LogStatus.INFO, "enter email address");
		emailaddress.sendKeys("sruthiece@gmail.com");
		test.log(LogStatus.INFO, "email address is entered");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		test.log(LogStatus.INFO, "enter conirm email");
		confirmemail.sendKeys("sruthiece@gmail.com");
		test.log(LogStatus.INFO, "entered confirm email ");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		test.log(LogStatus.INFO, "enter new password");
		newpassword.sendKeys("may06may10may30");
		test.log(LogStatus.INFO, "new password is entered");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select date = new Select(day);
		date.selectByIndex(10);
		Select month1 = new Select(month);
		month1.selectByIndex(5);
		Select year1 = new Select(year);
		year1.selectByValue("1987");
		Thread.sleep(3000);
		gender.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		signup.click();
		
	}
	
	
}

