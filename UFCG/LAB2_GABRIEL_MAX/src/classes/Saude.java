/**
* Laboratório de Programação 2 - Lab 1
*
* @author Gabriel Max Vieira Matos - 117110060
*/

package classes;

/** 
 * Representação de um estado de Saúde.
 * Todo estado de saúde começa inicialmente em "boa".
 * Com a saúde Mental e Física "boa".
 * 
 * @author Gabriel Max
 */

public class Saude {

	private boolean mental;
	
	private boolean fisica;
	
	private boolean ativadorEmoji;
	
	private String mensagem;
	
	/**
	 * Método Construtor.
	 * 
	 * Constroi um Status de Saúde, a partir de níveis de saúde
	 * Mental e Física.
	 * É implementada uma função de Emoji na Construção (Inicialmente Desligada).
	 *
	 */
	public Saude() {
		mental = true;
		fisica = true;
		ativadorEmoji = false;
	}
	
	/**
	 * Retorna a String que representa o nível de Saúde.
	 * 
	 * A Representação segue o formato:
	 * “boa”, "Ok" ou "fraca".
	 *
	 * @returns a representação em String do nível de saúde.
	 * 			Ou a representação em Emoji.
	 */
	public String geral() {
		if (ativadorEmoji) {
			return mensagem;
			
	  } else if (mental && fisica) {
			this.mensagem = "boa";
	  } else if (mental || fisica) {
		  	this.mensagem = "ok";
	  } else {
		  	this.mensagem = "fraca";
	  }
		return mensagem;
	}
	
	/**
	 * Não retorna algum valor (Void).
	 * Define o nível de saude Mental em "boa" ou "fraca".
	 * Desativa a Implementação Emoji.
	 *
	 * @returns a representação em String do nível de saúde.
	 */
	public void defineSaudeMental(String saude) {
		if (saude.equals("boa")) {
			this.mental = true;
		} else if (saude.equals("fraca")) {
			this.mental = false;
		}
		this.ativadorEmoji = false;
	}
	
	/**
	 * Não retorna algum valor (Void).
	 * Define o nível de saude Física em "boa" ou "fraca".
	 * Desativa a Implementação Emoji.
	 *
	 * @returns a representação em String do nível de saúde.
	 */
	public void defineSaudeFisica(String saude) {
		if (saude.equals("boa")) {
			this.fisica = true;
		} else if (saude.equals("fraca")){
			this.fisica = false;
		}
		this.ativadorEmoji = false;
	}
	
	/**
	 * Não retorna algum valor (Void).
	 * Ativa a Implementação Emoji.
	 * Retorna o valor saida como Emoji no Status de Saúde.
	 *
	 * @returns a representação em String do nível de saúde, versão Emoji.
	 */
	public void definirEmoji(String valor) {
		this.mensagem = valor;
		this.ativadorEmoji = true;
	}
	
}
