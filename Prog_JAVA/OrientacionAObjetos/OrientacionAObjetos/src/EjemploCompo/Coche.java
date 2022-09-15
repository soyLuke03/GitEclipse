package EjemploCompo;

import java.util.Objects;

public class Coche {

	private Chasis chasis;
	private Motor motor;
	private Rueda[] ruedas;
	
	
	private String marca;
	private String modelo;
	private double precio;
	
	//Se usa un constructor
	
	public Coche(Chasis chasis, Motor motor, Rueda[] ruedas) {
		this.chasis = chasis;
		this.motor = motor;
		this.ruedas = ruedas;
	}
	
	
	
	






	@Override
	public int hashCode() {
		return Objects.hash(chasis);
	}

	@Override
	public boolean equals(Object obj) {
		
		boolean sonIguales = false;
		
		Coche other = (Coche) obj;
		
		if (this==obj) {
			sonIguales = true;
		}
		else {
			sonIguales = this.chasis.equals(other.chasis);
		}
		
		return sonIguales;
	}










	public Chasis getChasis() {
		return chasis;
	}
	public void setChasis(Chasis chasis) {
		this.chasis = chasis;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public Rueda[] getRuedas() {
		return ruedas;
	}
	public void setRuedas(Rueda[] ruedas) {
		this.ruedas = ruedas;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}










	@Override
	public String toString() {
		return "Coche con marca= " + marca + ", modelo=" + modelo + ", precio=" + precio;
	}
}
