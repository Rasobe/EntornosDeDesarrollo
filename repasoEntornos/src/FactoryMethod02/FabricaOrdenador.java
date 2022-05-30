package FactoryMethod02;

public class FabricaOrdenador {

	public static Ordenador crearOrdenador(TipoOrdenador tipo, String ram, String hdd, String cpu) {

		Ordenador ordenador = null;
		switch (tipo) {
		case PC:
			ordenador = new PC(ram, hdd, cpu);
			break;

		case SERVIDOR:
			ordenador = new Servidor(ram, hdd, cpu);
			break;

		case SUPERORDENADOR:
			ordenador = new SuperOrdenador(ram, hdd, cpu);
		}

		return ordenador;
	}

}
