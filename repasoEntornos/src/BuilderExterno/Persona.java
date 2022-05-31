package BuilderExterno;

public class Persona {

//	1º)
	
	private String nombre;
	private String dni;
	private int edad;

//	OBLIGATORIO PONER **PRIVATE** PARA QUE NO SE PUEDAN CREAR PERSONAS SIN EL BUILDER
	private Persona() {
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + "]";
	}
	
//	3º)
	
	Persona(PersonaBuilder builder) {
		this.nombre = builder.getNombre();
		if(builder.getDni() == null)
			throw new IllegalArgumentException("No se puede introducir una persona sin DNI"); // System.out.print("No se puede introducir una persona sin DNI");
		this.dni = builder.getDni();
		this.edad = builder.getEdad();
	}
	
}
