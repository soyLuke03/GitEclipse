package Boletin2.Ejerc1;

public class Linea {
	
	private Punto puntoA;
	private Punto puntoB;

	
	public Linea (Punto puntoA, Punto puntoB) {
		this.puntoA = puntoA;
		this.puntoB = puntoB;
	}
	
	
	
	
	//METODOS
	

	
	
	
	public void mostrarInfo(Punto uno, Punto dos) {
		
		Punto pUno = (Punto)uno; 
		Punto pDos = (Punto)dos;
		
		System.out.println("("+pUno.getX()+","+pUno.getY()+"),("+pDos.getX()+","+pDos.getY()+")");
	}
	
	
	
	
	//GETTER

	public Punto getPuntoA() {
		return puntoA;
	}
	public Punto getPuntoB() {
		return puntoB;
	}
	
	
	//SETTER
	
	public void setPuntoA(Punto puntoA) {
		this.puntoA = puntoA;
	}
	public void setPuntoB(Punto puntoB) {
		this.puntoB = puntoB;
	}

 

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString(puntoA);
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
