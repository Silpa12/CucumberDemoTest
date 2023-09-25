package stepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pages.LoginPage;
public class LoginSteps {
	
	
	WebDriver driver;
	LoginPage obj=new LoginPage(driver);
	
	@Given("browser is open")
	public void browser_is_open() {
		
		
	obj.ChromeFunction();
		//System.out.println("Step1-browser open");
		
		//driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		
	}

	@And("user is on on login page")
	public void user_is_on_on_login_page() {
		
	//	System.out.println("Step2-user is on login page ");

		//String url="https://example.testproject.io/web/";
		//driver.get(url);
		
		

	    
	}

   @When("user enter sheetName{string} and rowNumber{string}")
	public void user_enter_username_and_password() throws InterruptedException{

	  
		
	
	
	   
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		
		obj.Clicklogin();
	//	driver.findElement(By.id("login")).click();

	   
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		
		obj.ChecklogoutIsDisplayed();
  //driver.findElement(By.id("logout")).isDisplayed();
  obj.end();
	   
	}

}
