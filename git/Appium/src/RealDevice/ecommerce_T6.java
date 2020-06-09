package RealDevice;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;


//Switching Native app to WebView


public class ecommerce_T6 extends Base{

	public static void main(String[] args) throws MalformedURLException, InterruptedException  {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = DesiredCapabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Abhishek");
		driver.findElementByXPath("//*[@text='Male']").click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//driver.findElementByXPath("//*[@text='Argentina']").click();
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElementsByXPath("//*[@text='ADD TO CART']").get(0).click();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
		
		driver.findElementById("com.androidsample.generalstore:id/btnProceed").click();	
		
		Thread.sleep(4000);
		
		Set<String> context=driver.getContextHandles();
		
		for(String contextName :context) {
			System.out.println(contextName);
		}
		driver.context("WEBVIEW_com.androidsample.generalstore");
		driver.findElement(By.name("q")).sendKeys("hello");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	
		driver.context("NATIVE_APP");
	}
	

}
