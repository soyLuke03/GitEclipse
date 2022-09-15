package EjercicioPersona;

public class Main {

	public static void main(String[] args) {

		Persona vicente = new Persona();
		Persona alejandra = new Persona();
		
		
		Password p2=null;
		
		Password p1 = new Password();
		
		while(p2==null) {
			try {
				
			p2 = new Password(20);
			
			}
			catch(PasswordException pe) {
				//System.out.println(pe.getMessage());
			}
		}
		
		System.out.println(p2.getPassword());
	}

}
