import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import PageObject.HomePage;
import io.appium.java_client.android.AndroidDriver;

public class Basics1 extends Capabilities {
	
	public static void main(String args[]) throws MalformedURLException {
		
		
		
		AndroidDriver driver = DesiredCapabilities();
				
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();//xpath index
		driver.findElementByClassName("android.widget.EditText").sendKeys("abhi1234");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElementsByClassName("android.widget.Button").get(1).click();or
		driver.findElementById("android:id/button1").click();
		System.out.println("Running...");

	}

}

//whenever there is a exception try giving wait it might manage the exception well
 