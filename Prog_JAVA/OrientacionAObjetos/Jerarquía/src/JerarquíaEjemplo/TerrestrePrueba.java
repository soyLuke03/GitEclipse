package JerarquíaEjemplo;

public class TerrestrePrueba extends VehiculoPrueba{

	private int numeroRuedas = 0;
	
	public TerrestrePrueba() {
		
	}
	
	public TerrestrePrueba(int ruedas, String motor) {
		super(motor);
			//setMotor(motor);
		this.numeroRuedas = ruedas;
	}
	
	public String toString() {
		
		
		return super.toString()+ " con "+ numeroRuedas+ " numero de ruedas";
	}

	public int getNumeroRuedas() {
		return numeroRuedas;
	}

	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}


}
