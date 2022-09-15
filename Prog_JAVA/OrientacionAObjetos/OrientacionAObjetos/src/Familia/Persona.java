package Familia;

public class Persona {

	private Integer edad;
	private String apellido1= "";
	private String apellido2= "";
	private String nombre;
	private String dni= "";
	private double altura;
	private double peso;
	
	private Persona progenitor1;
	private Persona progenitor2;
	
	
	//Constructor
	public Persona() {}
	
	public Persona( String nombre, String apellido1) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}
	
	public Persona( String nombre, String apellido1, String apellido2, String dni) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni= dni;
	}
		
		
	//Métodos
		
	//GETTER
	public Integer getEdad() {
		return edad;
	}
	public String getApellido1() {
		return apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDni() {
		return dni;
	}
	public double getAltura() {
		return altura;
	}
	public double getPeso() {
		return peso;
	}
	public Persona getProgenitor1() {
		return progenitor1;
	}
	public Persona getProgenitor2() {
		return progenitor2;
	}

	
	//SETTER
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setProgenitor1(Persona progenitor1) {
		this.progenitor1 = progenitor1;
	}
	public void setProgenitor2(Persona progenitor2) {
		this.progenitor2 = progenitor2;
	}

	
	//COSAS NUEVAS->
	@Override
	public boolean equals(Object personaDesconocida) {
		boolean sonLaMismaPersona = false;
		//this.dni.equals(((Persona) personaDesconocida).getDni()); [OTRA FORMA DE HACERLO]

		Persona convertida = (Persona) personaDesconocida;
		sonLaMismaPersona = this.dni.equals(convertida.getDni());

		return sonLaMismaPersona;
	}
	
	public boolean esHermanoDe(Object pOtra) {
		boolean esHermano = false;
		Persona uno = (Persona) pOtra;
		
		if (this.apellido1.equalsIgnoreCase(uno.getApellido1()) && 
				this.apellido2.equalsIgnoreCase(uno.getApellido2()) && 
				!this.dni.equalsIgnoreCase(uno.dni) && 
				(this.progenitor1.equals(uno.progenitor1) || this.progenitor2.equals(uno.progenitor2))) {
			esHermano = true;
		}
		
		return esHermano;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nombre + " " + this.apellido1;
	}
	
	
	
}
