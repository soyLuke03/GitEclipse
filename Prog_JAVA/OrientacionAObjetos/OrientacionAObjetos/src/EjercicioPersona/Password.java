package EjercicioPersona;

public class Password {
	
	private Integer longitud = 8;
	private String contrasena ="";
	private String caracteres = "qwertyuiopasdfghjklzxcvbnm1234567890QWERTYUIOPASDFGHJKLZXCVBNM";
	
	public Password() {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<this.longitud;i++) {
			sb.append(generarCaracterAleatorio());
		}
		
		this.contrasena = sb.toString();
	}
	
	public Password(int nuevaLongitud) {
		this.longitud=nuevaLongitud;
		this.contrasena=generarPassword();
		
		if(!esFuerte()) {
			throw new PasswordException("Exception");
		}
		
	}
	
	
	public boolean esFuerte() {
		
		boolean strong = false;
		
		int contadorNumeros 	=0;
		int contadorMayusculas 	=0;
		int contadorMinusculas	=0;
		
		for (int i=0; i<this.contrasena.length();i++){
			if(Character.isDigit(this.contrasena.charAt(i))) {
				contadorNumeros++;
			}else if(Character.isUpperCase(this.contrasena.charAt(i))) {
				contadorMayusculas++;
			}else if(Character.isLowerCase(this.contrasena.charAt(i))) {
				contadorMinusculas++;
			}
		}
		
		return contadorNumeros>=5 && contadorMayusculas >=2 && contadorMinusculas>=1;
		
	}
	
	
	private int numeroAleatorio() {
		return (int)(Math.random()*100);
	}
	
	public Character generarCaracterAleatorio() {
		int posicionAleatoria = numeroAleatorio();
		int longitud = caracteres.length();
		char c = caracteres.charAt(posicionAleatoria%longitud);
		
		return c;
		}
	
	public String generarPassword() {
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<this.longitud;i++) {
			sb.append(generarCaracterAleatorio());
		}
		
		return sb.toString();
	}
	
	
	
	
	public String getPassword() {
		return this.contrasena;
	}
	public Integer getLongitud() {
		return this.longitud;
	}
	public void setLongitud(Integer longitud) {
		this.longitud = longitud;
	}

}
