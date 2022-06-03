package Empresa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestCompanyia {

	@Test
	void testCompanyiaSigleton() {
		Companyia c = Companyia.getInstance();
		c.anyadirEmpleado("Raul");
		Companyia c2 = Companyia.getInstance();
		c2.anyadirEmpleado("Pepito");
		c2.anyadirEmpleado("Sergio");
		assertEquals(c.getNombre(), c.getNombre());
	}

	@Test
	void testCompanyiaSigleton2() {
		Companyia c = Companyia.getInstance("TeoLairlaSG");
		c.anyadirEmpleado("Raul");
		Companyia c2 = Companyia.getInstance("TeoNOLairlaSG");
		c2.anyadirEmpleado("Pepito");
		c2.anyadirEmpleado("Sergio");
		assertEquals(c.getNumEmpleadosHistorico(), c.getNumEmpleadosHistorico());
	}

}
