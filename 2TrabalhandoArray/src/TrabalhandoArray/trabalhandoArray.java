package TrabalhandoArray;

import javax.swing.JOptionPane;

public class trabalhandoArray {

	public static void main(String[] args) {
		/*
		// Declarando o array de paises 
		String[] paises = new String[4]; 
		
		// Abastecendo o array de paises
		// O loop começa na posição 0 e vai até a quantidade de paises
		for (int i = 0; i < paises.length; i++) {
			// Inserir Dados dentro do loop for através do JOptionPane
			// Irá começar ocupando o espaço 0 
			paises[i] = JOptionPane.showInputDialog("Informe um país: ");
		}
		
		// Listando o array de paises
		// Mostrar a lista de paises inseridos um de cada vez pelo loop for
		// Irá criar uma var lista tipo string que vai receber 
		// e mostrar os países
		for (String listaPaises : paises) {
			System.out.println(listaPaises);
		} 
		*/
		// Declarando o array de numeros
		int[] numeros = new int[10];
		
		// Abastecendo o array de numeros 
		for(int i = 0; i < 10; i++) {		
		// JOptionPane retorna uma String, deve ser convertido para int
			numeros[i] = Integer.parseInt(
					JOptionPane.showInputDialog("Informe um número: "));
		}
		
		// Listando o array de numeros antes do cálculo
		for(Integer listaNumeros : numeros) {
			System.out.println(listaNumeros);
		}
		
		int novoValor = 11;
		// Alterar o valor da po
		numeros[8] = novoValor + 4;
		// Listando o array de números depois do cálculo
		for (Integer listaNumeros : numeros) {
			System.out.println(listaNumeros);
		}
		
	}

}
    