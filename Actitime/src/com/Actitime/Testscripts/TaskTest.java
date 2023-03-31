package com.Actitime.Testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.Actitime.GenericLibrary.Baseclass;
import com.Actitime.GenericLibrary.Filelibrary;
import com.Actitime.pom.HomePage;
import com.Actitime.pom.Taskpage;

public class TaskTest extends Baseclass {

	@Test
	public void creatCustomer() throws EncryptedDocumentException, IOException {
		HomePage hp=new  HomePage(driver);
		hp.getTasklnk().click();
		
		Taskpage tp=new Taskpage(driver);
		tp.getAddnumber().click();
		tp.getNewcust().click();
	 Filelibrary f = new Filelibrary();
	String name = f.readDataFromExcelFile("Sheet1", 3, 1);
	    tp.getCustname().sendKeys(name);
	  String desp = f.readDataFromExcelFile("Sheet1", 3, 2);
	   
	   tp.getCustdescription().sendKeys(desp);
	 tp.getCreatcust().click();
	    
	    }

}
