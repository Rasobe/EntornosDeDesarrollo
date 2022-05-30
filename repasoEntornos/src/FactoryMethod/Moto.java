package FactoryMethod;

/**
 * Se crea el vehículo Moto en la Fabrica
 * @author rasob
 *
 */
public class Moto implements Transporte {

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

}
