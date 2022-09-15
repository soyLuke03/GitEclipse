package main.java.model;

import java.time.LocalDate;

public class Persona {
	
	private String nombre;
	private String apellido;
	private String dni;
	private LocalDate fechaNacimiento;
	private Genero genero;


	
	public Persona() {
		super();
	}
	
	public Persona(String nombre, String apellido, String dni) {
		this();
		if(validarDatos(nombre, apellido, dni)) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.dni = dni;

		}else {
			throw new PersonaException();
		}
	}
	
	public Persona(String nombre, String apellido, String dni, LocalDate fechaNacimiento, String genero) {
		this();
		if(validarDatos(nombre, apellido, dni, fechaNacimiento, genero)) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.dni = dni;
			this.fechaNacimiento = fechaNacimiento;
			this.genero = Genero.valueOf(genero);
		}else {
			throw new PersonaException();
		}
	}
	
	
	// Existían muchas cláusulas de IF consecutivas por lo que las he colocado todas en una sola
	// Además, he añadido el Boolean ESVALIDO, ya que no es recomendable tener varios RETURN en un metodo 
	protected boolean validarDatos(String nombre, String apellido, String dni) {
		boolean esValido = true;
		esValido = validarRedux(nombre, apellido, dni);
		return esValido;
	}

	
	/**
	 * Metodo que incorpora la estructura del constructor pequeño ValidarDatos
	 * y puede ser usado para ampliar los criterios de validación
	 * @param nombre
	 * @param apellido
	 * @param dni
	 * @return Devuelve un boolean. True si los parámetros son validados y False en caso contrario
	 */
	private boolean validarRedux(String nombre, String apellido, String dni) {
		boolean esValido = true;
		if (!validarNombre(nombre) ||
				!validarApellido(apellido) ||
				!validarDNI(dni)) {
			esValido = false;
		}
		return esValido;
	}

	
	/**
	 * Metodo para validar el nombre
	 * @param nombre
	 * @return
	 */
	private boolean validarNombre(String nombre) {
		boolean esValido = true;
		if(nombre == null || nombre.isEmpty()) {
			throw new PersonaException("[ERROR] Nombre nulo o vacío");
		}
		return esValido;
	}
	/**
	 * Metodo para validar el apellido
	 * @param apellido
	 * @return
	 */
	private boolean validarApellido(String apellido) {
		boolean esValido = true;
		if(apellido == null || apellido.isEmpty()) {
			throw new PersonaException("[ERROR] Apellido nulo o vacío");
		}
		return esValido;
	}
	/**
	 * Metodo para validar el DNI
	 * @param dni
	 * @return
	 */
	private boolean validarDNI(String dni) {
		boolean esValido = true;
		if(dni == null || dni.isEmpty()) {
			throw new PersonaException("[ERROR] DNI nulo o vacío");
		}
		if(dni.length() < 9) {
			throw new PersonaException("[ERROR] DNI con longitud inferior a 9 caracteres");
		}
		if(!Character.isAlphabetic(dni.charAt(8))) {
			throw new PersonaException("[ERROR] La letra del DNI no está o es un caracter inválido");
		}
		if("TRWAGMYFPDXBNJZSQVHLCKE".charAt(Integer.valueOf(dni.substring(0, 8))%23)!= dni.toUpperCase().charAt(8)) {
			throw new PersonaException("[ERROR] La letra no corresponde a la secuencia numérica");
		}
		boolean exc = false;
		for(int i=0; i<dni.length()-1; i++) {
			if(!Character.isDigit(dni.charAt(i))) {
				exc = true;
			}
		}
		if(exc) {
			throw new PersonaException("[ERROR] DNI no válido. Valor no numérico encontrado");
		}
		return esValido;
	}
	/**
	 * Metodo para validar la fecha
	 * @param nombre
	 * @return
	 */
	private boolean validarFechaNacimiento(LocalDate fechaNacimiento) {
		boolean esValido = true;
		if(fechaNacimiento == null) { 
			throw new PersonaException("[ERROR] Fecha no válida. Está vacía");		
		}
		if(fechaNacimiento.isAfter(LocalDate.now())) {
			throw new PersonaException("[ERROR] Fecha no válida. Es posterior a la fecha actual");
		}
		
		return esValido;
	}
	/**
	 * Metodo para validar el genero
	 * @param genero
	 * @return
	 */
	private boolean validarGenero(String genero) {
		boolean esValido = true;
		genero = genero.toUpperCase();
		if(genero!=null &&  !Genero.HOMBRE.equals(Genero.valueOf(genero)) && !Genero.MUJER.equals(Genero.valueOf(genero))) {
			throw new PersonaException("[ERROR] Genero no permitido");
		}
		return esValido;
	}
	
	
	// Existían muchas cláusulas de IF consecutivas por lo que las he colocado todas en una sola
	// Además, he añadido el Boolean ESVALIDO, ya que no es recomendable tener varios RETURN en un metodo 
	protected boolean validarDatos(String nombre, String apellido, String dni, LocalDate fechaNacimiento, String genero) {
		boolean esValido = true;
		
		
		if (!validarRedux(nombre, apellido, dni) ||
				!validarFechaNacimiento(fechaNacimiento) ||
				!validarGenero(genero)) {
			esValido = false;
		}	
		return esValido;
	}
	
	
	
	// Existían 2 cláusulas de IF consecutivas por lo que las he colocado todas en una sola
	// Además, he añadido el Boolean DISPONIBLE, ya que no es recomendable tener varios RETURN en un metodo 
	public boolean bonoJovenDisponible() {
		boolean disponible = false;
		if((LocalDate.now().getYear()-this.fechaNacimiento.getYear()> 18) && (LocalDate.now().getYear()-this.fechaNacimiento.getYear()< 30)) {
			disponible = true;
		}
		return disponible;
	}
	
	
	/**
	 * Metodo que devuelve la edad de la persona, o -1 si no es posible
	 * @return
	 */
	public int getEdad() {
		return LocalDate.now().compareTo(fechaNacimiento)>=0?
						LocalDate.now().minusYears(this.fechaNacimiento.getYear()).getYear()	:	-1;
	}
	
	//Existían 2 RETURN los cuáles han sido reemplazados por la variable RESULT
	/**
	 * Metodo para obtener la edad de la persona en el año introducido por parametro
	 * @param year
	 * @return
	 */
	public int obtenerEdadPara(int year) {
		int result = -1;
		
		if(year>=this.fechaNacimiento.getYear()) {
			result = year-this.fechaNacimiento.getYear();
		}
		return result;
	}


	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getDni() {
		return dni;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public Genero getGenero() {
		return genero;
	}
	
	
	public void setNombre(String nombre) {
		if(validarNombre(nombre)) {
			this.nombre = nombre;
		}
	}
	public void setApellido(String apellido) {
		if(validarApellido(apellido)) {
			this.apellido = apellido;
		}
	}
	public void setDni(String dni) {
		if(validarDNI(dni)) {
			this.dni = dni;
		}
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		if(validarFechaNacimiento(fechaNacimiento)) {
			this.fechaNacimiento = fechaNacimiento;
		}
	}
	public void setGenero(String genero) {
		if(validarGenero(genero)) {
			this.genero = Genero.valueOf(genero);
		}
	}
	
	
	

}
