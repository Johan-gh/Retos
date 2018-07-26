package co.com.bancolombia.factoring.google.util;

import java.util.List;
import java.io.File;
import java.io.FileInputStream;
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

	public readexcel() {
		try {
			agenda = new FileInputStream(new File("C:\\Users\\johan.rojas\\eclipse-workspace\\PruebaCucumber\\agenda.xlsx"));
			wb = new XSSFWorkbook(agenda);			
			sheet = wb.getSheetAt(0);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}		
	
	public List<String> Obtenernombres()
	{
		ArrayList<String> nombres= new ArrayList<String>();
		Iterator<Row> filas = sheet.iterator();
		while(filas.hasNext()) {
			Row fila = filas.next();
			Iterator<Cell> celdas = fila.iterator();										
			while(celdas.hasNext()) {
				Cell celda = celdas.next();									
			nombres.add(celda.getStringCellValue());			
			}
			
		}
		return nombres;					
	}
	
}



