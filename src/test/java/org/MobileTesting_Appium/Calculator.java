package org.MobileTesting_Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator {
	
	public static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities capabilities =  new DesiredCapabilities();
		
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "8.0");
		capabilities.setCapability("udid", "JBAAGF04X537EUE");
		capabilities.setCapability("deviceName", "ASUS_X00PD");
		capabilities.setCapability("appPackage", "com.asus.calculator");
		capabilities.setCapability("appActivity", "com.asus.calculator.Calculator");
		
		/*other way to set desired capabilities
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
		capabilities.setCapability(MobileCapabilityType.UDID, "JBAAGF04X537EUE");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "ASUS_X00PD");
		packageName and appActivity is not available in MobileCapabilit*/
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver(url,capabilities);
		
		WebElement one = driver.findElement(By.id("com.asus.calculator:id/digit1"));
		WebElement plus = driver.findElement(By.id("com.asus.calculator:id/plus"));
		WebElement two = driver.findElement(By.id("com.asus.calculator:id/digit2"));
		WebElement equalTo = driver.findElement(By.id("com.asus.calculator:id/equal"));
		one.click();
		plus.click();
		two.click();
		equalTo.click();
	}

}
