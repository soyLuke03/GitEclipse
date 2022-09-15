package JerarquíaEjemplo;

public class GestionVehiculosApp {

	public static void main(String[] args) {
		
		TerrestrePrueba[] garaje = new TerrestrePrueba[10];
		AereoPrueba[] hangar = new AereoPrueba[10];
		AcuaticoPrueba[] puerto = new AcuaticoPrueba[10];
		
		Coche ferrari = new Coche();
		Coche panda = new Coche();
		Moto kawasaki = new Moto();
		Moto dingo = new Moto();
		Dron marca = new Dron();
		Barco patrullera = new Barco();
		Avion iberia = new Avion();
		
		
		garaje[0]= ferrari;
		garaje[1]= panda;
		garaje[2]=kawasaki;
		garaje[3]=dingo;
		
		hangar[5]=iberia;
		
		puerto[1]=patrullera;
		
	}
}
