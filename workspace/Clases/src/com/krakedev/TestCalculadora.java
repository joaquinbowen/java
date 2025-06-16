package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calcu = new Calculadora();
		int resultadoSuma;
		int resultadoResta;
		
		
		resultadoSuma=calcu.sumar(5, 8);
		resultadoResta=calcu.restar(10,8 );
		
		
		System.out.println("Resultado Suma: "+resultadoSuma);
		System.out.println("Resultado Resta: "+resultadoResta);
		
		
	}

}
