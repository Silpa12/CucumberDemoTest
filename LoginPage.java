package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By user=By.id("username");
	By passwrd=By.id("password");
	By loginbtn=By.id("submit");
	By logout=By.xpath("//div[@class='wp-block-button aligncenter is-style-fill']/a");
	
	public LoginPage(WebDriver driver) {
	this.driver=driver;
	}
   
	public void ChromeFunction() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url="https://practicetestautomation.com/practice-test-login/";
		driver.get(url);
		
	}
	
	public void Enterusername(String username) {
		driver.findElement(user).sendKeys(username);
		
	}
	
	public void Enterpass(String pass) {
		driver.findElement(passwrd).sendKeys(pass);;
	}
	
	public void Clicklogin() {
		driver.findElement(loginbtn).click();
	}
	
	public void ChecklogoutIsDisplayed() {
		driver.findElement(logout).isDisplayed();
	}
	

	public void end() {
		driver.quit();
	}
		
	
}
