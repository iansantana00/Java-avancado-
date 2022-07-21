package Interfaces;

public class Bovino implements Animal {
	// implementa os métodos da interface
	
	@Override
	public void animalSom() {
		System.out.println("Muuuu");
	}
	
	@Override 
	public void animalComer() {
		System.out.println("Comendo capim");
	}

	@Override
	public void animalAbrigo() {
		System.out.println("Estrebaria");
		
	}

}
