package baseTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import basePage.BasePage;
import utilities.ExtentManager;

public class BaseTest extends BasePage {
public ExtentReports extent = ExtentManager.getInstance();

	public void setup(String browser) {
test.log(LogStatus.INFO, "chrome browser should be open");
		if (browser=="chrome") {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sruth\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions ops = new ChromeOptions();//to close pop up window
	        ops.addArguments("--disable-notifications");//to close pop up window
	       
	       
	        driver = new ChromeDriver(ops);
	        test.log(LogStatus.INFO, "chrome browser is opened");
			driver.manage().window().maximize();
			
			
			
		//for multiple browsers use if else
			
		}else if (browser=="edge") {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\sruth\\Desktop\\Drivers\\chromedriver_win32\\microsoftdriver.exe");
			driver=new EdgeDriver();
		}
	}

}
