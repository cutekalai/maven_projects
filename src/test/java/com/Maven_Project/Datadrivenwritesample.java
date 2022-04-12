package com.Maven_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadrivenwritesample {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Vignesh\\Desktop\\Write_case.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		wb.createSheet("kalai").createRow(0).createCell(0).setCellValue("email");
		wb.getSheet("kalai").getRow(0).createCell(1).setCellValue("password");
		wb.getSheet("kalai").createRow(1).createCell(0).setCellValue("kalai");
		wb.getSheet("kalai").getRow(1).createCell(1).setCellValue("kalai@123");
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
	}
}
