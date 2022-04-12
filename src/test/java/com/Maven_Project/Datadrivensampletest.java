package com.Maven_Project;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class  Datadrivensampletest  {
	private static void Particular_cell_data() throws IOException {
		File f=new File("C:\\Users\\Vignesh\\eclipse-workspace\\Maven_Project\\text_case.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);

		Sheet s= wb.getSheetAt(0);
		Row r=s.getRow(2);

		Cell c=r.getCell(1);
		CellType type=c.getCellType();
		if (type.equals(CellType.STRING)) {
			String CellValue= c.getStringCellValue();
			System.out.println(CellValue);
		}
		else if (type.equals(CellType.NUMERIC)){
			double cellvalue=c.getNumericCellValue();
			int value=(int) cellvalue;
			System.out.println(value);

		}

		wb.close();
	}
	private static void All_data() throws IOException {
		File f=new File("C:\\Users\\Vignesh\\eclipse-workspace\\Maven_Project\\text_case.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);

		Sheet s= wb.getSheetAt(0);
		for (int i = 0; i <s.getPhysicalNumberOfRows(); i++) {
			Row row=s.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell=row.getCell(j);
				CellType type=cell.getCellType();


				if (type.equals(CellType.STRING)) {
					String CellValue= cell.getStringCellValue();
					System.out.println(CellValue);
				}
				else if (type.equals(CellType.NUMERIC)){
					double cellvalue=cell.getNumericCellValue();
					int value=(int) cellvalue;
					String s1=Integer.toString(value);
					System.out.println(s1);
				}
			}}

		wb.close();	
	}

	private static void Particular_row_data() throws IOException {
		File f=new File("C:\\Users\\Vignesh\\eclipse-workspace\\Maven_Project\\text_case.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);

		Sheet s= wb.getSheetAt(0);
		Row r=s.getRow(2);
		for (int i= 0; i < r.getPhysicalNumberOfCells(); i++) {
			Cell c=r.getCell(i);
			CellType type=c.getCellType();



			if (type.equals(CellType.STRING)) {
				String CellValue= c.getStringCellValue();
				System.out.println(CellValue);
			}
			else if (type.equals(CellType.NUMERIC)){
				double cellvalue=c.getNumericCellValue();
				int value=(int) cellvalue;
				String s1=Integer.toString(value);
				System.out.println(s1);

			}}

		wb.close();
	}
	private static void Particular_column_data() throws IOException {
		File f=new File("C:\\Users\\Vignesh\\eclipse-workspace\\Maven_Project\\text_case.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);

		Sheet s= wb.getSheetAt(0);

		for (int i= 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r=s.getRow(i);
			Cell c=r.getCell(1);
			CellType type=c.getCellType();



			if (type.equals(CellType.STRING)) {
				String CellValue= c.getStringCellValue();
				System.out.println(CellValue);
			}
			else if (type.equals(CellType.NUMERIC)){
				double cellvalue=c.getNumericCellValue();
				int value=(int) cellvalue;
				String s1=Integer.toString(value);
				System.out.println(s1);

			}}

		wb.close();
	}


	public static void main(String[] args) throws IOException{
		Particular_cell_data();	
		All_data();
		Particular_row_data();	
		Particular_column_data();	

	}

}


