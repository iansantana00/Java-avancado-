import javax.swing.JOptionPane;

public class EntradaDados {

	public static void main(String[] args) {
		// Entrada de Dados via JOptionPane 
		
		int idade;
		
		// Irá abrir uma caixinha para enviar os dados 
		// Converter para inteiro 
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da pessoa: "));
		// Irá mostrar no terminal 
		System.out.println("A pessoa tem " + idade + " anos de idade.");
		
		// Irá mostrar na caixinha 
		JOptionPane.showMessageDialog(null, "A pessoa tem " + idade + " anos de idade");
		
		
		
	}

}
