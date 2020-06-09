package RealDevice;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ecommerce_T4 extends Base {
	
	public static void main(String args[]) throws MalformedURLException, InterruptedException{
		
	AndroidDriver<AndroidElement> driver = DesiredCapabilities();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Abhishek");
	driver.findElementByXPath("//*[@text='Male']").click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	//driver.findElementByXPath("//*[@text='Argentina']").click();
	driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
	
	driver.findElementsByXPath("//*[@text='ADD TO CART']").get(0).click();
	driver.findElementsByXPath("//*[@text='ADD TO CART']").get(0).click();
	
	Thread.sleep(4000);
	
	String amount1=driver.findElementsById("com.androidsample.generalstore:id/productPrice").get(0).getText();
	//$120 $ is not reuired so we use
	amount1=amount1.substring(1);
	double amount1value=Double.parseDouble(amount1);
	
	String amount2=driver.findElementsById("com.androidsample.generalstore:id/productPrice").get(1).getText();
	//$160.098
	amount2=amount2.substring(1);
	double amount2value=Double.parseDouble(amount2);
	
	double sumOfProducts= amount1value+amount2value;
	System.out.println("Sum of Products"+sumOfProducts);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	String total = driver.findElementByXPath("//*[@resource-id='com.androidsample.generalstore:id/totalAmountLbl']").getText();
	total = total.substring(1);
	double totalValue = Double.parseDouble(total);
	
	System.out.println("Total Amount"+totalValue);
	Assert.assertEquals(sumOfProducts, totalValue);

	}
	
	public static double getAmount(String value) {
		value = value.substring(1);
		double finalValue = Double.parseDouble(value);
		return finalValue;
	}
}

//refer class 60 for optimized code
 