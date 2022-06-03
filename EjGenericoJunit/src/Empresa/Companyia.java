package Empresa;

import java.util.ArrayList;

public class Companyia {

	private String nombre;
	
	// este número sube cuando se añade un empleado a la lista
	// pero no baja cuando se quita un empleado.
	private int numEmpleadosHistorico;
	
	private ArrayList<String> empleados;

	public Companyia(String nombre) {
		this.nombre = nombre;
		numEmpleadosHistorico = 0;
		empleados = new ArrayList<String>();
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
}
