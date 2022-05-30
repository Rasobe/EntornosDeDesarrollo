package Builder;

public class PersonaBuilder {

	private String nombre;
	private String dni;
	private int edad;

	public PersonaBuilder() {
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getDni() {
		return dni;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public PersonaBuilder nombre(String nombre) {
		this.nombre = nombre;
		return this;
	}

	public PersonaBuilder dni(String dni) {
		this.dni = dni;
		return this;
	}

	public PersonaBuilder edad(int edad) {
		this.edad = edad;
		return this;
	}

	public Persona build() {
		return new Persona(this);
	}
	
}
