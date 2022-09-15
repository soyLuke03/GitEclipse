package Boletin2.Ejerc1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Punto pt1 = new Punto(4, 1);
		Punto pt2 = new Punto(4, 1);
	
		Linea midLane = new Linea(pt1, pt2);
		
		System.out.println(pt1.equals(pt2));
		
		System.out.println("");
	}
	

}
