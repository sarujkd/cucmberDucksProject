package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testBase {

	 public static Properties prop;
	 public static  WebDriver driver;
    
	   public void Initialize_The_Browser() throws IOException {
	   
	   Properties prop=new Properties();
	  FileInputStream fp=new FileInputStream("C:\\Users\\anand\\Documents\\Saru\\GitSample\\GitDemo\\CucumberDucks_Project\\Utility\\testdata.properties");
	  prop.load(fp);
	  
	   //check for the browser
	   String browser=prop.getProperty("browser");
	   if (browser.equalsIgnoreCase("Chrome")) {
		   WebDriverManager.chromedriver().setup();
	   
		   driver=new ChromeDriver();
	   }
	   else
		   if (browser.equalsIgnoreCase("FireFox")) {
			   WebDriverManager.firefoxdriver().setup();
			   driver=new FirefoxDriver();
		   }
		   else
			   if (browser.equalsIgnoreCase("edge")) {
				   WebDriverManager.edgedriver().setup();
				   driver=new EdgeDriver();
			   }
		   
	   driver.get(prop.getProperty("url"));
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);

	}

	   public void close_The_Browser() throws IOException {
		   
		 		   driver.quit();
	   }

	   //Generating Extent Report

	   protected static ExtentTest logger;
		protected static ExtentReports report;
		
		public static void CreateReport() {
			String fileName = new SimpleDateFormat("'DucksReport_'YYYYMMddHHmm'.html'").format(new Date());
			String path = "Report/" + fileName;
			report = new ExtentReports(path);
		}
		//close the report
		public static void CloseReport() {
			report.endTest(logger);
			report.flush();
		}


}
