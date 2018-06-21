/**
* Laboratório de Programação 2 - Lab 1
*
* @author Gabriel Max Vieira Matos - 117110060
*/

package classes;

/** 
 * Representação de uma Conta no Laboratório, toda Conta precisa ter o nome do laboratório,
 * Limite de memória consumida, e Memória consumida inicialmente em 0 mb.
 * 
 * @author Gabriel Max
 */

public class ContaLaboratorio {
	
	private String nome;

	private int cota;

	private int espaco;
	
	/**
     * Constrói uma Conta Laboratório, definindo os parâmetros como:
     * Nome da Conta Laboratorio.
     * Cota de 2000 mb.
     * E espaco consumido 0 mb.
     * 
     * @param nome: Nome do Laboratório.
     * @param cota: Limite de uso de memória.
     * @param espaco: Espaço consumido igual a 0 mb.
     */
	public ContaLaboratorio(String nome) {
		this.nome = nome;
		this.cota = 2000;
	}
	
	/**
     * Constrói uma Conta Laboratório, definindo os parâmetros como:
     * Nome da Conta Laboratorio.
     * Cota de n mb.
     * E espaco consumido 0 mb.
     * 
     * @param nome: Nome do Laboratório.
     * @param cota: Limite de uso de memória.
     * @param espaco: Espaço consumido igual a 0 mb.
     */
	public ContaLaboratorio(String nome, int cota) {
		this.nome = nome;
		this.cota = cota;
	}
	
	 /**
	  * Não retorna algum valor (Void).
	  * Consome espaço na memória.
	  *
	  * @return void.
	  */
	public void consomeEspaco(int espaco) {
		this.espaco += espaco;
	}

	 /**
	  * Não retorna algum valor (Void).
	  * Libera espaço de memória.
	  *
	  * @return void.
	  */
	public void liberaEspaco(int espaco) {
		this.espaco -= espaco;
	}
	
	 /**
	  * Retorna um booleano, se o aluno atingiu a cota limite.
	  * 
	  * @return boolean.
	  */
	public boolean atingiuCota() {
		return espaco >= cota;
		}

	 /**
	  * Retorna a String que representa a conta Laboratório.
	  * A representação segue o formato:
	  * "NomeDoLaboratório EspacoDeMemóriaConsumida/CotaDeMemória"
	  * 
	  * @return String.
	  */
	@Override
	public String toString() {
		String saida = nome + " " + espaco + "/" + cota;
		return saida;
	}
	
	/**
	 * Retorna a String nome.
	 * 
     * @return nome do Laboratório. 
     */
	public String getNome() {
		return this.nome;
	}
}