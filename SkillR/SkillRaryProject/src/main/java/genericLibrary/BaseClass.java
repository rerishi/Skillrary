package genericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public ProperyFile pdata = new ProperyFile();
	public WebDriver driver;
	public WebDriverUtilities utilities = new WebDriverUtilities();

	@BeforeMethod
	public void openApp() throws Throwable {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(pdata.getPropertyData("url"));
	}

	@AfterMethod
	public void closeApp(ITestResult res) throws IOException {
		int status = res.getStatus();
		String name = res.getName();
		if (status == 2) {
			Photo p = new Photo();
			p.getPhoto(driver, name);
		}
		driver.quit();
	}

}
