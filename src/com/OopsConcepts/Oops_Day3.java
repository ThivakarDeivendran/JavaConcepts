package com.OopsConcepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oops_Day3 {
	
	public void Nike() {
		System.out.println("Nike Basketball shoe");
	}
	public void Reebok() {
		System.out.println("Reebok company");
		}
	public void Adidas() {
		System.out.println("Adidas Track");
	}
	public void Swiggy() {
		System.out.println("Swiggy Food");
	}
	public void Flipkart() {
		System.out.println("Flipkart Product");
	}
	
	
	public static void main(String[] args) throws IOException {
		Oops_Day3 onlineShopping =new Oops_Day3();
//		onlineShopping.Flipkart();
//		onlineShopping.Swiggy();
//		onlineShopping.Adidas();
//		onlineShopping.Reebok();
//		onlineShopping.Nike();
		
		//arrayList();
		excelFileValue();

	}
	public static void excelFileValue() throws IOException {
		File filename = new File ("C:\\Users\\user\\Desktop\\TestFile.xlsx");
		FileInputStream fis = new FileInputStream(filename);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheet =workbook.getNumberOfSheets();
		XSSFSheet sheet1= workbook.getSheetAt(0);
		String value =sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
	}
	
	
	public static void arrayList()
	{
		Integer arr[] = {1,2,3,4,5,6};  
		//System.out.println("Array:"+Arrays.toString(arr));  
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arr));  
		arrayList.add(7);  
		System.out.println("fjndknfadj"+arrayList);
		arr = arrayList.toArray(arr);  
		System.out.println(arr);
		//System.out.println("Array after adding element: "+Arrays.toString(arr));  
		  
	}
	
	public static void takesScreenShotMethod() throws IOException {
		WebDriver driver = new ChromeDriver();
		 TakesScreenshot screenShotName = (TakesScreenshot)driver;
		 File srcFileName = screenShotName.getScreenshotAs(OutputType.FILE);
		 File desinationFileName = new File("");
		 FileUtils.copyFile(srcFileName, desinationFileName);
	}
}
