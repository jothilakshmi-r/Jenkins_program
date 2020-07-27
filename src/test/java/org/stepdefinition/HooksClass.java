package org.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass {
	public static WebDriver driver;
	
	@Before
	public void BeforeMethod() {
		System.out.println("Before will execute first");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHYAMSUNDAR\\workspace\\CucumberBase\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	@After
	public void afterMethod() {
		driver.quit();
		System.out.println("After Method closed");
	}

}
