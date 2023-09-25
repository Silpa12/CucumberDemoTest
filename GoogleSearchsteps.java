package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchsteps {
	
	WebDriver driver;
	
	
	@Given("browser  open")
	public void browser_open() {
		System.out.println("Inside step1-browser opens ");
		driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

	}
	@Given("user is on google page")
	public void user_is_on_google_page() {
		System.out.println("Inside step2-google page ");
		
		driver.navigate().to("https://www.google.com/");


	}


	@When("user enter a text in search box")
	public void user_enter_a_text_in_search_box() {
		System.out.println("Inside step3-enter text ");

		driver.findElement(By.name("q")).sendKeys("automation Step by Step");

		
	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("Inside step4-enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

		
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("Inside step5-display results");
		
		driver.getPageSource().contains("Online Courses");  
		   driver.close();
			driver.quit();
		
		

	}



}
