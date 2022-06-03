import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Empresa.Companyia;

class CompanyiaTest {

	static Companyia c;

	@Test
	void testAnyadirEmpleado() {
		c = new Companyia("TeoLairla-SG");
		
		c.anyadirEmpleado("Teo");
		
		assertEquals(1, c.getNumEmpleadosHistorico());
	}

	@Test
	void testEliminarEmpleado() {
		c = new Companyia("TeoLairla-SG");
		
		c.anyadirEmpleado("Jose Miguel");
		c.anyadirEmpleado("Raul");
		
		c.eliminarEmpleado("Jose Miguel");
		assertEquals(2, c.getNumEmpleadosHistorico());
	}
	
}
