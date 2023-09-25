package stepDefinitions;

import org.openqa.selenium.WebDriver;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pages.TutorialPage;

public class TutorialSteps {
	
	WebDriver driver;
	
	TutorialPage tpage=new TutorialPage(driver);
	
	@Given("tutoriyanninja page is open")
	public void tutoriyanninja_page_is_open() {
		tpage=new TutorialPage(driver);
		tpage.setup();
	   
	}

	@And("login page is displayed")
	public void login_page_is_displayed() {
		
		tpage.clickAccount();
		tpage.clickLogin();
	    
	}
	
	 @When("enter userid {string} and password {string}")
	public void username_and_password(String username,String pass){
    tpage.enter_mail(username);
    tpage.enter_Pass(pass);
		  
		}

	@And("click on login button")
	public void click_on_login_button() throws InterruptedException {
		tpage.clickLogin1();
		Thread.sleep(1000);
	    
	}

	@Then("display home page")
	public void display_home_page() throws InterruptedException {
	   tpage.getHeading();
	  // tpage.end();
	   Thread.sleep(1000);
	}
 
	@And("the product list page displays")
	public void the_product_list_page_displays() throws InterruptedException {
		Thread.sleep(3000);
		tpage.clickcamera();
	    
	}

	@When("user select the product")
	public void user_select_the_product() {
		tpage.SElectProduct();
	    
	}

	
	@And("clicks on add to cart button")
	public void clicks_on_add_to_cart_button() {
	   
		tpage.AddProduct();
	}

	@Then("cart button displays item added to cart")
	public void cart_button_displays_item_added_to_cart() {
	    tpage.DisplayCart();
	}




}
