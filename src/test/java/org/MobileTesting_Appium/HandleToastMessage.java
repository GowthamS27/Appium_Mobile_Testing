package org.MobileTesting_Appium;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class HandleToastMessage {
	public static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities =  new DesiredCapabilities();
		
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "8.0");
		capabilities.setCapability("udid", "JBAAGF04X537EUE");
		capabilities.setCapability("deviceName", "ASUS_X00PD");
		capabilities.setCapability("appPackage", "io.selendroid.testapp");
		capabilities.setCapability("appActivity", "io.selendroid.testapp.HomeScreenActivity");
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver(url,capabilities);
		WebElement toastButton = driver.findElement(By.id("io.selendroid.testapp:id/showToastButton"));
		toastButton.click();
		WebElement toastMessage = driver.findElement(By.xpath("/hierarchy/android.widget.Toast"));
		String message = toastMessage.getText();
		System.out.println(message);
	}
}
