package Embarque;

import java.util.Scanner;
import Controle.Aeronaves;

public class Principal {
	/*
	 * Informar a quantidade de aeronaves no pátio, 
	 * o números dos vôos por ordem de chegada.
	 * A ordem de decolagem é FIFO, 
	 * o primeiro que entra é o primeiro que sai. 
	 * Mostrar qual o primeiro võo a decolar.	
	 */
	public static void main(String[] args) {
		// Usando scanner para leitura
		Scanner sc = new Scanner(System.in);
		
		// Criando Classe Aeronaves e Instanciando
		Aeronaves air = new Aeronaves();
		System.out.println("Informe o número de aeronaves: ");
		int nrAeronaves = sc.nextInt();
			
		// Adicionando voos
		for (int i = 0; i < nrAeronaves; i++) {
			int nrVoo = sc.nextInt();
			air.addVoo(nrVoo);
		}
		System.out.println("O primeiro a decolar vai ser o número: " +
		air.primeiroVoo());
		air.listaVoos();
		sc.close();
		
	}

}
