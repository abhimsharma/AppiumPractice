package RealDevice;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ecommerce_T3 extends Base{

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
		
	String LastPage = driver.findElementById("com.androidsample.generalstore:id/rvCartProductList").getText();
	//Assert.assertEquals(LastPage, expected);
		
	}
	

}
