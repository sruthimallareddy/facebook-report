package basePage;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BasePage {
	public WebDriver driver;
public ExtentTest test;
public void ScreenShot(WebDriver driver, ExtentTest test) throws IOException {
	Date d = new Date();
	String Filename = d.toString().replaceAll(" ","_").replaceAll(":", "_");
	String Imagepath = "C:\\Users\\sruth\\Desktop\\Screenshots\\Facebook Screenshots\\screenshot"+ Filename+".png";
	TakesScreenshot take = (TakesScreenshot)driver;
	File src = take.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File(Imagepath));
	test.log(LogStatus.INFO, test.addScreenCapture(Imagepath));
	
}
}


