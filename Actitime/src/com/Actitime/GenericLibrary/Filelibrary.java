package com.Actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.j2objc.annotations.Property;
// this class is a generic class which is having non-static method to perform data driven   
public class Filelibrary {
public String readDataFromProperty(String key) throws IOException {
	FileInputStream fis = new FileInputStream("./testdata/commondata.property");
	Properties p = new Properties();
	p.load(fis);
	String value = p.getProperty(key);
	return value;
	}
/**
 * this method is the non static method used to Read the data from excel sheet.
 * @param sheetname
 * @param row
 * @param cell
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public String readDataFromExcelFile( String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./TestData/Apna_Bank.xlsx");
	Workbook wb = WorkbookFactory.create( fis);
	String value = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	return value ;
}
}
