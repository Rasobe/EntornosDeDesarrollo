package JUnit;

public class Calculadora {

	int num1;
	int num2;

	public Calculadora(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public int sumaRapida() {
		return num1 + num2;
	}
	
	public int sumaLenta() throws InterruptedException {
//			Tarde 1000 milisegundos (1 segundo)
			Thread.sleep(1000);
		return num1 + num2;
	}
	
	public int restar() {
		return num1 - num2;
	}
	
	public double dividir() {
		return (double)(num1 / num2);
	}
	
	public int producto() {
		return num1 * num2;
	}
	
	public double raizNum1() {
		return Math.sqrt(num1);
	}

	public double raizNum2() {
		return Math.sqrt(num2);
	}
	
}
