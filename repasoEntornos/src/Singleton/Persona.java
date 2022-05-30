package Singleton;

public final class Persona {

	public static Persona instancia;

	String nombre;
	String dni;
	int edad;

	public Persona(String nombre, String dni, int edad) {
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

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + "]";
	}

	
	
}
