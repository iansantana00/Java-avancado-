
public class Polimorfismos {
	
	public static void main(String[] args) {
		
		// O mesmo método retornou valores diferentes
		
		Mamifero mamifero1 = new Elefante();
		System.out.println("Cota diária de leite de um Elefante: "
				+ mamifero1.cotaDiariaLeite()); 
		
		Mamifero mamifero2 = new Rato();
		System.out.println("Cota diária de leite de um Rato: "
				+ mamifero2.cotaDiariaLeite()); 
		
	}

}
