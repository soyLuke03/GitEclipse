package CartaRestaurante;

import java.util.Objects;

public class Plato {

	//Atributos
	private String nombre = "Plato vacío";
	private Double precio = 20.0;
	private static Double iva = 21.0;
	private Vino vinoRecomendado;
	
	
	//Constructor
	
	public Plato(String nombre) {
		this.nombre=nombre;
	}
	
	public Plato(String nombre, Double precio) {
		this.nombre = nombre;
		if (precio <= 0) {
			throw new PlatoException("[ERROR]Precio menor del permitido.");
		}
		else {
			this.precio = precio;
		}
	}
	
	//Metodos
	
	public void incrementaPrecio(double incremento) {
		this.precio += incremento;
	}

	
	
	//Getter
	
	public String getNombre() {
		return nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public Double getIva() {
		return iva;
	}
	public Double getGradosVinosRecomendado() {
		return this.vinoRecomendado.getGraduacion();
	}
	public Double getPrecioVentaPublico() {
		
		double precioVenta = (this.precio * iva)/100;
		double precioTotal = precioVenta + precio;
		
		return precioTotal;
	}

	public Vino getVinoRecomendado() {
		return vinoRecomendado;
	}

	//Setter
	
	public void setVinoRecomendado(Vino vinoRecomendado) {
		this.vinoRecomendado = vinoRecomendado;
	}
	public void setVinoRecomendado(String vino, double graduacion) {
		vinoRecomendado.setNombre(vino);
		vinoRecomendado.setGraduacion(graduacion);
		
		
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	
	//Equal y hashcode
	

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = false;
		Plato other = (Plato) obj;
		
		if (this == obj)
			sonIguales = true;
		
		if (obj == null)
			sonIguales = false;
		
		if (this.nombre.equals(other.getNombre()))
			sonIguales = true;
		
		return sonIguales;
	}

	@Override
	public String toString() {
		
		if (vinoRecomendado == null) {
			return "El nombre del plato es " + nombre + " y su precio sin IVA es " + precio + " y el precio de venta es " + getPrecioVentaPublico() + " y el vino recomendado es: Sin recomendaciones para el vino";			
		}
		else {
			return "El nombre del plato es " + nombre + " y su precio sin IVA es " + precio + " y el precio de venta es " + getPrecioVentaPublico() + " y el vino recomendado es:" + vinoRecomendado;			
		}
		
		
	}
	

	
	
	
	
	
	
	
}
