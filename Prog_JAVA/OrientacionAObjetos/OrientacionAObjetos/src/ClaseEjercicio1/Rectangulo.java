package ClaseEjercicio1;




public class Rectangulo {
	private Integer longitud = 1;
	private Integer ancho = 1;
	
	
			//CONSTRUCTORES
	
	public Rectangulo (int longitud, int ancho) {
		setLongitud(longitud);
		setAncho(ancho);
	}
	
	
			//METODOS
	public int calcularPerimetro() {
		int perimetro = (this.longitud * 2 + this.ancho * 2);
	
		return perimetro;
	}
	
	public int calcularArea() {
		
		if (this.ancho<=1 || this.longitud <=1) {
			throw new RectException ("No se puede illo");
		}else {
			int area = (this.longitud * this.ancho);
			return area;
		}
		
		
	}
	
	
			//GETTER Y SETTERS
	
	public Integer setAncho (int ancho) {
		if (ancho < 20 && ancho > 0) {
			this.ancho = ancho;
		}else {
//			throw new RectException("El valor introducido no es válido");
		}
		return this.ancho;
	}
	public Integer setLongitud (int longitud) {
		if (longitud < 20 && longitud > 0) {
			this.longitud = longitud;
		}else {	
//			throw new RectException("El valor introducido no es válido");
		}
		
		return this.longitud;
	}
	
	
	public Integer getLongitud () {
		return this.longitud;
	}
	public Integer getAncho() {
		return this.ancho;
	}
}
