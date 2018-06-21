package classes;

import java.util.ArrayList;
import java.util.HashMap;

public class Sistema {
	
	/**
	  * Mapa de grupos, identificados pelo Nome.
	  * Mapa de Alunos, identificados pela Matricula.
	  * ArrayList de Alunos com Respostas Registradas.
	  */
	private HashMap<String, Grupo> grupos;
	private HashMap<String, Aluno> alunos;
	private ArrayList<String> respostas;
	private int pos;
	
	/** 
	  * Representação de um Sistema, onde o Sistema possui um Mapa de Grupo e outro de Aluno.
	  * Também é presente uma ArrayList de Alunos com Respostas Registradas.
	  * E posição inicial desses alunos em 1.
	  * 
	  * @author Gabriel Max
	  */
	public Sistema() {
		this.grupos = new HashMap<>();
		this.alunos = new HashMap<>();
		this.respostas = new ArrayList<>();
		this.pos = 1;
	}
	
	/** 
	  * Cadastra Aluno, com Matricula, Nome e Curso.
	  * Mapeado através da Matrícula.
	  * 
	  * @return boolean.
	  */
	public boolean cadastrarAluno(String matricula, String nome, String curso) {
		boolean cadastrar = true;
		analisaException(matricula);
		analisaException(nome);
		analisaException(curso);
		
		if (this.alunos.containsKey(matricula)) {
			cadastrar = false;
			return false;
		}
		if (cadastrar) {
			alunos.put(matricula, new Aluno(matricula, nome, curso));
		}
		return true;
	}

	/** 
	  * Exibe a representação do Aluno, no Formato:
	  * "Matricula - Nome - Curso"
	  * 
	  * @return Representação String do Aluno.
	  */
	public String exibirAluno(String matricula) {
		analisaException(matricula);
		
		if (this.alunos.containsKey(matricula)) {
			return "\n" + alunos.get(matricula).exibirAluno() + "\n";
		} else {
		return "\nAluno não cadastrado.\n";
		}
	}

	/** 
	  * Cadastra novo Grupo, com Nome, e lista de alunos inicialmente vazia.
	  * Mapeado através do Nome.
	  * 
	  * @return boolean.
	  */
	public boolean novoGrupo(String grupo) {
		boolean cadastrar = true;
		analisaException(grupo);
		
		if (this.grupos.containsKey(grupo)) {
			cadastrar = false;
			return false;
		}

		if (cadastrar) {
			Grupo newGrupo = new Grupo(grupo);
			grupos.put(grupo, newGrupo);
		}
		return true;
	}

	/** 
	  * Aloca um Aluno, mapeado pela Matricula, em um grupo, mapeado pelo Nome.
	  * 
	  * @return boolean.
	  */
	public boolean alocarAluno(String matricula, String grupo) {
		
		analisaException(matricula);
		if (this.alunos.containsKey(matricula)) {
			
			analisaException(grupo);
			if (this.grupos.containsKey(grupo)) {
				grupos.get(grupo).alocarAluno(this.alunos.get(matricula));
				return true;
			}
		}
		return false;
	}

	/** 
	  * Verifica existencia do Cadastro de um Aluno, através do mapeamento de Matriculas.
	  * 
	  * @return boolean.
	  */
	public boolean verificaAluno(String matricula) {
		
		analisaException(matricula);
		if (this.alunos.containsKey(matricula)) {
			return true;
		} else {
			return false;
		}
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
	public String imprimirGrupo(String grupo) {
		
		analisaException(grupo);
		if (this.grupos.containsKey(grupo)) {
			return "\n" + this.grupos.get(grupo).imprimirGrupo();
		} else {
			return "\nGrupo não cadastrado.\n";
		}
	}

	/** 
	  * Registra nova Resposta de um Aluno, mapeado pela Matricula.
	  * 
	  * @return boolean.
	  */
	public boolean registrarResposta(String matricula) {
		boolean alunoInexistente = true;
		boolean saida = true;
		
		analisaException(matricula);
		if (this.alunos.containsKey(matricula)) {
			String registro = pos + ". " + alunos.get(matricula).exibirAluno();
			pos++;
			respostas.add(registro);
			alunoInexistente = false;
		}
		if (alunoInexistente) {
			saida = false;
		}
		return saida;
	}

	/** 
	  * Exibe a lista de Alunos com Respostas Registradas, no Formato:
	  * "1. Matricula - Nome - Curso
	  *  2. Matricula - Nome - Curso
	  *  3. Matricula - Nome - Curso
	  *              ...            ".
	  * 
	  * @return Representação String de Alunos com Respostas Registradas.
	  */
	public String imprimirAlunos() {
		String saida = "";
		for (String r: respostas) {
			saida += r + "\n";
			}
		return saida;
	}
	
	/**
	  * Illegal Argument Exception.
	  * Sem parâmetros de retorno caso o usuário forneça uma entrada vazia.
	  */
	public void analisaException(String excecao) {
		boolean erro = true;
		for (int i = 0; i < excecao.length(); i++) {
			if (excecao.charAt(i) != ' ') {
				erro = false;
			}
		}
		if (erro) {
			throw new IllegalArgumentException();
		}
	}
}
