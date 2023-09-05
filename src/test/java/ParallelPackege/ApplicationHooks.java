package ParallelPackege;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import Staging.pakages.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {
	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configreader;
	Properties prop;
	@Before(order=0)
	public void getProperty() throws IOException {
		configreader = new ConfigReader();
		prop=configreader.in_itprop();
		
	}
	@Before(order=1)
	public void launchbrowser() throws IOException {
		String BrowserName= prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver=driverFactory.initializeBrowser(BrowserName);
		
	}
@After(order=0)
public void quitBrowser() {
	driver.quit();
}
@After(order = 1)
public void tearDown(Scenario scenario){
    String screenshotname = scenario.getName().replaceAll("","_");
    byte[] sourcepath=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
scenario.attach(sourcepath,"image/png",screenshotname);
}
}
