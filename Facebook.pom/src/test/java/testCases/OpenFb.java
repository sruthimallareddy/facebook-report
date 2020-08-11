package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.CreatePage;
import pages.HomePage;
import pages.LandingPage;
import pages.Launchingpagefb;
import pages.NotificationPage;
import pages.ProfilePage;

public class OpenFb extends BaseTest {
	String Testcasename = "open profile";
	
	@Test
	public void OpenFacebook() throws Exception {
		test = extent.startTest(Testcasename);
		setup("chrome");
		Launchingpagefb open = new Launchingpagefb(driver, test);
		PageFactory.initElements(driver, open);
		LandingPage   login =  open.openApplication1();
		PageFactory.initElements(driver, login);
		HomePage hp =  login.Login();
		PageFactory.initElements(driver, hp);
		
		//login.CreateAccount();
		hp.Profile();
       //hp.home();
		//hp.create();
		//hp.freinds();
		//hp.messenger();
		//hp.notifications(); 
		//hp.quickhelp(); //didn't worked
		//hp.fbDropdown();
		
		//ProfilePage pg = hp.Profile();
		//PageFactory.initElements(driver, pg);
		//pg.gotoprofile();
		
		//CreatePage cp = hp.create();
		//PageFactory.initElements(driver, cp);
		//cp.page1();
	//cp.advertise();
		
		//NotificationPage np = hp.notifications();
		//PageFactory.initElements(driver, np);
		//np.markasread();
	//	np.settings();
		
	}
	@AfterTest
	public void endtest() {
		extent.endTest(test);
		extent.flush();
		extent.close();
		
	}

}
