package org.inter;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableData {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		for(int i=2;i<=5;i++) {
			String xpath="//table/tbody/tr/td["+i+"]";
			List<WebElement> elements = driver.findElements(By.xpath(xpath));
			for(int j=0;elements.size()>j;j++) {
				WebElement singleElemnt = elements.get(j);
				if(j==0) {
					String singleHeader=singleElemnt.getText();
					System.out.println("================================= "+singleHeader+"=======================================" );
					
				}else {
				//WebElement singleElemnt = elements.get(j);
				
				System.out.println(singleElemnt.getText());
				}
				
			}
			System.out.println("=====================================================================================================");
		}
		driver.close();

	}

}
