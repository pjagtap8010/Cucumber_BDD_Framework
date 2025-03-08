package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	//ctr+shift+o

	static WebDriver driver ;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	//@When("user enter valide Username and Password")
	//public void user_enter_valide_username_and_password() {
		
	@When("user enter valide {string} and {string}")
	public void user_enter_valide_and(String Username, String Password) {
	    driver.findElement(By.xpath("//input [@id= 'user-name']")).sendKeys(Username);
	    driver.findElement(By.xpath("//input [@id= 'password']")).sendKeys(Password);
	}

	@And("user click on login button")
	public void user_click_on_login_button() {
	    driver.findElement(By.xpath("//input [@id= 'login-button']")).click();
	}

	@Then("user is navigate to home page")
	public void user_is_navigate_to_home_page() {
	    Assert.assertTrue(driver.findElements(By.xpath("//div [@class = 'app_logo']")).size()>0, "uuser has een navigating to home page");	
	    }

	@And("close the browser")
	public void close_the_browser() {
	    driver.close();
	}




}
