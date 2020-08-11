package utilities;

import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
private static ExtentReports extent;
public static ExtentReports getInstance() {
	if (extent==null) {
		Date d = new Date();
		String Filename = d.toString().replaceAll(" ", "_").replaceAll(":", "_");
		String reportpath = "C:\\Users\\sruth\\Desktop\\Extent reports\\Facebook Reports\\extent"+Filename+".html";
		extent = new ExtentReports(reportpath,true,DisplayOrder.NEWEST_FIRST);
		extent.loadConfig(new File("C:\\Users\\sruth\\eclipse-workspace\\Facebook.pom\\extent-config.xml"));
		extent.addSystemInfo("@selenium version", "selenium 3.8").addSystemInfo("tester name","sruthi");
		
	}
	return extent;
}

}
