package RealDevice;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CricBuzz extends BaseChrome{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = DesiredCapabilities();
		driver.get("https://cricbuzz.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElementByXPath("//a[@href='#menu']").click();
		driver.findElementByXPath("//a[@title='Cricbuzz Home']").click();
		System.out.println(driver.getCurrentUrl());
	}

}
