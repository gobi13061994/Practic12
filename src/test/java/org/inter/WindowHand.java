package org.inter;

import java.util.Set;
import org.basic.DriverFactory;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WindowType;

public class WindowHand extends DriverFactory{

	public static void main(String[] args) {
		instanceOfDriver("Chrome");
		driver.get("https://www.google.com/");
		
		
	    driver.switchTo().newWindow(WindowType.TAB);
	    driver.navigate().to("https://www.facebook.com/");
	    String parentId = driver.getWindowHandle();
	   // driver.switchTo().newWindow(WindowType.TAB);
	   // driver.navigate().to("https://www.hotstar.com/in/home?ref=%2Fin");
	   // driver.switchTo().newWindow(WindowType.TAB);
	   // driver.navigate().to("https://www.instagram.com/");
	    Set<String> allWindowsId = driver.getWindowHandles();
	    for (String singleWindow : allWindowsId) {
	    	if(!singleWindow.equals(parentId)) {
	    		driver.switchTo().window(singleWindow);
	    		@Nullable
				String title = driver.getTitle();
	    		System.out.println(title);
	    		
	    	}
			
		}
		

	}

}

