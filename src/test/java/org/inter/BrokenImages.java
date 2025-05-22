package org.inter;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImages {
	public static void main(String[] args) throws IOException,MalformedURLException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> links=driver.findElements(By.tagName("img"));
		System.out.println(links.size());
		for(WebElement link:links) {
			String linkUrl = link.getAttribute("src");
					if(linkUrl!=null) {
						URL url=new URL(linkUrl);
						URLConnection urlConnection = url.openConnection();
						HttpURLConnection httpConnection=(HttpURLConnection)urlConnection;
						
						int responseCode = httpConnection.getResponseCode();
						if(responseCode>=400) {
							System.out.println(linkUrl);
						}
			}
	

}
		driver.close();
}
}