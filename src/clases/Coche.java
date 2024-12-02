package clases;

import java.util.Scanner;

public class Coche extends Vehiculo {
	

	Scanner sc = new Scanner (System.in);
	private Integer numeroPuertas;
	//Constructor
	public Coche(String matricula, int caballos, Integer numeroPuertas) {
		super(matricula, caballos);
		this.numeroPuertas = numeroPuertas;
	}
	
	public Integer getNumeroPuertas() {
		return numeroPuertas;
	}



	public void setNumeroPuertas(Integer numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}
	
	//setDatos
	public void setDatos() {
		super.setDatos();
		System.out.println("Introduce el numero de puertas");
		numeroPuertas = sc.nextInt();
	}
	
	
	@Override
	public String toString() {
		return super.toString() + " Coche [numeroPuertas=" + numeroPuertas + "]";
	}
	
	//Metodo
			public boolean esFamiliar() {
				return numeroPuertas>= 4;
			}
}
