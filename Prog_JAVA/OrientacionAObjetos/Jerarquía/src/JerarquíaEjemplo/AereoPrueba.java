package JerarquíaEjemplo;

public class AereoPrueba extends VehiculoPrueba{

	private int helices = 2;
	
	public AereoPrueba() {
		
	}
	
	public AereoPrueba(int helices, String motor) {
		super(motor);
			//setMotor(motor);
		this.helices = helices;
	}
	
	public String toString() {
		
		
		return super.toString()+ " con "+ helices+ " numero de helices";
	}

	public int getHelices() {
		return helices;
	}

	public void setHelices(int helices) {
		this.helices = helices;
	}
}
