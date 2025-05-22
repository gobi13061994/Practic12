package org.inter;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormFilling {

	public static void main(String[] args) {
		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver=new ChromeDriver();
		 * driver.get("https://www.jotform.com/form/250773183167461"); WebElement
		 * firstName=driver.findElement(By.xpath("//input[@id='first_3']"));
		 * ////input[@id='last_3'] WebElement
		 * lastName=driver.findElement(By.xpath("//input[@id='last_3']")); ///
		 * firstName.sendKeys("Gobi"); lastName.sendKeys("R"); WebElement
		 * addLine1=driver.findElement(By.xpath("//input[@id='input_4_addr_line1']"));
		 * addLine1.sendKeys("Gobi"); WebElement
		 * hearAbout=driver.findElement(By.xpath("//select[@id='input_8']")); Select
		 * dropDown=new Select(hearAbout); dropDown.selectByVisibleText("Newspaper");
		 */
		//String to char to int;
		String s2= "b2c2v3";
				int length = s2.length();
				//System.out.println(length);
                int sumDigit=0;
				for(int i=0;s2.length()>i;i++){
				 char c=s2.charAt(i);
				// System.out.println(c);
                 if(c=='2'||c=='3'){
					int numericValue = Character.getNumericValue(c);
					//System.out.println(numericValue);
				   sumDigit=sumDigit+numericValue;
				}
				}
				System.out.println(sumDigit);
				
				
				
       //string to int
				String yearOfBirth="121212";
				int result=0;
				int reminder=0;	
			int yearOfBirthInt = Integer.parseInt(yearOfBirth);
			while(yearOfBirthInt>0) {
				 reminder=yearOfBirthInt%10;
				 result=result+reminder;
				 yearOfBirthInt=yearOfBirthInt/10;
			}
			System.out.println(result);
		
		int[] a= {5,89,45,23,89};
			Arrays.sort(a);
			System.out.println(a[1]);
			int b=a[0]*a[1];
			System.out.println(b);
		
	}
	

}
