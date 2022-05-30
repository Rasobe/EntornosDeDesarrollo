package FactoryMethod01a;

/**
 * Creador de transportes con el método construir
 * 
 * @author rasob
 *
 */
public class Fabrica {

	/**
	 * Clase para crear vehículos en esta fábrica
	 * @param tipo Le insertas el tipo de vehículo a crear en la fábrica
	 * @return Devuelve el objeto que se ha creado en la fábrica (coche o moto)
	 */
	public static Transporte construir(String tipo) {

		switch (tipo) {
		case "Moto":
			return new Moto();
		case "Coche":
			return new Coche();
		default:
			System.out.println("No se encuentra dicho objeto en la fábrica");
			return null;
		}

	}

}
