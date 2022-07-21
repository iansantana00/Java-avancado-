
public class Principal {

	public static void main(String[] args) {
		
		Fisica fis = new Fisica();
		
		fis.nome = "João";
		fis.cpf = "111111111";
		fis.identidade = "131938450";
		fis.situacaoPessoa = "A";
		
		System.out.println("Dados da Pessoa Física: ");
		System.out.println(fis.toString());
		
		Juridica jur = new Juridica();
		
		jur.cnpj = "123456789";
		jur.nome = "CASAS DO SILVA";
		jur.inscEstadual = "454565454";
		jur.situacaoPessoa = "I";
		
		System.out.println("Dados da Pessoa Jurídica: ");
		System.out.println(jur.toString());
		
	}

}
