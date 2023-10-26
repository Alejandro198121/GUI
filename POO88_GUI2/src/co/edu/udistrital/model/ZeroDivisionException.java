package co.edu.udistrital.model;

public class ZeroDivisionException extends Exception{

	public ZeroDivisionException() {
		super("Error no se puede dividir entre 0");
	}
	public ZeroDivisionException(String mensaje) {
		super(mensaje);
		
	}
}
