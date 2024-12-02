package principal;

import java.util.Scanner;

import clases.Coche;
import clases.Moto;
import clases.Vehiculo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//voy a crear un vehiculo
		Vehiculo vehiculo;
		String matricula; 
		int caballos;
		boolean tieneSidecar;
		Integer numeroPuertas;
		//Vehiculo vehiculo = new Vehiculo();
		//vehiculo.setDatos();
		
		System.out.println("Introduce matricula ");
		matricula = scanner.next();
		System.out.println("Introduce caballos ");
		caballos = scanner.nextInt();
		vehiculo = new Vehiculo(matricula, caballos);
		
		System.out.println("El vehiculo introducido es " + vehiculo.toString());
		
		
		
		System.out.println("Introduce moto");
		System.out.println("Introduce matricula ");
		matricula = scanner.next();
		System.out.println("Introduce caballos ");
		caballos = scanner.nextInt();
		System.out.println("Tiene sidecar?");
		tieneSidecar = scanner.nextBoolean();
		vehiculo = new Moto(matricula, caballos, tieneSidecar);
		System.out.println("La moto introducidad es  " + vehiculo.toString());
		
		System.out.println("Introduce coche");
		System.out.println("Introduce matricula ");
		matricula = scanner.next();
		System.out.println("Introduce caballos ");
		caballos = scanner.nextInt();
		System.out.println("Introduce el numero de puertas");
		numeroPuertas = scanner.nextInt();
		vehiculo = new Coche(matricula,caballos, numeroPuertas);
		System.out.println("El coche introducido es " + vehiculo.toString() + " es familiar "  + ((Coche) vehiculo).esFamiliar() );
		//Voy a crear un coche subclase (hijo)
		//Coche coche = new Coche();
		//Con poliformismo
		/*vehiculo = new Coche();
		vehiculo.setDatos();
		
		System.out.println("El coche introducido es " + vehiculo.toString());
		
		System.out.println("Introduce moto");
		vehiculo = new Moto();
		vehiculo.setDatos();
		
		System.out.println("La moto introducida es " + vehiculo.toString());*/
	}

}
