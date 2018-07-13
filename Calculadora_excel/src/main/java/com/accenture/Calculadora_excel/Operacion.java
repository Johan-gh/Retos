package com.accenture.Calculadora_excel;

public class Operacion {
	int num1;
	String operacione;
	int num2;
	
	public Operacion(int num1, String operacione, int num2) {
		super();
		this.num1 = num1;
		this.operacione = operacione;
		this.num2 = num2;
	}
	
	public Operacion() {
		super();
	}

	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public String getOperacione() {
		return operacione;
	}
	public void setOperacione(String operacione) {
		this.operacione = operacione;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return num1 + " "+ operacione + " " + num2;
	}
}
