import java.util.LinkedList;

public class LinkedListCarros {

	public static void main(String[] args) {
		
		LinkedList<String> cars = new LinkedList<>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		System.out.println(cars);
		
		// Incluindo Mazda no inicio
		cars.addFirst("Mazda");
		System.out.println(cars);
		
		// Incluindo Bugatti no fim
		cars.addLast("Bugatti");
		System.out.println(cars);
		
		// Removendo Mazda
		cars.removeFirst();
		System.out.println(cars);
		
		// Removendo Bugatti
		cars.removeLast();
		System.out.println(cars);
		
		// Pega o primeiro 
		System.out.println(cars.getFirst());
		System.out.println(cars);
		
		String carro = cars.get(1);
		System.out.println(carro);
		
		// Pega o último
		System.out.println(cars.getLast());
		System.out.println(cars);
	}
}
