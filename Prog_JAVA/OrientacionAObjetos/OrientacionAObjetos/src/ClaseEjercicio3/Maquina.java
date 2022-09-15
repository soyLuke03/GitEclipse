package ClaseEjercicio3;

import java.util.Scanner;

public class Maquina {
	
	//Atributos
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	private Integer depoCafe;
	private Integer depoLeche;
	private Integer depoVaso;
	private Double monedero;
	private Double precioCafe = 1.0;
	private Double precioLeche = 0.8;
	private Double precioCafeLeche = 1.5;
	
	//Constructores
	
	public Maquina () {
		this.depoCafe = 50;
		this.depoLeche = 50;
		this.depoVaso = 80;
		this.setMonedero(8.0);
	}
	
	
	//Metodos
	
	public void llenarDeposito() {
		
		this.depoVaso = 80;
		this.depoCafe = 50;
		this.depoLeche = 50;
	
		System.out.println("Llenando depósitos...");
	}
	
	public void vaciarMonedero() {
		
		this.monedero = 0.0;
		
		System.out.println("Vaciando monedero...");
	}
	
	public void consultaEstado() {
		
		System.out.println("El estado actual de la máquina es: "
						 + "Depósito de cafe: " + getDepoCafe()+"\n"
						 + "Depósito de leche: " + getDepoLeche()+"\n"
						 + "Depósito de vasos: " + getDepoVaso()+"\n"
						 + "Monedero actual: " + getMonedero() + " euros.");
		
	}
	
	public void servirCafe(String opcion) throws CafeExcepcion {
		Scanner sc = new Scanner(System.in);
		double dinero;
		
		switch (opcion) {
		case "1":{ // cafe solo
			System.out.println("Opción elegida: Café solo. 1€\n");
			System.out.println("Introduce el dinero en efectivo: ");
			dinero = Double.valueOf(sc.nextLine());
			
			if(dinero < this.precioCafe || monedero - (dinero - this.precioCafe) < 0) {
				throw new CafeExcepcion("[ERROR]Dinero insuficiente o cambio insuficiente");
			}
			else if(depoCafe == 0) {
				throw new CafeExcepcion("[ERROR]Sin existencias");
			}else {
				System.out.println("Su cambio es: " + (dinero - this.precioCafe));
				this.depoCafe--;
				this.depoVaso--;
				this.monedero += this.precioCafe;	
			}
		}break;
		case "2":{ // leche
			System.out.println("Opción elegida: Leche. 0.8€\n");
			System.out.println("Introduce el dinero en efectivo: ");
			dinero = Double.valueOf(sc.nextLine());

			if(dinero < this.precioLeche || monedero - (dinero - this.precioLeche) < 0) {
				throw new CafeExcepcion("[ERROR]Dinero insuficiente o cambio insuficiente");
			}
			else if(depoLeche == 0 || depoVaso == 0) {
				throw new CafeExcepcion("[ERROR]Sin existencias");
			}else {
				System.out.println("Su cambio es: " + (dinero - this.precioLeche));
				this.depoLeche--;
				this.depoVaso--;
				this.monedero += this.precioLeche;	
			}
			
		}break;
		case "3":{ //cafe con leche
			System.out.println("Opción elegida: Café con leche. 1.50€\n");
			System.out.println("Introduce el dinero en efectivo: ");
			dinero = Double.valueOf(sc.nextLine());

			if(dinero < this.precioCafeLeche || monedero - (dinero - this.precioCafeLeche) < 0) {
				throw new CafeExcepcion("[ERROR]Dinero insuficiente o cambio insuficiente");
			}
			else if(depoCafe == 0 || depoLeche == 0 || depoVaso == 0) {
				throw new CafeExcepcion("[ERROR]Sin existencias");
			}else {
				System.out.println("Su cambio es: " + (dinero - this.precioCafeLeche));
				this.depoLeche--;
				this.depoVaso--;
				this.depoCafe--;
				this.monedero += this.precioCafeLeche;	
			}
			
		}
		
	}
	}

	
	//SETTER GETTER
	public Double getMonedero() {
		return monedero;
	}
	public Integer getDepoCafe() {
		return depoCafe;
	}
	public Integer getDepoLeche() {
		return depoLeche;
	}	
	public Integer getDepoVaso() {
		return depoVaso;
	}



	public void setDepoCafe(Integer depoCafe) {
		this.depoCafe = depoCafe;
	}
	public void setDepoLeche(Integer depoLeche) {
		this.depoLeche = depoLeche;
	}
	public void setDepoVaso(Integer depoVaso) {
		this.depoVaso = depoVaso;
	}	
	public void setMonedero(Double monedero) {
		this.monedero = monedero;
	}

	
}
