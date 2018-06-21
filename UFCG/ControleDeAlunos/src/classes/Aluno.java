package classes;

public class Aluno {
	
	/**
	  * Matricula do Aluno.
	  * Nome do Aluno.
	  * Curso do Aluno.
	  */
	private String matricula;
	private String nome;
	private String curso;
	
	/** 
	  * Representação de um Aluno, onde todo Aluno possui uma Matricula, um Nome e um Curso.
	  * 
	  * @author Gabriel Max
	  */
	public Aluno(String matricula, String nome, String curso) {
		this.matricula = matricula;
		this.nome = nome;
		this.curso = curso;
	}
	
	/** 
	  * Exibe a representação do Aluno, no Formato:
	  * "Matricula - Nome - Curso"
	  * 
	  * @return Representação String do Aluno.
	  */
	public String exibirAluno() {
		return this.matricula + " - " + 
			   this.nome + " - " + this.curso;
	}
	
	/** 
	  * Retorna o nome do Aluno.
	  * 
	  * @return Representação String do Nome do Aluno.
	  */
	public String getName() {
		return this.nome;
	}

	/** 
	  * Retorna a Matricula do Aluno.
	  * 
	  * @return Representação String da Matricula do Aluno.
	  */
	public String getMatricula() {
		return this.matricula;
	}

}
