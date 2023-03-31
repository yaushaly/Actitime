package com.Actitime.GenericLibrary;

import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Actitime.pom.Loginpage;

public class Baseclass {
	public static WebDriver driver;
	Filelibrary f=new Filelibrary();
 @BeforeSuite
 public void cell() {
	 Reporter.log("cell",true);
 }
 @AfterSuite
 public void celldisconection() {
	 Reporter.log("celldisconected",true);
 }
 @BeforeClass
 public void lunchBrowser() throws IOException {
	 ChromeOptions options = new ChromeOptions();
	 options.addArguments("--remote-allow-origins=*");
	  driver= new ChromeDriver(options);
	 
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	String URL = f.readDataFromProperty("url1");
	 driver.get(URL);
 }
 @AfterClass
 public void closeBrowser(){
	Reporter.log("Close the brawoser",true);
	
	driver.close();
	
 }
 @BeforeMethod
 public void login() throws IOException {
	  String un = f.readDataFromProperty("username");
	 String pw = f.readDataFromProperty("password");
	 Loginpage p = new Loginpage(driver);
	 p.getUntbx().sendKeys(un);
	 p.getPwtbx().sendKeys(pw);
	 p.getLgbtn().click();
	 Reporter.log("logged in successfully",true);
	
	  
 }
 @AfterMethod
 public void logout() {
	 driver.findElement(By.id("LogoutLink")).click();
	 Reporter.log("logout sucessfully",true);
 }

  
 
}
