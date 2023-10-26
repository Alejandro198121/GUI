package co.edu.udistrital.model;

public class Operaciones {

	public static int sumar(int a, int b) {
		return (a + b);
	}
	
	public static int restar(int a, int b) {
		return (a - b);
	}
	
	public static int multiplicar(int a, int b) {
		return (a * b);
	}
	

	public static double dividir(int a, int b) throws ZeroDivisionException {
		if(a==0 &&b==0) {
			throw new ZeroDivisionException("Error, 0/0 es una indeterminación");
		}
		if (b==0) {
			throw new ZeroDivisionException();
		}
		return ((double)a / (double)b);
	}
}
