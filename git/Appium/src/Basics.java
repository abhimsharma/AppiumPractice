import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.io.File;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics extends Capabilities {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		
		AndroidDriver<AndroidElement> driver = DesiredCapabilities();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		System.out.println("Running...");
		
	}


}


//valid locator strategies are xpath id, classname, accessibility id and android uiautomator
//in this we are using xpath....syntax is same as selenium