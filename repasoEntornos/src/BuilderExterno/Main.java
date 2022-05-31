package BuilderExterno;

public class Main {
	
	public static void main(String[] args) {
		
		Persona p = new PersonaBuilder().edad(12).nombre("David").dni("Doble P").nombre("Pegleg").build();
		System.out.println(p);
		
	}

}
