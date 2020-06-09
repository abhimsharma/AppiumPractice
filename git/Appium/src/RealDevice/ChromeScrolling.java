package RealDevice;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ChromeScrolling extends BaseChrome{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = DesiredCapabilities();
		driver.get("https://cricbuzz.com");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,480)", "");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Assert.assertTrue(driver.findElementByXPath("//h4[@class='cb-list-item ui-header ui-branding-header']").getAttribute("class").contains("header"));
		
	}

}
