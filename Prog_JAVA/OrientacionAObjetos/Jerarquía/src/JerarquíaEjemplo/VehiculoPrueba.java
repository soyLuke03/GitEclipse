package JerarquíaEjemplo;

import java.util.Objects;

/**
 * Clase principal
 * @author Luke
 *
 */
public class VehiculoPrueba {
	
	private String motor;
	
	//CONSTRUCTOR
	public VehiculoPrueba() {
		
	}

	public VehiculoPrueba(String motor) {
		this.motor = motor;
	}

	//METODOS
	public void moverse() {
		System.out.println("Me desplazo");
	}
	public void pararse() {
		System.out.println("Me he parado");
	}


	//GETTER
	public String getMotor() {
		return motor;
	}
	
	//SETTER
	public void setMotor(String motor) {
		this.motor = motor;
	}
	

	//OVERRIDES Y DEMAS
	@Override
	public String toString() {
		return "VehiculoPrueba motor=" + motor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(motor);
	}

	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = false;
		
		if (this == obj)
			sonIguales = true;
		else {
			VehiculoPrueba other = (VehiculoPrueba) obj;
			sonIguales =this.getMotor().equals(other.getMotor());
		}
		return sonIguales;
	}

}