package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAUTOCONSTANTS {
	public WebDriver driver=null;
	static {
		//System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(FIREFOX_KEY, FIREFOX_VALUE);
	}
	
	@BeforeMethod
	public void openBrowser() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(URL1);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(PTO, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
		System.out.println("close browser");
	}

}
