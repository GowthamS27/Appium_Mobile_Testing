package org.MobileTesting_Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class TestRegistration {
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement registerButton = driver.findElement(By.id("io.selendroid.testapp:id/startUserRegistration"));
		registerButton.click();
		WebElement userName = driver.findElement(By.id("io.selendroid.testapp:id/inputUsername"));
		userName.sendKeys("Gowtham");
		WebElement email = driver.findElement(By.id("io.selendroid.testapp:id/inputEmail"));
		email.sendKeys("gowtham@gmail.com");
		WebElement password = driver.findElement(By.id("io.selendroid.testapp:id/inputPassword"));
		password.sendKeys("12345678");
		WebElement name = driver.findElement(By.id("io.selendroid.testapp:id/inputName"));
		name.clear();
		name.sendKeys("Gowtham");
		driver.navigate().back();
		WebElement programmingLanguage = driver.findElement(By.id("io.selendroid.testapp:id/input_preferedProgrammingLanguage"));
		programmingLanguage.click();
		WebElement java = driver.findElement(By.xpath("//*[@text='Java']"));
		java.click();
		WebElement acceptAds = driver.findElement(By.id("io.selendroid.testapp:id/input_adds"));
		acceptAds.click();
		WebElement register = driver.findElement(By.id("io.selendroid.testapp:id/btnRegisterUser"));
		register.click();
	}
}
