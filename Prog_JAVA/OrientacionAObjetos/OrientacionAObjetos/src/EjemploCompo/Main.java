package EjemploCompo;

public class Main {

	public static void main(String[] args) {
		
		
		Rueda r1 = new Rueda(70, 10);
		Rueda r2 = new Rueda(70, 10);
		Rueda r3 = new Rueda(70, 10);
		Rueda r4 = new Rueda(70, 10);

		Rueda[] ruedas = new Rueda[4];
		ruedas[0] = r1;
		ruedas[1] = r2;
		ruedas[2] = r3;
		ruedas[3] = r4;

		
		Motor motorDiesel = new Motor();
		Chasis chasis = new Chasis();
		
		Coche coche = new Coche(chasis, motorDiesel, ruedas);
		
		coche.setMarca("Mazda");
		coche.setModelo("Pepe");
		coche.setPrecio(200000);
		
		Coche[] garaje = new Coche[15];
		
		garaje[6] = coche;
		
		System.out.println(garaje[6]);
	}
}
