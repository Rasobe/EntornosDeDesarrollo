package FactoryMethod01b;

/**
 * Vehículo creado en la Fabrica <b>(coche)</b>
 * 
 * @author rasob
 *
 */
public class Coche implements Transporte {
	
	/**
	 * Atributo privado que identifica a cada vehículo por su matrícula
	 */
	private String matricula;
	
	/**
	 * Constructor de un vehículo con su matrícula
	 */
	public Coche(String matricula) {
		super();
		this.matricula = matricula;
	}
	
	/**
	 * Arranca el coche
	 */
	@Override
	public void arrancar() {
		System.out.println("Arracando el coche...");
	}

	/**
	 * Detiene el coche
	 */
	@Override
	public void detener() {
		System.out.println("Deteniendo el coche...");
	}

	/**
	 * Muestra que es el tipo es un coche
	 */
	@Override
	public String tipo() {
		return "Coche";
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
