package org.program;

import java.io.File;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReverseString {
	public static void main(String[] args) {
		WebDriver driver = null;
		Scanner inputString=new Scanner(System.in);
		System.out.println("Which String need to Reverse please provide needed String?");
		String input = inputString.nextLine();
		int sumOfDigitNumber=0;
		for(int i=input.length()-1;i>=0;i--) {
			char singleCharecter=input.charAt(i);
			//System.out.println(singleCharecter);
			String charToString = Character.toString(singleCharecter);
			if(charToString.matches("0-9")) {
				char numChar = charToString.charAt(0);
				int numericValue = Character.getNumericValue(numChar);
				sumOfDigitNumber=sumOfDigitNumber+numericValue;
				WebDriverWait webDriverWait=new WebDriverWait(driver, Duration.ofSeconds(10));
				webDriverWait.until(ExpectedConditions.alertIsPresent());
				FluentWait<WebDriver> fluentWait=new FluentWait<>(driver).withTimeout(Duration.ofSeconds(450)).pollingEvery(Duration.ofSeconds(20)).ignoring(NoSuchElementException.class);
				fluentWait.until(ExpectedConditions.elementToBeClickable(By.id("floor")));
				
				driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.xpath("")).toRightOf(By.xpath("")));
				String windowHandle = driver.getWindowHandle();
				Set<String> windowHandles = driver.getWindowHandles();
				int size = windowHandles.size();
				for(int j=0;size>=j;j++) {
					Object[] array = windowHandles.toArray();
					Object[][] j1= {{56,89,8,78,90},{23,78,90,56,78}};
					
				}
				
			}
			
			
			
		}
		WebElement element = driver.findElement(By.tagName(""));
		File screenshotAs = element.getScreenshotAs(OutputType.FILE);
		System.out.println(sumOfDigitNumber);
	}

}
