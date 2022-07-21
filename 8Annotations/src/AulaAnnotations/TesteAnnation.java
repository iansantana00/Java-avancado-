package AulaAnnotations;

class DeprecatedTeste{
	void visualizar() {
		System.out.println("Método Visualizacao");
	}
	
	/*
	 * @deprecated replaced by display()
	 */
	
	@Deprecated
	void exibir() {
		System.out.println("Mostrando que o método exibir é deprecated");
	}
}


	