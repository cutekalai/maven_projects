package com.demopostman;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Baseclassdemopostman {
	public static String value;
	
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
