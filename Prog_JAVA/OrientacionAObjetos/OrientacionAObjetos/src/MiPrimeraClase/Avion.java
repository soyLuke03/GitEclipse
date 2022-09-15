package MiPrimeraClase;

public class Avion {

	private String idAvion;
	private Integer capacidad = 250; //Es una cantidad puesta por mi
	private Integer numVuelos = 0;
	private Double kmVolados = 0.0;
	private String compannia;

	
	//Constructores:
	
	
	public Avion(String idAvion, Integer capacidad) {
		this.idAvion = idAvion;
		this.capacidad = capacidad;
	}
	
	public Avion(String idAvion, String compani, Integer capacidad) {
		this.idAvion = idAvion;
		this.compannia = compani;
		this.capacidad = capacidad;
	}
	
	
	//Métodos:
	
	public Boolean asignarVuelo(int viajeros, double kilometros){
		boolean disponible = false;
		
		if(viajeros <= this.capacidad) {
			this.kmVolados+= kilometros;
			this.numVuelos++;
			
			disponible = true;
		}
		
		return disponible;
	}
	
	public String setCompannia(String comp) {
		this.compannia = comp;
		return this.compannia;
	}
	
	//Getter y Setter
	
	public Integer getNumVuelos() {
		return this.numVuelos;
	}
	public Double getTotalKm() {
		return 0.0;
	}
	public Double getMediaKM() {	
		double mediaKm;
		if (this.numVuelos==0) {
			mediaKm = 0;
		}else {
			mediaKm = this.kmVolados / this.numVuelos;
		}

		return mediaKm;
	}
	public Double getKmVolados() {
		
		return this.kmVolados;
	}
	public String getIdAvion() {
		return this.idAvion;
	}
	public Integer getCapacidad() {
		return this.capacidad;
	}

	public String getCompannia() {
		return this.compannia;
	}
	
	
	//Setters privados
	private String setIdAvion() {
		return idAvion;
	}
	private Integer setCapacidad() {
		return capacidad;
	}
	private Double setKmVolados() {
		return kmVolados;
	}
	private Integer setNumVuelos() {
		return numVuelos;
	}
	
	
}
