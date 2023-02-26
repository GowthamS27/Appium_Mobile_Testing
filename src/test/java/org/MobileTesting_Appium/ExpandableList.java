package org.MobileTesting_Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class ExpandableList {
	public static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities =  new DesiredCapabilities();
		
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "8.0");
		capabilities.setCapability("udid", "JBAAGF04X537EUE");
		capabilities.setCapability("deviceName", "ASUS_X00PD");
		capabilities.setCapability("appPackage", "io.appium.android.apis");
		capabilities.setCapability("appActivity", "io.appium.android.apis.view.ExpandableList1");
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver(url,capabilities);
		WebElement peopleNames = driver.findElement(By.xpath("//*[@text='People Names']"));
		peopleNames.click();
		List<WebElement> listOfNames = driver.findElements(By.xpath("//*[@class='android.widget.TextView']"));
		for (WebElement name : listOfNames) {
			String textValue = name.getAttribute("text");
			if (!textValue.equalsIgnoreCase("Dog Names")) {
				System.out.println(textValue);	
			}
			else {
				break;
			}
		}
	}
}
