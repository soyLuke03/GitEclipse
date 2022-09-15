package JerarquíaEjemplo;

public class AcuaticoPrueba extends VehiculoPrueba{

	private int longitud = 0;
	
	public AcuaticoPrueba() {
		
	}
	
	public AcuaticoPrueba(int longitud, String motor) {
		super(motor);
			//setMotor(motor);
		this.longitud = longitud;
	}
	
	public String toString() {
		
		
		return super.toString()+ " con "+ longitud+ "m de longitud";
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
}

