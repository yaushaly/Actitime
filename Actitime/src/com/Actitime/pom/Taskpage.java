package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Taskpage {
//declaration
	
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement addnumber;
	
	@FindBy (xpath = "//div[.='+ New Customer']")
	private WebElement newcust;
	
	@FindBy (xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custname;
	
	@FindBy (xpath = "(//textarea[@placeholder='Enter Customer Description'])")
	private WebElement custdescription;
	
	public WebElement getAddnumber() {
		return addnumber;
	}

	public WebElement getNewcust() {
		return newcust;
	}

	public WebElement getCustname() {
		return custname;
	}

	public WebElement getCustdescription() {
		return custdescription;
	}

	public WebElement getCreatcust() {
		return creatcust;
	}

	@FindBy (xpath = "//div[.='Create Customer']")
	private WebElement creatcust;
	
	public Taskpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
