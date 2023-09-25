package stepDefinitions;

	
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Baseclass;

	public class Hooks extends Baseclass{
		
		 Baseclass base;
		
		public Hooks(Baseclass base) {
			this.base = base;
		}

		@io.cucumber.java.Before
		public void initDriver() {
			System.out.println("Open browser");
			System.setProperty("webdriver.chrome.driver", "lib/chromedriver 3");
			base.driver = new ChromeDriver();
			base.driver.manage().window().maximize();
			base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}

		@io.cucumber.java.After
		public void teardown() {
			System.out.println("Close browser");
			base.driver.quit();
		}
	}





