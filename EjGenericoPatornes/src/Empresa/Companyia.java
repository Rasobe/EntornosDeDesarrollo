package Empresa;

import java.util.ArrayList;

public class Companyia {

	private static Companyia instancia;
	private String nombre;
	private int numEmpleadosHistorico;
	private ArrayList<String> empleados;

	private Companyia(String nombre) {
		this.nombre = nombre;
		numEmpleadosHistorico = 0;
		empleados = new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumEmpleadosHistorico() {
		return numEmpleadosHistorico;
	}

	public void setNumEmpleadosHistorico(int numEmpleadosHistorico) {
		this.numEmpleadosHistorico = numEmpleadosHistorico;
	}

	@Override
	public String toString() {
		return "Companyia [nombre=" + nombre + ", numEmpleadosHistorico=" + numEmpleadosHistorico + ", empleados="
				+ empleados + "]";
	}
	
	public void anyadirEmpleado(String nombre) {
		empleados.add(nombre);
		numEmpleadosHistorico++;
	}
	
	public void eliminarEmpleado(String nombre) {
		empleados.remove(nombre);
	}
	
	public static Companyia getInstance() {
		if (instancia == null) {
			instancia = new Companyia("Teo's Factory");
		}
		return instancia;
	}

	public static Companyia getInstance(String nombre) {
		if (instancia == null) {
			instancia = new Companyia(nombre);
		}
		return instancia;
	}
	
}
