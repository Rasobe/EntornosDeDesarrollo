package FactoryMethod;

/**
 * Vehículo creado en la Fabrica <b>(coche)</b>
 * @author rasob
 *
 */
public class Coche implements Transporte {
	
	/**
	 * Arranca el coche
	 */
	@Override
	public void arranar() {
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

}
