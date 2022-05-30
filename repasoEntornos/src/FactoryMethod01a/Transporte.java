package FactoryMethod01a;


/**
 * Interfaz para implementar en los transportes de la fábrica
 * @author rasob
 * @version 1.0.0
 *
 */
public interface Transporte {
	
	/**
	 * Se arranca el vehículo
	 */
	public void arrancar();
	
	/**
	 * Se detiene el vehículo
	 */
	public void detener();
	
	/**
	 * Metodo para mostrar el tipo
	 * @return el tipo de vehículo
	 */
	public String tipo();

}
