package model;

import java.util.Iterator;

public class Numero {

	private int n;

	public Numero(int n) {
		this.n = n;
	}

	public String mostrarMultiplos(int[] multiplosint) {
		int multiplo = 0;
		int c = 0;
		while (verificarRango()) {
			multiplo = multiplo + n;
			c++;
		}
		String multiplosString = "";

		for (int i = 0; i <= c; i++) {
			multiplosString = multiplosString + ", " + multiplosint[i] + ", ";
		}

		return multiplosString;
	}

	public int[] multiplos() {
		int multiplo = 0;
		int multiplosarray[];
		int c = 0;
		while (verificarRango()) {
			multiplo = multiplo + n;
			c++;
		}
		multiplosarray = new int[c];
		multiplo = 0;
		for (int i = 0; i < 101; i++) {
			multiplo = multiplo + n;
			multiplosarray[i] = multiplo;
		}
		return multiplosarray;
	}
	
	public int numeroMultiplos() {
		int multiplo = 0;
		int c = 0;
		while (verificarRango()) {
			multiplo = multiplo + n;
			c++;
		}
		return c;
	}

	public boolean verificarRango() {
		if (n < 101 && n >= 0) {
			return true;
		} else {
			return false;
		}
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

}
