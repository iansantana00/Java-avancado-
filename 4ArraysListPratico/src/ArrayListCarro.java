import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArrayListCarro {

	public static void main(String[] args) {
		// Construindo um arraylist para os carros
		
		ArrayList<String> carros = new ArrayList<>();
		// <> Tipo de dado que será adicionado ao arraylist carro
		
		// Adicionando Carros ao arraylist
		carros.add("GOL");
		carros.add("CRETA");
		carros.add("COROLLA");
		carros.add("UNO");
		carros.add("CIVIC");
		/*
		// Mostrar array
		System.out.println(carros);
		
		// Substituir CIVIC por FUSCA 
		carros.set(4, "FUSCA");
		// Mostrar array
		System.out.println(carros);

		// Adicionando Carros ao arraylist com JOptionPane
		carros.add(JOptionPane.showInputDialog("Informe o nome do Carro: "));
		
		// Mostrar array
		System.out.println(carros);
		
		// Esvaziando o array
		carros.clear();
		
		// Mostrar Array
		System.out.println(carros);
		
		// Verificar se o array está vazio
		if(carros.isEmpty()) {
			System.out.println("O vetor está vazio");
			}
		*/
		if(carros.contains("GOL")) {
			// Substituindo quando não se sabe a posição
			for(int i = 0; i < carros.size(); i++) {
				if("GOL".equals(carros.get(i))) {
					carros.set(i, "HB20");
					break;
					}
		    	}
		System.out.println(carros);
		}
		
		System.out.println(carros.size());
		}
	}

