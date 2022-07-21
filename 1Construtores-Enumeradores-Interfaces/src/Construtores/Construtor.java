package Construtores;

import Construtores.Aluno.MATRICULA;
import Construtores.Aluno.STATUS;

public class Construtor {
	
	public static void main(String[] args) {
		// passando os dados através do construtor com sobrecarga
		Aluno alu = new Aluno( 8, 8, 8);
		// Calculando a média
		double mediaAlunoFinal = alu.calcularMediaAluno();
		
		// Definindo situação do aluno 
		if (mediaAlunoFinal < 6) { 
			alu.situacaoAluno = STATUS.REPROVADO;
		} else {
			alu.situacaoAluno = STATUS.APROVADO;
		}
		
		// imprimindo situação do aluno 
		System.out.println("A média do aluno é " + alu.calcularMediaAluno() +
				" e o aluno está " + alu.situacaoAluno);
		
		// usa enum MATRICULA 
		alu.situacaoMatricula = MATRICULA.MATRICULADO;
		System.out.println("O Aluno está " + alu.situacaoMatricula);
	}
}
