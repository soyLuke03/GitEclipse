package ClaseEjercicio2;

public class Cuenta {

	private Integer saldo = 0;
	private Integer contadorIngresos = 0;
	private Integer contadorReintegros = 0;
	
	//METODO
	
	public void reintegro(int reintegro) {
		if (reintegro > 0 && reintegro <= this.saldo) {	
			this.contadorReintegros  ++;
			this.saldo -= reintegro;
		}
		else if (reintegro > this.saldo) {
			System.out.println("No hay dinero.");
		}
	}
	
	public void ingreso(int ingreso) {	
		if (ingreso > 0) {
			this.contadorIngresos ++;
			this.saldo += ingreso;
		}
		
	}
	
	
	
	public void consulta() {
		System.out.println("Saldo: " + this.saldo + " euros. \n"
						+"Ingresos: " + this.contadorIngresos 
						+"Reintegros: " + this.contadorReintegros);
	}
	
	
	//GETTER Y SETTER
	
	public Integer getSaldo() {
		return saldo;
	}
	public Integer getContadorReintegros() {
		return contadorReintegros;
	}
	public Integer getContadorIngresos() {
		return contadorIngresos;
	}
	
	
	public void setSaldo(Integer saldoInicial) {
		this.saldo = saldoInicial;
	}
}
