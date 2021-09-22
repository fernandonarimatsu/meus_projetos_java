package oo.composicao;

public class Curso_Teste {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web 2023");
		Curso curso3 = new Curso("React Native");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		curso1.adicionarAluno(aluno3);
		
		curso2.adicionarAluno(aluno2);
		
		curso3.adicionarAluno(aluno1);
		curso3.adicionarAluno(aluno3);
		
		System.out.println("Alunos cursando " + curso1.nome + " :");
		for (Aluno aluno : curso1.alunos) {
			System.out.println(aluno.nome);	
		}
		System.out.println();
		System.out.println("Alunos cursando " + curso2.nome + " :");
		for (Aluno aluno : curso2.alunos) {
			System.out.println(aluno.nome);				
		}
		System.out.println();
		System.out.println("Alunos cursando " + curso3.nome + " :");
		for (Aluno aluno : curso3.alunos) {
			System.out.println(aluno.nome);				
		}
		
	}

}
