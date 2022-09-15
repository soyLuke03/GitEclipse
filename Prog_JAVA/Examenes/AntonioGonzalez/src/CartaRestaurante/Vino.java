package CartaRestaurante;

public class Vino {

	//Atributos
	private String nombre;
	private Double graduacion;
	private String descripcion;
	
	//Constructor
	public Vino(String descripcion) {
		this.descripcion = descripcion;
	}
	public Vino(String descripcion, Double graduacion) {
		this.descripcion = descripcion;
		if (graduacion <= 0) {
			throw new PlatoException("[ERROR]Graduación inválida.");
		}
	}
	
	//Getter
	public String getNombre() {
		return nombre;
	}
	public Double getGraduacion() {
		return graduacion;
	}
	
	//Setter
	public void setGraduacion(Double graduacion) {
		this.graduacion = graduacion;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	//To string
	
	public boolean equals(Object obj) {
		boolean sonIguales = false;
		Vino other = (Vino) obj;
		
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
		return descripcion;
	}
	
}
