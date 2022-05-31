package BuilderInterno;

public class Programa {

	public static void main(String[] args) {
		
//		OBLIGATORIO PONER EL BUILD AL FINAL DEL CREADOR DEL OBJETO
		
		Persona p = new Persona.Builder().direccion("Huesca").nombre("Raul", "Solano").edad(19).build();
		
		System.out.println(p);
		
	}
	
}
