package FactoryMethod02;

public class Aplicacion {

	public static void main(String[] args) {

		Ordenador pc = FabricaOrdenador.crearOrdenador(TipoOrdenador.PC, "1GB", "256GB", "Intel Core 2 Duo");
		Ordenador server = FabricaOrdenador.crearOrdenador(TipoOrdenador.SERVIDOR, "32GB", "2TB", "AMD Ryzen 7 2700X");
		Ordenador superpc = FabricaOrdenador.crearOrdenador(TipoOrdenador.SUPERORDENADOR, "1048MB", "500TB", "Doble Pentium Omega Warrior HD FULL 29K");
		
		System.out.println(pc.getCPU());
		System.out.println(server.getCPU());
		System.out.println(superpc.getCPU());
		
	}

}
