package BuilderInterno;

public class Persona {

//	1º) Creamos los atributos de Persona

	private String nombre;
	private String apellidos;
	private String direccion;
	private int edad;

//	2º) Creamos la clase estatica publica llamada Builder con los mismos atributos de Persona

	public static class Builder {

		private String nombre;
		private String apellidos;
		private String direccion;
		private int edad;

//	3º) Creamos los métodos para insertar el nombre, apellidos, edad y direccion

		public Builder nombre(String nombre, String apellidos) {
			this.nombre = nombre;
			this.apellidos = apellidos;
			return this;
		}

		public Builder direccion(String direccion) {
			this.direccion = direccion;
			return this;
		}

		public Builder edad(int edad) {
			this.edad = edad;
			return this;
		}

//	4º) Creamos el metodo publico build para construir los usuarios con el builder

		public Persona build() {
			return new Persona(this);
		}

	}

//	5º) Creamos el Persona Builder, en el caso de que queramos obligar a introducir ciertos atributos, lo haremos como se muestra en las lineas 52-53

	Persona(Builder builder) {
		if (builder.nombre == null && builder.apellidos == null) {
			throw new IllegalArgumentException("nombre y apellidos requeridos");
		} else {
			this.nombre = builder.nombre;
			this.apellidos = builder.apellidos;
			this.edad = builder.edad;
			this.direccion = builder.direccion;
		}
	}

	@Override
	public String toString() {
		return "nombre: " + nombre + " \napellidos: " + apellidos + " \ndireccion: " + direccion + " \nedad: " + edad
				+ " \n";
	}

}
