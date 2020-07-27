package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps{
	
	
	

	@Given("User has to be there in fb page")
	public void user_has_to_be_there_in_fb_page() {
		
		HooksClass.driver.get("https://www.facebook.com/");
	}

	
	@When("User fill the valid {string} and {string} in the textbox")
	public void user_fill_the_valid_and_in_the_textbox(String s1, String s2) {

		HooksClass.driver.findElement(By.id("email")).sendKeys(s1);
		HooksClass.driver.findElement(By.id("pass")).sendKeys(s2);
	}
		
	@When("once the value passed then click the login button")
	public void once_the_value_passed_then_click_the_login_button() {
		HooksClass.driver.findElement(By.id("loginbutton")).click();
	
	}

	@Then("Once the validation done it will redirect you in the homepage")
	public void once_the_validation_done_it_will_redirect_you_in_the_homepage() {
		System.out.println("You are redirecting to FB Page");
	}

	

	

}
