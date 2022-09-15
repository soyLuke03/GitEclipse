package MiPrimeraClase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		boolean toggle = true;
//		Avion nuevoAvion =crearAvionConMenu();
		
		
		
		//AUTOCREACION DE OBJETOS CON ARRAYS
		
		
		Avion[] aeropuertoSevilla = new Avion[50];
		
		for (int i=0;i<aeropuertoSevilla.length;i++) {
			Avion avion = new Avion("id"+i, 150);
			aeropuertoSevilla[i]=avion;
		}
		System.out.println("0");
		
		
		 
	}//Parte ejercicio listas.
		
//		String opcion = "";

		/*
		while (toggle == true) {
			
		
		
		System.out.println("##Menú principal##");
		System.out.println("a: Asignar vuelo\n"
						 + "b: Obtener número de vuelos\n"
						 + "c: Obtener número de kilometros\n"
						 + "d: Obtener media de kilómetros por vuelo\n"
						 + "e: Cambiar de compañía\n"
						 + "f: Mostrar información del avión\n"
						 + "g: Salir");
		
		opcion = sc.nextLine();
		opcion = opcion.toLowerCase();

		
		
		
		
		switch (opcion) {
		case "a":{
			
			System.out.println("¿Cuántos viajeros van en el avión? ");
			int viajeros = Integer.valueOf(sc.nextLine());
			System.out.println("¿Cuántos kilómetros recorre?");
			int kmRecorridos = Integer.valueOf(sc.nextLine());
			
			
			System.out.println(nuevoAvion.asignarVuelo(viajeros, kmRecorridos));
			
		}break;
		case "b":{
			
			System.out.println(nuevoAvion.getNumVuelos());
			
		}break;
		case "c":{
			
			System.out.println(nuevoAvion.getKmVolados());
			
		}break;
		case "d":{
			
			System.out.println("La media de kilómetros es: "+ nuevoAvion.getMediaKM());
			
		}break;
		case "e":{
			
			System.out.println("¿A qué compañía quieres cambiar el avión? ");
			String comp = sc.nextLine();
			nuevoAvion.setCompannia(comp);
			
			System.out.println("Cambio realizado con éxito");
			
		}break;
		case "f":{
			
			System.out.println("\nAvión con ID: "+ nuevoAvion.getIdAvion()+" de la compañía: "+nuevoAvion.getCompannia()+" ha realizado "+nuevoAvion.getNumVuelos()+" vuelos, con un total de "+nuevoAvion.getKmVolados()+" km y una media de "+nuevoAvion.getMediaKM()+" km por vuelo.\n");
			
		}break;
		case "g":{
			
			toggle = false;
			
		}break;
		}
		
		
		}
		
	}
*/
	public static Avion crearAvionConMenu () {
		System.out.println("Menú de creación; \n"+ "1: Crear avión con ID: \n" 
							 + "2: Crear ación con ID y compañía: \n"
							 +"");

		int capacidad = 0;
		Avion avionCreado = null;
		
		
		Scanner sc = new Scanner(System.in);
		int opc1 = Integer.valueOf(sc.nextLine());
		
		if (opc1==1) {
			System.out.println("Introduce el ID del avión: ");
			String iD = sc.nextLine();
			System.out.println("Introduce la capacidad: ");
			capacidad = Integer.valueOf(sc.nextLine());
			
			avionCreado = new Avion(iD,capacidad);
		}
		else if (opc1==2) {
			System.out.println("Introduce el ID del avión: ");
			String iD = sc.nextLine();
			System.out.println("Introduce la compañía: ");
			String compania = sc.nextLine();
			System.out.println("Introduce la capacidad: ");
			capacidad = Integer.valueOf(sc.nextLine());
			
			avionCreado = new Avion(iD,compania,capacidad);
		}
		else {
			System.out.println("La opción no es correcta");
		}
		
		
		return avionCreado;
	}
}
