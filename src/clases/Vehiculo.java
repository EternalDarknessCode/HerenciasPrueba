package clases;

import java.util.Scanner;

public class Vehiculo {
	Scanner sc = new Scanner (System.in);
	//Atributos
	private String matricula;
	private int caballos;
	//Constructor 
	public Vehiculo(String matricula, int caballos) {
		super();
		this.matricula = matricula;
		this.caballos = caballos;
	}
	
	//Getter y setter
	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public int getCaballos() {
		return caballos;
	}


	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}


	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", caballos=" + caballos + "]";
	}


	public void setDatos() {
		// TODO Auto-generated method stub
		System.out.println("Introduce la matricula");
		matricula = sc.next();
		System.out.println("Introduce los caballos");
		caballos = sc.nextInt();
	}
	
}
