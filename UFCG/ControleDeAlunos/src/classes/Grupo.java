package classes;

import java.util.ArrayList;

public class Grupo {
	
	/**
	  * Nome do Grupo.
	  * ArrayList de Alunos.
	  */
	private String nome;
	private ArrayList<Aluno> alunos = new ArrayList<>();
	
	/** 
	  * Representação de um Grupo, onde todo Grupo possui um Nome, e uma Lista de Alunos.
	  * 
	  * @author Gabriel Max
	  */
	public Grupo(String nome) {
		this.nome = nome.toLowerCase();
	}
	
	/** 
	  * Aloca um Aluno no ArrayList.
	  * 
	  * @return void.
	  */
	public void alocarAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	/** 
	  * Exibe a representação do Grupo, no Formato:
	  * "Alunos do grupo NomeDoGrupo:
	  * * Matricula - Nome - Curso
	  * * Matricula - Nome - Curso
	  * *           ...           ".
	  * 
	  * @return Representação String do Grupo.
	  */
	public String imprimirGrupo() {
		String saida = "Alunos do grupo " + this.nome.substring(0, 1).toUpperCase() +
					   this.nome.substring(1) + ":\n";
		for (Aluno a: alunos) {
			if (a.getName().equals("")) {
				break;
			} else {
				saida += "* " + a.exibirAluno();
			}
		saida += "\n";
		} return saida;
	}
	
	/** 
	  * Retorna o nome do Grupo.
	  * 
	  * @return Representação String do Nome do Grupo.
	  */
	public String getNome() {
		return this.nome;
	}
	
}
