package FactoryMethod;

/**
 * Clase principal para crear los Transportes e implementar el tipo de los vehículos a crear
 * @author rasob
 *
 */
public class Aplicacion {
	
	/**
	 * Método main
	 * @param args ...
	 */
	public static void main(String[] args) {
		
		Transporte p1 = Fabrica.construir("Moto");
		Transporte p2 = Fabrica.construir("Coche");
		Transporte p3 = Fabrica.construir("hola");
		
		p1.arranar();
		p2.detener();

	}

}
