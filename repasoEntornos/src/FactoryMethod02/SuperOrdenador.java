package FactoryMethod02;

public class SuperOrdenador implements Ordenador {

	private String RAM;
	private String HDD;
	private String CPU;

	public SuperOrdenador(String rAM, String hDD, String cPU) {
		super();
		RAM = rAM;
		HDD = hDD;
		CPU = cPU;
	}

	@Override
	public String getRAM() {
		return this.RAM;
	}

	@Override
	public String getHDD() {
		return this.HDD;
	}

	@Override
	public String getCPU() {
		return this.CPU;
	}

	@Override
	public String toString() {
		return "RAM: " + RAM + " \nHDD: " + HDD + " \nCPU: " + CPU + " \n";
	}

}
