package Boletin2.Ejerc1;

public class Punto {

	private Double x = 0.0;
	private Double y = 0.0;
	
	
	public Punto (double x, double y) {
		this.x = x;
		this.y = y;
	}


	public Double getX() {
		return x;
	}
	public Double getY() {
		return y;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = false;
		
		if (this == obj) {
			sonIguales = true;
		}
		else {
			Punto other = (Punto) obj;
			if (other != null && other.getX().equals(this.x) && other.getY().equals(this.y)) {
				sonIguales = true;
			}
		}
		
		return sonIguales;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	public void moverDerecha(double cant) {
		this.x += cant;
	}
	
	public void moverIzquierda(double cant) {
		this.x -= cant;
	}
	
	public void moverArriba(double cant) {
		this.y += cant;
	}
	
	public void moverabajo(double cant) {
		this.y -= cant;
	}
	
}
