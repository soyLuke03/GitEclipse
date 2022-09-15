package Boletin2.Ejerc2;

import java.util.Scanner;

public class Producto {

	private String codigo;
	private String descripcion;
	private Integer iva;
	
	private Integer porcentajeIVA;
	
	
	
	//CONTRUCTOR
	
	public Producto(String codigo, String descripcion,Integer iva ,Integer porcentajeIVA) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.iva = iva;
		this.porcentajeIVA = porcentajeIVA;
	}
	
	
	//METODOS
	
	
	public void modificacion() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Elija que quiere cambiar: [1-codigo, 2-...]");
		
		String opc;
		opc = sc.nextLine();
		
		if (opc.equals("1")) {
			System.out.println(this.codigo);
		}
		else if (opc.equals("2")) {
			System.out.println(this.descripcion);
		}
		else if (opc.equals("3")) {
			System.out.println(this.iva);
		}
		else if (opc.equals("4")) {
			System.out.println(this.porcentajeIVA);
		}
	}
	
	public void consulta() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Elija que quiere cambiar: [1-codigo, 2-...]");
		
		String opc;
		opc = sc.nextLine();
		
		if (opc.equals("1")) {
			this.codigo = sc.nextLine();
		}
		else if (opc.equals("2")) {
			this.descripcion = sc.nextLine();
		}
		else if (opc.equals("3")) {
			this.iva = Integer.valueOf(sc.nextLine());
		}
		else if (opc.equals("4")) {
			this.porcentajeIVA = Integer.valueOf(sc.nextLine());
		}
	}
	
	
	
	
	
}
