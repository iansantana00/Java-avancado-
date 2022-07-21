
public class Aritmeticos {

	public static void main(String[] args) {
		int num1, num2, num3;
		
		num1 = 10;
		num2 = 20; 
		num3 = num1 + num2;
        
		System.out.println("O resultado da soma é: " + num3);
		
		int num4;
		num4 = num3 * num2 / num1;
		
		System.out.println("O resultado de num4 é: " + num4);
		
		System.out.println("----------------------------------");
		
		num1 = 0;
		
		// Incrementando
		while (num1 < 10) {
			num1 ++; // num1 vai aumentar de 1 em 1
			System.out.println(num1);
		}
		
		System.out.println("-----------------------------------");
		num1 = 10;
		
		// Incrementando
		while (num1 > 0) {
			System.out.println(num1);
			num1 --; // num1 vai diminuir de 1 em 1
		}
		
		
	}

}
