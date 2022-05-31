package Singleton;

public class Main {
	
	public static void main(String[] args) {
		
		Persona p1 = Persona.getInstance("David Doble P", "18097052P", 19);
		System.out.println(p1.getInstance());
		Persona p2 = Persona.getInstance("David Doble H", "18855052Q", 19);
		
		
		System.out.println(p1);
		System.out.println(p2);
		
	}

}
