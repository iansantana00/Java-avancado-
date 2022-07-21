
public class LacoRepeticao {
	
	public static void main (String[] args)	{	
		
		// Comando WHILE (pre-testado)
		
		int qtdVezes = 1;
		
		while (qtdVezes <= 10) {
			System.out.println("Estou fazendo a " + qtdVezes + "ª vez");
			qtdVezes++; // qtdVezes = qtdVezes + 1
		}
		
		System.out.println("Saí do laço e executei " + (qtdVezes - 1) + " vezes");
	
		System.out.println("------------------------------------------");
		
		// DO WHILE (pos-testado)
	
		qtdVezes = 1;
		
		do {
			System.out.println("Estou fazendo a " + qtdVezes + " ª vez");
			qtdVezes++; // qtdVezes = qtdVezes + 1
		} while (qtdVezes <= 10);
			System.out.println("Saí do laço e executei " + (qtdVezes-1) + " vezes");
	
		
		System.out.println("--------------------------------------------");

		// FOR
		System.out.println("Comando FOR");
		qtdVezes = 0;
		for (int qtdVezes1 = 1; qtdVezes1 <= 10; qtdVezes1++) {
			System.out.println("Estou fazendo a " + qtdVezes + " ª vez");
			qtdVezes = qtdVezes1;
			if (qtdVezes == 5) {
				System.out.println("Parei na " + qtdVezes1 + "ª vez");
				break;
			}
		}		
	}
		
}
