package FactoryMethod02;

public class PC implements Ordenador {

	private String RAM;
	private String HDD;
	private String CPU;

	public PC(String ram, String hdd, String cpu) {
		super();
		RAM = ram;
		HDD = hdd;
		CPU = cpu;
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
