package com.knight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	WebDriver driver;

	@Given("^Open the Firefox and launch the application$")
	public void open_the_Firefox_and_launch_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Knight/git/JenkinsInitConfig/lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://twitter.com/login?lang=en");
	}

	@When("^Enter the Username and Password$")
	public void enter_the_Username_and_Password() throws Throwable {
		driver.findElement(By.className("js-username-field")).sendKeys("kaushik0505");
		driver.findElement(By.className("js-password-field")).sendKeys("1213545");
		driver.findElement(By.className("submit EdgeButton EdgeButton--primary EdgeButtom--medium")).click();
		driver.quit();
	}

	@Then("^Reset the credential$")
	public void Reset_the_credential() throws Throwable {
		System.out.println("This step click on the Reset button.");
	}

}