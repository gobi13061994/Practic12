package org.Execu;

import org.basic.DriverFactory;
import org.pageobjectmodel.HomePageTOI;

public class Excetutor extends DriverFactory {

	
public static void main(String[] args) {
	Excetutor exe= new Excetutor();
	exe.instanceOfDriver("chrome");
	//System.out.println("Launched");
	Logger("Launched");
	driver.get("https://www.youtube.com/"); 
	HomePageTOI home=new HomePageTOI(driver);
	//home.enterAndSearch("TamilSongs");
	//home.enterSearchBox("Hindi Songs");
	//home.clickSearchBtn();
	home.getSearchBox().sendKeys("mayamstudio");
	home.getSearchBtn().click();
	driver.quit();
}

private static void Logger(String string) {
	// TODO Auto-generated method stub
	
}
}
