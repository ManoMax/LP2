package classes;

public class Contato {
	
	/**
	  * Nome, Sobrenome e Telefone de um Contato.
	  */
	private String nome;
	private String sobrenome;
	private String telefone;
	
	/**
	  * DDD, código do país e respectivos números.
	  * Boolean de Cadastro de Implemento.
	  * Nível de Relação.
	  */
	private String[] ddd;
	private String[] codigo;
	private String[] numeros;
	private boolean implemento;
	
	private String nivel;
	
	/** 
	  * Representação de um Contato, onde todo Contato Cadastrado possui um nome, sobrenome e telefone.
	  * 
	  * Registra espaços para DDD, código do país e números extras, vazios.
	  * Implemento inicialmente Falso.
	  * 
	  * @author Gabriel Max
	  */
	public Contato(String nome, String sobre, String tel){
		nomeNulo(nome);
		this.nome = nome;
		this.sobrenome = sobre;
		this.telefone = tel;
		this.ddd = new String[3];
		this.codigo = new String[3];
		this.numeros = new String[3];
		this.implemento = false;
		
		for (int i = 0; i < 3; i++) {
			this.ddd[i] = "";
			this.codigo[i] = "";
			this.numeros[i] = "";
		}
	}
	
	/** 
	  * Registra espaços para DDD, código do país e números extras.
	  * E torna a Implementação Verdadeira.
	  * 
	  * @return Void.
	  */
	public void cadastraTelefone(int tipo, String ddd, String numero, String codigo) {
		this.ddd[tipo-1] = ddd;
		this.codigo[tipo-1] = codigo;
		this.numeros[tipo-1] = numero;
		this.implemento = true;
	}
	
	/** 
	  * Define o nível de Relação.
	  * Entre: Distante, Colega, Amigo, Amigão e Irmão.
	  * 
	  * @return Void.
	  */
	public void defineNivel(int nivel) {
		if (nivel == 1) {
			this.nivel = "distante";
		} else if (nivel == 2) {
			this.nivel = "colega";
		} else if (nivel == 3) {
			this.nivel = "amigo";
		} else if (nivel == 4) {
			this.nivel = "amigão";
		} else if (nivel == 5) {
			this.nivel = "irmão";
		}
	}
	
	/** 
	  * Exibe Nível de Relação.
	  * Entre: Distante, Colega, Amigo, Amigão e Irmão.
	  * 
	  * @return Representação String do Nível de Relação.
	  */
	public String informaNivel() {
		return this.nivel;
	}
	
	/**
	  * Null Exception.
	  * Retorna o aviso "Nome Obrigatório!" caso o usuário forneça
	  * uma entrada vazia para Nome.
	  */
	private static void nomeNulo(String nome){
		if(nome.equals("")){
			throw new NullPointerException("Nome Obrigatório!");
		}
	}
	
	/** 
	  * Representação de um Contato, exibido no formato:
	  * "Nome Sobrenome - Telefone"
	  * 
	  * Ou no formato Implementado:
	  * "Nome Sobrenome
	  *  Padrão: DDDCodigoNumero
	  *  Trabalho: DDDCodigoNumero
	  *  Casa: DDDCodigoNumero
	  * 
	  * @return representação String de um Contato.
	  */
	@Override
	public String toString() {
		if (implemento) {
			return "\n" + this.nome + " " + this.sobrenome + "\n" +
				   "Padrão: " + this.telefone + "\n" +
				   "Celular: " + this.codigo[0] + this.ddd[0] + this.numeros[0] + "\n" +
				   "Trabalho: " + this.codigo[1] + this.ddd[1] + this.numeros[1] + "\n" +
				   "Casa: " + this.codigo[2] + this.ddd[2] + this.numeros[2] + "\n";
		} else {
		return this.nome + " " +
			   this.sobrenome + " - " +
			   this.telefone + "\n";
		}
	}
	
	/**
	  * Apresenta Nome e sobrenome de um Contato.
	  * No formato:
	  * “Nome Sobrenome.
	  *
	  * @returns a representação em String do Contato Cadastrado.
	  */
	public String listagem() {
		return this.nome + " " + this.sobrenome;
	}
	
	/**
	  * Apresenta Nome Contato.
	  * No formato:
	  * “Nome".
	  *
	  * @returns a representação em String do nome Contato Cadastrado.
	  */
	public String getNome() {
		return this.nome;
	}
	
	/**
	  * Apresenta Sobrenome Contato.
	  * No formato:
	  * “Sobrenome".
	  *
	  * @returns a representação em String do sobrenome do Contato Cadastrado.
	  */
	public String getSobrenome() {
		return this.sobrenome;
	}
	
	/**
	  * Apresenta Telefone Contato.
	  * No formato:
	  * “Telefone".
	  *
	  * @returns a representação em String do telefone do Contato Cadastrado.
	  */
	public String getTelefone() {
		return this.telefone;
	}
	
}