package com.accenture.Calculadora_excel;

import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class LeerExcel {
		
	FileInputStream op ;
	HSSFWorkbook wb;
	Sheet sheet;
	


	
	public LeerExcel() throws IOException {
		op = new FileInputStream(new File("C:\\Users\\johan.rojas\\eclipse-workspace\\Calculadora_excel\\operaciones.xls"));
		wb = new HSSFWorkbook(op);
		sheet = wb.getSheetAt(0);
	}
	
	public static void main(String[] args) throws Exception{
		LeerExcel le = new LeerExcel();
		le.ObtenerOperaciones();
	
	}


	public List<Operacion> ObtenerOperaciones()
	{
		ArrayList<Operacion> operaciones = new ArrayList<Operacion>();
		Iterator<Row> filas = sheet.iterator();
		while(filas.hasNext()) {
			Row fila = filas.next();
			Iterator<Cell> celdas = fila.iterator();
			
			int cont = 0;
			
			Operacion operacion = new Operacion();
			
			while(celdas.hasNext()) {
				Cell celda = celdas.next();
				switch (cont) {
				case 0:
					operacion.setNum1((int)celda.getNumericCellValue());
					break;
				case 1:
					operacion.setOperacione(celda.getStringCellValue());
					break;
				case 2:
					operacion.setNum2((int)celda.getNumericCellValue());				
					break;
				}
				cont++;
			}
			System.out.println(operacion);
			operaciones.add(operacion);			
		}
		
		return operaciones;
				
	}
	

	
 
}
