package JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestCalculadora {

	static Calculadora c;
	
	@BeforeAll
	public static void inicio() {
		System.out.println("Método iniciado");
		c = new Calculadora(10, 3);
	}
	
	@AfterAll
	public static void alFinal() {
		System.out.println("Método finalizado");
	}
	
	@Test
	void testCalculadora() {
		Calculadora c2 = new Calculadora(10, 3);
		assertEquals(c.producto(), c.producto());
	}

	@Test
	void testSumaRapida() {
		Calculadora c = new Calculadora(1, 4);
		assertEquals(5, c.sumaRapida());
	}

	@Test
	void testSumaLenta() throws InterruptedException {
		Calculadora c = new Calculadora(5, 1);
		assertEquals(6, c.sumaLenta());
	}

	@Test
	void testRestar() {
		Calculadora c = new Calculadora(6, 3);
		assertEquals(3, c.restar());
	}

	@Test
	void testDividir() {
		Calculadora c = new Calculadora(9, 5);
		assertEquals(1, c.dividir());
	}

	@Test
	void testProducto() {
		Calculadora c = new Calculadora(4, 6);
		assertEquals(24, c.producto());
	}

	@Test
	void testRaizNum1() {
		Calculadora c = new Calculadora(9, 81);
		assertEquals(3, c.raizNum1());
	}

	@Test
	void testRaizNum2() {
		Calculadora c = new Calculadora(9, 81);
		assertEquals(9, c.raizNum2());
	}

}
