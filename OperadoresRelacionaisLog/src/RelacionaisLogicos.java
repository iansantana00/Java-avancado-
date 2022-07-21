
public class RelacionaisLogicos {
	
	// Operadores Lógicos
	// < > == != <= >= 
	public static void main (String[] args) {
		int num1, num2;
		
		// Testando uma igualdade 
		num1 = 10;
		num2 = 10;
		
		if (num1 == num2) {
			System.out.println("num1 e num2 são iguais.");
		}
		
		// Testando uma desigualdade 
		num1 = 20;
		num2 = 30;
		
		if (num1 == num2) {
			System.out.println("num1 e num2 são iguais.");
		} else {
			System.out.println("num1 e num2 são diferentes.");
		}
		
		// Operadores Lógicos 
		// && = and
		// || = or 
		int num3 = 10, num4 = 7;
		num1 = 20;
		num2 = 7;
		
		if ((num3 > num4) || (num1 == num2)) {
			System.out.println("Primeira opção satisfeita.");	
		} else {
			System.out.println("Segunda opção satisfeita.");
		}
		
		if ((num3 > num4) && (num1 == num2)) {
			System.out.println("Primeira opção satisfeita.");	
		} else {
			System.out.println("Segunda opção satisfeita.");
		}
	}
}
