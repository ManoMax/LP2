/**
* Laboratório de Programação 2 - Lab 1
*
* @author Gabriel Max Vieira Matos - 117110060
*/

package classes;

import java.util.Arrays;

/** 
 * Representação de uma Disciplina, toda Disciplina precisa ter um nome,
 * Quantidade de provas, e seus respectivos pesos.
 * Além disso, a classe oferece cadastramento de horas de estudo, inicialmente em 0 horas.
 * 
 * @author Gabriel Max
 */

public class Disciplina {

	private String disciplina;
	
	private int horas;

	private double[] arrayProva;
	
	private int[] arrayPesos;

	private double media;
	
	/**
	 * Registra Disciplina.
	 * Estabelece padrão de 4 provas.
	 * Estabelece pesos iguais a todas as provas.
	 *
	 * @param arrayProva: Lista de notas das 4 provas.
	 * @param disciplina: Nome da disciplina.
	 * @param arrayPesos: Lista de pesos das 4 provas.
	 */
	public Disciplina(String disciplina) {
		this.arrayProva = new double[4];
		this.disciplina = disciplina;
		this.arrayPesos = new int[]{1, 1, 1, 1};
	}
	
	/**
	 * Registra Disciplina.
	 * Estabelece padrão da quantidade de provas, como parâmetro.
	 * Estabelece padrões de pesos das n provas.
	 *
	 * @param arrayProva: Lista de notas das n provas.
	 * @param disciplina: Nome da disciplina.
	 * @param arrayPesos: Lista de pesos das n provas.
	 */
	public Disciplina(String disciplina, int provas, int[] pesos) {
		this.arrayProva = new double[provas];
		this.disciplina = disciplina;
		this.arrayPesos = pesos;
	}
	
	/**
	 * Não retorna algum valor (Void).
     * Acrescenta quantidade de horas estudadas.
     *
     * @param horas: Tempo, em horas, de estudo.
     */
	public void cadastraHoras(int horas) {
		this.horas += horas;
	}
	
	/**
	 * Não retorna algum valor (Void).
     * Acrescenta valor das notas em provas correspondentes.
     *
     * @param arrayProva: Lista de provas com suas respectivas notas.
     */
	public void cadastraNota(int prova, double nota) {
		this.arrayProva[prova-1] = nota;
	}
	
	/**
	 * Retorna booleanos que representam a aprovação do aluno.
     *
     * @return boolean.
     */
	public boolean aprovado() {

		if (media() >= 7) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Retorna um double que representa a media do aluno.
     *
     * @return representação, em double, da media do aluno.
     */
	private double media() {
		double soma = 0;
		double divisao = 0;
		for (int i = 0; i < arrayPesos.length; i++) {
			soma += arrayProva[i] * arrayPesos[i];
			divisao += arrayPesos[i];
		} 
		this.media = soma / divisao;
		return soma / divisao;
	}
	
	/**
	 * Retorna a String que representa o Status do aluno.
     * A representação segue o formato:
     * "Disciplina HorasDeEstudo Media NotaDasProvas"
     *
     * @return a representação String do Status de um aluno. 
     */
	@Override
	public String toString() {
		String saida = disciplina + " " + horas + " " + media + " ";
		saida += Arrays.toString(arrayProva);
		return saida;
	}
	
	/**
	 * Retorna a String disciplina.
	 * 
     * @return nome da Disciplina. 
     */
	public String getNome() {
		return this.disciplina;
	}
}
