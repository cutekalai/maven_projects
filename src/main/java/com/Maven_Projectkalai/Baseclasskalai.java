package com.Maven_Projectkalai;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclasskalai {
	public static WebDriver driver;
	public static String value;

	public static WebDriver browser_configuration(String type) {

		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();

		}

		else if (type.equalsIgnoreCase("firefox")) {

			System.setProperty("webdrivergecko.driver",
					"C:\\\\Users\\\\PS\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\gecko.exe");

			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		return driver;

	}

	public static void clickonElement(WebElement element) {

		element.click();
	}

	public static void inputvalueelement(WebElement element, String data) {

		element.sendKeys(data);

	}

	public static void getUrl(String url) {

		driver.get(url);

	}

	public static void dropdown(String type, WebElement element,String value) {
		
	    try {
	    	
	    	Select s = new Select(element);
	    	
	    	if (type.equalsIgnoreCase("byvalue")) {
				
	    		s.selectByValue(value);
			}
	    	
	    	else if (type.equalsIgnoreCase("bytext")) {
	    		
	    		s.selectByVisibleText(value);
	    	}
				
		
	    	else if (type.equalsIgnoreCase("byindex")) {
	    		
	    		int index = Integer.parseInt(value);
	    		
	    		s.selectByIndex(index);
				
			}
	    	
	    } catch (Exception e) {
		 e.printStackTrace();
	    	
		}

	
	}
	
	
	public static String  getdata(String path,int sheetindex,int rowindex,int cellindex)throws IOException{ 
	
		File f=new File(path);
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		
		Sheet s= wb.getSheetAt(sheetindex);
		Row r=s.getRow(rowindex);
		
	Cell c=r.getCell(cellindex);
	CellType type=c.getCellType();
	if (type.equals(CellType.STRING)) {
		value= c.getStringCellValue();
		
		}
	else if (type.equals(CellType.NUMERIC)){
		double cellvalue=c.getNumericCellValue();
		int i=(int) cellvalue;
		value=String.valueOf(i);
		
	  }
	
	return value;
	}
	
}



