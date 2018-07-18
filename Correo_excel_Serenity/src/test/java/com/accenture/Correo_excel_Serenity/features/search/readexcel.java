package com.accenture.Correo_excel_Serenity.features.search;

import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class readexcel{
	
	FileInputStream agenda;
	XSSFWorkbook wb;
	Sheet sheet;

	public readexcel() throws IOException{
		agenda = new FileInputStream(new File("C:\\Users\\johan.rojas\\eclipse-workspace\\correos_excel\\agenda.xlsx"));
		wb = new XSSFWorkbook(agenda);			
		sheet = wb.getSheetAt(0);
	}
	
	
	
	public List<String> Obtenercorreos()
	{
		ArrayList<String> correo= new ArrayList<String>();
		Iterator<Row> filas = sheet.iterator();
		while(filas.hasNext()) {
			Row fila = filas.next();
			Iterator<Cell> celdas = fila.iterator();										
			while(celdas.hasNext()) {
				Cell celda = celdas.next();									
			correo.add(celda.getStringCellValue());			
			}
			
		}
		return correo;					
	}
	
}



