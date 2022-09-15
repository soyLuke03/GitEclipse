package Familia;

public class GestionFamiliaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona ivan = new Persona("Iván","Gonzalez","Chanche","3333X");
		Persona desconocido = new Persona("Jose","Gonzalez","Chanche","3233X");

		
		//System.out.println(ivan.equals(desconocido));
		
		
		Persona madre = new Persona("María","Magdalena");
		Persona padre = new Persona("Jordi","González");
		
		Persona padre2 = new Persona("No","Sirve");
		Persona madre2 = new Persona("Esto","Menos");


		ivan.setProgenitor1(padre);
		ivan.setProgenitor2(madre);
		desconocido.setProgenitor1(padre2);
		desconocido.setProgenitor2(madre2);
				
		System.out.println(ivan.esHermanoDe(desconocido));

	}

}
