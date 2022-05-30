package FactoryMethod01b;

/**
 * Creador de transportes con el método construir
 * 
 * @author rasob
 *
 */
public class Fabrica {

	public static Transporte construir(String tipo, String matricula) {

		switch (tipo) {
		case "Moto":
			return new Moto(matricula);
		case "Coche":
			return new Coche(matricula);
		default:
			System.out.println("No se encuentra dicho objeto en la fábrica");
			return null;
		}

	}

}
