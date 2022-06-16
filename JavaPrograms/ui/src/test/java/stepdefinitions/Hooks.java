package stepdefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	public BaseDriver baseDriver;
	
	public Hooks(BaseDriver picobaseDriver) {
		baseDriver=picobaseDriver;
	}
	
	@BeforeAll
	public static void createReport() {
		BaseDriver.report=new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("./target/extent_report.html");
		BaseDriver.report.attachReporter(spark);
	}
	
	@AfterAll
	public static void publishReport() {
		BaseDriver.report.flush();
	}
	@Before
	public void openBrowser(Scenario scenario) {
		String scenarioName = scenario.getName();
		
		baseDriver.test = BaseDriver.report.createTest(scenarioName);
		
		baseDriver.test.info("Set the path of driver executable");
		WebDriverManager.chromedriver().setup();
		
		baseDriver.test.info("Open Chrome Browser");
		baseDriver.driver=new ChromeDriver();
	}
	
	@After
	public void closeBrowser(Scenario scenario) {
		boolean failed = scenario.isFailed();
		String scenarioName = scenario.getName();
		if(failed)
		{
			TakesScreenshot t=(TakesScreenshot)baseDriver.driver;

			File srcfile = t.getScreenshotAs(OutputType.FILE);

			try 
			{
				FileUtils.copyFile(srcfile, new File("./target/img/"+scenarioName+".png"));
			} catch (IOException e) {
				
			}

			baseDriver.test.fail(MediaEntityBuilder.createScreenCaptureFromPath("../target/img/"+scenarioName+".png").build());
		}
		
		baseDriver.test.info("Close Chrome Browser");
		baseDriver.driver.close();
	}
}
