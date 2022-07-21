
public class ComandoForEach {

	public static void main(String[] args) {
		// Vamos a um exemplos didático
		// Eu vou criar um vetor, carregá-lo já inicializado e em seguida 
		// Vou ler elementos do vetor usando um For Each
		
		int[] vetorNumeros = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// Varrendo o vetor sem uso do For Each
		
		System.out.println("Varrendo o vetor sem For Each");
		for(int i = 0; i < vetorNumeros.length; i++) {
			System.out.println("Número: " + vetorNumeros[i]);
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		// Varrendo o vetor usando o For Each
		// Criar objeto inteiro que irá incorporar o vetorNumeros
		System.out.println("Varrendo o vetor com For Each");
		for (int listaNumeros: vetorNumeros) {
			System.out.println("Número: " + listaNumeros);
		}
	}
}
