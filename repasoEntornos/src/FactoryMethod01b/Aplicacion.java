package FactoryMethod01b;

/**
 * Clase principal para crear los Transportes e implementar el tipo de los
 * vehículos a crear
 * 
 * @author rasob
 *
 */
public class Aplicacion {

	/**
	 * Método main
	 * 
	 * @param args ...
	 */
	public static void main(String[] args) {

		Transporte p1 = Fabrica.construir("Moto", "1111-HUE");
		Transporte p2 = Fabrica.construir("Coche", "2222-ZGZ");
		Transporte p3 = Fabrica.construir("hola", "1111-HUE");

		p1.arrancar();
		p2.detener();
		System.out.println(p1);

	}

}
