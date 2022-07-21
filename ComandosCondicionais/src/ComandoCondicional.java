
public class ComandoCondicional {

	public static void main(String[] args) {
		
		int num1 = 10, num2 = 20;
		// condição composta 
		
		if (num1 > num2) {
			System.out.println("Número 1 é maior que o número 2");
		} else if (num1 < num2) {
			System.out.println("Número 1 é menor que número 2");
		} else {
			System.out.println("Número 1 é igual ao número 2");
		}

		num1 = 20;
		
		if (num1 > num2) {
			System.out.println("Número 1 é maior que o número 2");
		} else if (num1 < num2) {
			System.out.println("Número 1 é menor que número 2");
		} else {
			System.out.println("Número 1 é igual ao número 2");
		}
	
		// SWITCH 
		char opcao = '1';
		switch(opcao) {
			case '1': {
				System.out.println("Chame programa de Inclusão");
				break;
			}
			
			case '2': {
				System.out.println("Chame programa de Alteração");
				break;
			}
			
			case '3':{
				System.out.println("Chame programa de Exclusão");
				break;
			}	
			
			case '4':{
				System.out.println("Chame programa de Consulta");
				break;
			}
		}
	
	}

}
