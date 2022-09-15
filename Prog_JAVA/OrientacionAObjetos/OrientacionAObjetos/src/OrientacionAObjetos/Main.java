package OrientacionAObjetos;

public class Main {

	public static void main(String[] args) {

		Persona antonio = new Persona(); //Constructor sin argumentos. Distinto del de abajo.
		Persona pepe = new Persona("pepe","sevillano",18,1.72); //Constructor con 4 argumentos
		
		antonio.setAltura(2);
		antonio.setEdad(500);
		antonio.nombre = "Antonio"  ;
		antonio.apellidos = "Sevillano";
		
		System.out.println(antonio.getEdad());
		
		antonio.saluda();
		
	}

}
