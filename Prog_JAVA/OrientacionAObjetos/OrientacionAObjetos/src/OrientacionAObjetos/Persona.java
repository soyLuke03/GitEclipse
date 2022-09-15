package OrientacionAObjetos;

public class Persona {

	//atributos = caracteristicas
	
	String nombre;		//Por defecto las cadenas son null y los enteros son 0
	String apellidos;
	private int edad;
	private double altura;
	
	
	//Con private modificamos la accesibilidad a la modificacion de las variables.
	
	
	//CONSTRUCTOR
	
	public Persona() {
		apellidos = "apellidos vacío";
		nombre = "nombre vacío";
		edad = 18;
		altura = 1.70;
	}

	

	public Persona(String name, String apellidos, int edad, double altura) {
		this.nombre = name;
		this.apellidos = apellidos;	//Con THIS, usamos la variable de la clase.
	}
	
	//Método
	public void Persona(String nombre, String apellidos, int edad, double altura) {}
	
	
	public void saluda() {
		System.out.println("Hola "+ nombre);
	}
	
	//GETTERS Y SETTERS

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int getEdad() {
		return edad;
	}
	
	public double getAltura() {
			return altura;
	}
	
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public void setEdad(int edad) {
		if (edad > 0 && edad < 100) {
					this.edad = edad;
		}
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
}
