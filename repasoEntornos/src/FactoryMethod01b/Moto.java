package FactoryMethod01b;

/**
 * Se crea el vehículo Moto en la Fabrica
 * 
 * @author rasob
 *
 */
public class Moto implements Transporte {
	
	/**
	 * Atributo privado que identifica a cada vehículo por su matrícula
	 */
	private String matricula;
	
	/**
	 * Constructor de un vehículo con su matrícula
	 * @param matricula matricula del transporte
	 */
	public Moto(String matricula) {
		super();
		this.matricula = matricula;
	}

	/**
	 * Arranca la moto
	 */
	@Override
	public void arrancar() {
		System.out.println("Arrancando la moto...");
	}

	/**
	 * Detiene la moto
	 */
	@Override
	public void detener() {
		System.out.println("Deteniendo la moto...");
	}

	/**
	 * Muestra el tipo de vehículo (moto)
	 */
	@Override
	public String tipo() {
		return "Moto";
	}

	/**
	 * Muestra la matricula del vehículo 
	 */
	@Override
	public String matricula() {
		return matricula;
	}

	/**
	 * Devuelve el vehículo completo
	 * @return devuelve el objeto
	 */
	@Override
	public String toString() {
		return "matricula: " + matricula + "\ntipo: " + tipo() + "\n";
	}
	
	

}
