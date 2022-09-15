package ClaseEjercicio2;

import java.util.Scanner;

import MiPrimeraClase.Avion;

public class Main {

	public static void main(String[] args) {

		Cuenta cuenta = new Cuenta();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saldo inicial: ");
		cuenta.setSaldo(Integer.valueOf(sc.nextLine()));
		
		String opcion = "a";
		while (!opcion.equals("4")) {
		
		System.out.println("\n1- Reintegro \n"
				 + "2- Ingreso \n"
				 + "3- Consulta \n"
				 + "4- Finalizar");
		opcion = sc.nextLine();
		switch (opcion) {
		case "1":{
			System.out.println("Cantidad a retirar de la cuenta: ");
			cuenta.reintegro(Integer.valueOf(sc.nextLine()));
			
		}break;
		case "2":{
			System.out.println("Cantidad a depositar en la cuenta: ");
			cuenta.ingreso(Integer.valueOf(sc.nextLine()));
			
		}break;
		case "3":{
			System.out.println("\nSaldo: " + cuenta.getSaldo() + " euros. \n"
					+"Ingresos: " + cuenta.getContadorIngresos() + ".\n"
					+"Reintegros: " + cuenta.getContadorReintegros() + ".") ;
		}break;
		default:{
		System.out.println("Opción inválida.");	
		}break;
		
		}
		}
		
		
		
		
		
		
		
		
		
	}
}
