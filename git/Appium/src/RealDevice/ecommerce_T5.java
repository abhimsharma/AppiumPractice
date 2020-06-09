package RealDevice;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ecommerce_T5 extends Base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = DesiredCapabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Abhishek");
		driver.findElementByXPath("//*[@text='Male']").click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//driver.findElementByXPath("//*[@text='Argentina']").click();
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));
		
		int count = driver.findElementsById("com.androidsample.generalstore:id/productName").size();
				
				for(int i=0;i<count;i++) {
					
				String text = driver.findElementsById("com.androidsample.generalstore:id/productName").get(i).getText();	
				
				if(text.equalsIgnoreCase("Jordan 6 Rings")) {
					driver.findElementsById("com.androidsample.generalstore:id/productAddCart").get(i).click();
					break;
				}
			}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
		
		WebElement checkBox = driver.findElementByClassName("android.widget.CheckBox");
		
		TouchAction t = new TouchAction(driver);
		t.tap(tapOptions().withElement(element(checkBox))).perform();
		
		WebElement tc = driver.findElementById("com.androidsample.generalstore:id/termsButton");
		t.longPress(longPressOptions().withElement(element(tc)).withDuration(ofSeconds(2))).release().perform();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElementById("android:id/button1").click();
		
		driver.findElementById("com.androidsample.gener"
				+ "alstore:id/btnProceed").click();	
	
		
	}
	

}
