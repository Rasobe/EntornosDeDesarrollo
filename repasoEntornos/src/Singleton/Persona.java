package Singleton;

public final class Persona {

	private static Persona instancia;

	String nombre;
	String dni;
	int edad;

	private Persona(String nombre, String dni, int edad) { // el constructor de la persona debera ser privado

		super();
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;

	}

	public static Persona getInstance(String nombre, String dni, int edad) {

		if (instancia == null) {
			instancia = new Persona(nombre, dni, edad);
		}

		return instancia;
	}

	public static Persona getInstance() {
		if (instancia == null) {
			instancia = new Persona("nombre", "dni", 0);
		}
		return instancia;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + "]";
	}

}
