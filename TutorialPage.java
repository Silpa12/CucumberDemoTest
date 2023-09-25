package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialPage{
	
	WebDriver driver;

	public TutorialPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	By Account=By.xpath("//li[@class='dropdown']/a[@title='My Account']");
	By loginbtn=By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li[2]/a");
	By heading = By.linkText("Edit your account information");
	By logoutBtn = By.linkText("Logout");
	
	By email_id=By.xpath("//*[@id=\"input-email\"]");
	By password=By.xpath("//*[@id=\"input-password\"]");
	By login=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	
	
	//By cam1=By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li[7]/a");
	By cam1=By.xpath("//a[text()='Cameras']");
	By cam2=By.linkText("Nikon D300");
	
	By add_item=By.id("button-cart");
	
	By cartpage=By.xpath("//*[@id=\"cart\"]/button");
	By viewcart=By.linkText("View Cart");
	
	
public void setup() {
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url="https://tutorialsninja.com/demo/";
		driver.get(url);
		
	}
	
	public void clickAccount() {
		driver.findElement(Account).click();
	}
	
	public void clickLogin() {
	   driver. findElement(loginbtn).click();
	}
	
			
	public void enter_mail(String email1) {
		
		driver.findElement(email_id).sendKeys(email1);
	}


	public void enter_Pass(String pass1) {
		driver.findElement(password).sendKeys(pass1);
	}
	
	//Method to click on Login button
	public void clickLogin1() {
		driver.findElement(login).click();
	}
	
	
	public String getHeading() {
		String head = driver.findElement(heading).getText();
		System.out.println(head);
		return head;
	}
	
	
	public void clickcamera() 
	{
		driver.findElement(cam1).click();
		
		//driver.findElement(camera1).click();
	}
	
	public void SElectProduct() {
		driver.findElement(cam2).click();
	
	}
	
	public void AddProduct() {
		driver.findElement(add_item).click();
	}
	
	public void DisplayCart() {
		driver.findElement(cartpage).click();
		driver.findElement(viewcart).click();
		
	}
	
	public void clickLogout() {
		driver.findElement(logoutBtn).click();
	}

    public void end() {
    	driver.quit();
    }
}



