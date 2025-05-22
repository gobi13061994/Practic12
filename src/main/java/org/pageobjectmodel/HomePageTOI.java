package org.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageTOI {
	public  WebDriver driver;

	public HomePageTOI(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//yt-searchbox/button[@aria-label='Search']")
	private WebElement searchBtn;

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
    @FindBy(xpath="//form/input[@name='search_query']")
    private WebElement searchBox;

	public WebElement getSearchBox() {
		return searchBox;
	}
	public void clickSearchBtn() {
		searchBtn.click();
	}
	public void enterSearchBox(String inputToSearch ) {
		searchBox.sendKeys(inputToSearch);
	}
	public void enterAndSearch(String text) {
		enterSearchBox(text);
		clickSearchBtn();
		
	}
	

}
