package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
//decleration
	@FindBy(xpath = "//div[.=''Tasks']")
	private WebElement tasklnk;
	
	@FindBy(xpath = "//div[.='Reports']")
	private WebElement reportlink;
	
	@FindBy (xpath = "//div[.='User']")
	private WebElement userlnk;
	
	@FindBy (id = "logoutLink")
	private WebElement lgoutlnk;
	
	//initilization
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getTasklnk() {
		return tasklnk;
		
	}
		
	
}
