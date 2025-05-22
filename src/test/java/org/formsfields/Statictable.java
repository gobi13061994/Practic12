package org.formsfields;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Statictable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		/*List<WebElement> xpath=driver.findElements(By.xpath("//tbody[@style='box-sizing:inherit']/tr/th"));
		for(int i=0;i<xpath.size();i++)
		{
			System.out.println(xpath.get(i).getText());
		}
		*/
		
		
		
	  
	   
		
		
		
		for(int i=1;i<=3;i++)
		{
			
		 WebElement xpath=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr/th["+i+"]"));
		System.out.println(xpath.getText());
		
		 List <WebElement> xpath1=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td["+i+"]"));
		for(int j=0;j<xpath1.size();j++)
		{
			System.out.println(xpath1.get(j).getText());
		}
		
	}

}
}