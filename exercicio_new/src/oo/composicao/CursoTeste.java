package oo.composicao;

public class CursoTeste {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Jo�o");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web 2023");
		Curso curso3 = new Curso("React Native");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
	    aluno1.adicionarCurso(curso3);
	    aluno2.adicionarCurso(curso3);
	    aluno3.adicionarCurso(curso3);
	    
     	    System.out.println("Curso:  " + curso1.nome);
     	    System.out.println();
	    for(Aluno aluno: curso1.alunos) {
	    	System.out.println("Nome do aluno: " + aluno.nome);	   	
	    	
		}
	        System.out.println("--------------------------------------");
	        
	        System.out.println("Curso: " + curso2.nome);
	        System.out.println();
	    for(Aluno aluno: curso2.alunos) {
	    	System.out.println("Nome do aluno: " + aluno.nome);		
	    	
	    }
	        System.out.println("--------------------------------------");
	    
	        System.out.println("Curso: " + curso3.nome);
	        System.out.println();
	    for(Aluno aluno: curso3.alunos) {
	    	System.out.println("Nome do aluno: " + aluno.nome);	
	    	
	    }
	        System.out.println("---------------------------------------");
		
	        System.out.println(aluno1.cursos.get(0).alunos);
	        System.out.println();
	        
	        Curso cursoEncontrado = aluno1.obterCursoPorAluno("Java Completo");
	        
	    if(cursoEncontrado != null) {
	    	System.out.println(cursoEncontrado.nome);
        	System.out.println(cursoEncontrado.alunos);
	    }
	}
	

}
