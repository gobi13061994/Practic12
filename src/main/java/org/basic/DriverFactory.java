package org.basic;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	static DriverFactory driverFactory =null;
	public static WebDriver driver;
	public DriverFactory() {
		// TODO Auto-generated constructor stub
	}
	public static DriverFactory getInstance() {
		
		if(driverFactory==null) {
			
			driverFactory=new DriverFactory();
			
		}return driverFactory;

	}
	
	public static void instanceOfDriver(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().getImplicitWaitTimeout();
			
			
		}else if (browser.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		 
	}else {
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		
		
		
		
	}
		
		
		
	}
	 

}
