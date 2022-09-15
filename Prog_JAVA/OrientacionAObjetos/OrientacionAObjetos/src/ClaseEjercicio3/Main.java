package ClaseEjercicio3;

import java.util.Scanner;

public class Main {

	
	
	
	public static void main(String[] args) throws CafeExcepcion {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner (System.in);		
		Maquina maquina = new Maquina();
		String opcion = null;
		do {
		
			try {
				
				System.out.println("\n1- Servir café solo (1 euro)"
						+ "\n2- Servir leche (0,8 euros)"
						+ "\n3- Servir café con leche (1,5 euros)"
						+ "\n4- Consultar estado máquina"
						+ "\n5- Apagar y salir\n");
				
				opcion = sc.nextLine();
				
				switch (opcion) {
				case "1":{ //cafe solo
					
					maquina.servirCafe(opcion);
					
				}break;
				case "2":{ //leche
					maquina.servirCafe(opcion);
					
				}break;
				case "3":{ //cafe con leche
					maquina.servirCafe(opcion);
					
				}break;
				case "4":{ //consultar estado
					maquina.consultaEstado();
				}break;
				case "5":{ //salir
					
				}
				default:
					break;
				}		
			} 
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		
		
		}while (!opcion.equals("5"));
		
	}

}
