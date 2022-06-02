package banco;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCuenta {

	static Cuenta c;

	@BeforeEach
	void antesDeTodos() {
		c = new Cuenta("Juanito123", 199.99);
	}

	@Test
	void testCuenta() {
		Cuenta c2 = new Cuenta("Juanito123", 199.99);
		assertEquals(c.getNumero(), c2.getNumero());
	}

	@Test
	void testGetNumero() {
		assertEquals("Juanito123", c.getNumero());
	}

	@Test
	void testSetNumero() {
		assertEquals("Juanito123", c.getNumero());
	}

	@Test
	void testGetSaldo() {
		assertEquals(199.99, c.getSaldo());
	}

	@Test
	void testSetSaldo() {
		assertEquals(199.99, c.getSaldo());
	}

	@Test
	void testToString() {
		Cuenta c2 = new Cuenta("Juanito123", 199.99);
		assertEquals(c.toString(), c2.toString());
	}

	@Test
	void testIngresarDinero() {
		try {
			c.ingresarDinero(-10);
			fail("Error: Si hemos llegado hasta aquí es que no ha saltado la excepción");
		} catch (Exception e) {
			assertEquals(e.getMessage(), "En un ingreso, el importe tiene que ser positivo.");
		}
	}

	@Test
	void testExtraerDinero() {
		try {
			c.extraerDinero(-100);
			fail("Error: Si hemos llegado hasta aquí es que no ha saltado la excepción");
		} catch (Exception e) {
			assertEquals(e.getMessage(), "En una extraccion el importe a extraer debe ser positivo.");
		}
	}

	@Test
	void testExtraerDinero2() {
		try {
			c.extraerDinero(200);
			fail("Error: Si hemos llegado hasta aquí es que no ha saltado la excepción");
		} catch (Exception e) {
			assertEquals(e.getMessage(), "En una extraccion el importe no puede ser mayor al saldo.");
		}
	}

}
