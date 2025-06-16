package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calcu = new Calculadora();
		int resultadoSuma;
		int resultadoResta;
		double resultadoMultiplicacion;
		double resultadoDivision;
		double resultadoPromedio;
		
		
		resultadoSuma=calcu.sumar(5, 8);
		resultadoResta=calcu.restar(10,8 );
		resultadoMultiplicacion=calcu.multiplicar(14.5, 3.1416);
		resultadoDivision= calcu.dividir(78.3,2.8);
		resultadoPromedio = calcu.promediar(8.98, 9.52, 8.97);
		calcu.mostrarResultado();
		
		
		
		System.out.println("Resultado Suma: "+resultadoSuma);
		System.out.println("Resultado Resta: "+resultadoResta);
		System.out.println("Resultado Multiplicacion: "+resultadoMultiplicacion);
		System.out.println("Resultado Division: "+resultadoDivision);
		System.out.println("Resultado Promedio: "+resultadoPromedio);
		
		
	}

}
