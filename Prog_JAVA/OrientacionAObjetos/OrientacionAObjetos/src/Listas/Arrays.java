package Listas;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tamaño = 5;
		
		
		int[][] matriz = new int[tamaño][tamaño];

		
		int contador = 1;
		
		
		for(int i=0; i< matriz.length; i++) {
			
				StringBuilder linea = new StringBuilder();
				linea.append("[");
				
				for (int j=0; j< matriz[i].length; j++) {
					matriz[i][j]= contador;
					contador ++;

					linea.append(",");
					linea.append(matriz[i][j]);
				}
				linea.append("]");
		
				imprimirMatriz(linea);
		}
		
		
		
	}
		
		public static void imprimirMatriz(StringBuilder linea) {
			
			System.out.println(linea);
			
		}
			
		
		
		
		
		
		
		
		
		/*
		Avion boeing = new Avion("boeing12",120 );
		Avion avion2 = new Avion("avion2",150);
		
		
		Avion[] aeropuerto = new Avion[58];
		aeropuerto[2]=boeing;
		aeropuerto[0]=avion2;
		
		
		aeropuerto[1] = new Avion("PacoRyanAir",250);
		
		int[] arrayNumeros = new int[100];
		arrayNumeros[3]=15;

		
		System.out.println("0");
		*/
}
