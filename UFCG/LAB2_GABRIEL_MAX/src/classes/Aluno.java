/**
* Laboratório de Programação 2 - Lab 1
*
* @author Gabriel Max Vieira Matos - 117110060
*/

package classes;

import java.util.Arrays;

/**
 * Futuro Projeto:
 * O aluno recebe diversas informações, como:
 * Status, Emblema, Base, Veracidade, quantidadeDeClas.
 * 
 * Projeto de LP2:
 * Representação de um Aluno, onde tal aluno pode receber matriculas em diversas Disciplinas,
 * Contas na Cantina e Contas no Laboratório, além de possuir um estado de saúde inicialmente "boa".
 *
 * @author Gabriel Max
 */

public class Aluno {
	
	// Atributos para futuros projetos.
	private String status;
	private String emblema;
	private String base;
	private int veracidade;
	private int quantidadeDeClas;
	
	// Projeto de LP2.
	private String nomeAluno;
	
	private ContaLaboratorio[] contaLab;
	private int numContaLab;
	
	private Disciplina[] disciplinasCadastradas;
	private int numDeDisciplinas;
	
	private ContaCantina[] contaCantina;
	private int numContaCantina;
	
	// Aluno
	/**
	 * - Atributos para futuros projetos:
	 * 
	 * Registra um Aluno.
	 * Estabelece seu nome, de acordo com o parâmetro.
	 * Torna o Status, Emblema e Base padrão.
	 * Define Veracidade e QuantidadeDeClãs igual a 0.
	 * 
	 * - Projeto de LP2:
	 * 
	 * Estabelece seu nome, de acordo com o parâmetro.
	 * Torna numero de Contas Lab, Contas Cantinas e Disciplinas igual a 1.
	 * Instancia Lista de Contas Lab, Contas Cantinas e Disciplinas.
	 * 
	 * - Atributos para futuros projetos:
	 * 
	 * @param nomeAluno: Nome do aluno.
	 * @param status: Curso/Série.
	 * @param emblema: Adjetivo comprado com Canetas(Moedas).
	 * @param veracidade: Taxa de Aprovação de outros usuários.
	 * @param quantidadeDeCla: Número de grupos educacionais envolvidos.
	 * 
	 * - Projeto de LP2:
	 * @parem numContaLab: Número de Contas Laboratório registradas.
	 * @parem contaLab: Lista de Contas Laboratório.
	 * @parem numDeDisciplinas: Número de Disciplinas registradas.
	 * @parem disciplinasCadastradas: Lista de Disciplinas Cadastradas.
	 * @parem numContaCantina: Número de Contas Cantina registradas.
	 * @parem contaCantina: Lista de Contas Cantina.
	 * 
	 */
	public Aluno(String nome) {
		
		// Atributos para futuros projetos.
		this.status = "-";
		this.emblema = "-";
		this.base = "-";
		this.veracidade = 0;
		this.quantidadeDeClas = 0;
		
		// Projeto de LP2.
		this.nomeAluno = nome;
		
		this.numContaLab = 1;
		this.contaLab = new ContaLaboratorio[numContaLab];
		
		this.numDeDisciplinas = 1;
		this.disciplinasCadastradas = new Disciplina[numDeDisciplinas];
		
		this.numContaCantina = 1;
		this.contaCantina = new ContaCantina[numContaCantina];
		
	}
	
	// Laboratorio
	/**
	 * Não retorna algum valor (Void).
     * Registra mais uma Conta Laboratório, com 2000 mb, na Lista.
     *
     * @param contaLab: Lista de Conta Lab.
     * @param numContaLab: Numero de Contas Laboratório criadas até agora.
     */
	public void cadastraLaboratorio(String nomeLaboratorio) {
		this.contaLab[numContaLab-1] = new ContaLaboratorio(nomeLaboratorio);
		this.numContaLab += 1;
		ContaLaboratorio[] contaLabAux = Arrays.copyOf(contaLab, numContaLab);
		contaLab = contaLabAux;
	}
	
	/**
	 * Não retorna algum valor (Void).
     * Registra mais uma Conta Laboratório,
     * com cota de memoria fornecida no Parâmetro, na Lista.
     *
     * @param contaLab: Lista de Conta Lab.
     */
	public void cadastraLaboratorio(String nomeLaboratorio, int cota) {
		this.contaLab[numContaLab-1] = new ContaLaboratorio(nomeLaboratorio, cota);
		this.numContaLab += 1;
		ContaLaboratorio[] contaLabAux = Arrays.copyOf(contaLab, numContaLab);
		contaLab = contaLabAux;
	}
	
	/**
	 * Não retorna algum valor (Void).
     * Consome espaço de memória de uma Conta Lab especifica.
     * 
     * @param contaLab[i]: Conta Laboratório específica.
     */
	public void consomeEspaco(String nomeLaboratorio, int mbytes) {
		for (int i = 0; i < contaLab.length -1; i++) {
			if (contaLab[i].getNome().equals(nomeLaboratorio)) {
				contaLab[i].consomeEspaco(mbytes);
				break;
			}
		}
	}
	
	/**
	 * Não retorna algum valor (Void).
     * Libera espaço de memória de uma Conta Lab especifica.
     * 
     * @param contaLab[i]: Conta Laboratório específica.
     */
	public void liberaEspaco(String nomeLaboratorio, int mbytes) {
		int i = 0;
		for (i = 0; i < contaLab.length-1; i++) {
			if (contaLab[i].getNome().equals(nomeLaboratorio)) {
				contaLab[i].liberaEspaco(mbytes);
				break;
			}
		}
	}
	
	/**
	 * Retorna booleanos que representam se o limite da cota foi atingido.
     *
     * @return boolean.
     */
	public boolean atingiuCota(String nomeLaboratorio) {
		int i = 0;
		for (i = 0; i < contaLab.length-1; i++) {
			if (contaLab[i].getNome().equals(nomeLaboratorio)) {
				break;
			}
		}
		return contaLab[i].atingiuCota();
	}
	
	/**
	 * Retorna a Representação String da Conta Laboratório.
	 * A representação segue o formato:
	 * "NomeDoLaboratório EspacoDeMemóriaConsumida/CotaDeMemória"
     *
     * @return String.
     */
	public String laboratorioToString(String nomeLaboratorio) {
		int i = 0;
		String saida = null;
		for (i = 0; i < contaLab.length-1; i++) {
			if (contaLab[i].getNome().equals(nomeLaboratorio)) {
				saida = contaLab[i].toString();
				break;
			}
		}
		return saida;
	}
	
	
	
	//Disciplina
	/**
	 * Não retorna algum valor (Void).
     * Registra mais uma Disciplina na Lista, com padrão de 4 provas de mesmo peso.
     *
     * @param disciplinasCadastradas: Lista de 4 provas de mesmo peso.
     * @param numDeDisciplinas: Numero de Disciplinas criadas até agora.
     */
	public void cadastraDisciplina(String nomeDisciplina) {
		this.disciplinasCadastradas[numDeDisciplinas-1] = new Disciplina(nomeDisciplina);
		this.numDeDisciplinas += 1;
		Disciplina[] contaDisAux = Arrays.copyOf(disciplinasCadastradas, numDeDisciplinas);
		disciplinasCadastradas = contaDisAux;
	}
	
	/**
	 * Não retorna algum valor (Void).
     * Registra mais uma Disciplina na Lista, com padrão de n provas de pesos definos como parâmetros.
     *
     * @param disciplinasCadastradas: Lista de n provas, definidas como parâmetros, de pesos independentes.
     * @param numDeDisciplinas: Numero de Disciplinas criadas até agora.
     */
	public void cadastraDisciplina(String nomeDisciplina, int provas, int[] pesos) {
		this.disciplinasCadastradas[numDeDisciplinas-1] = new Disciplina(nomeDisciplina, provas, pesos);
		this.numDeDisciplinas += 1;
		Disciplina[] contaDisAux = Arrays.copyOf(disciplinasCadastradas, numDeDisciplinas);
		disciplinasCadastradas = contaDisAux;
	}
	
	/**
	 * Não retorna algum valor (Void).
     * Cadastra mais Horas de Estudo, em determinada Disciplina.
     *
     * @param disciplinasCadastradas[i]: Disciplina Específica.
     */
	public void cadastraHoras(String nomeDisciplina, int horas) {
		for (int i = 0; i < numDeDisciplinas -1; i++) {
			if (disciplinasCadastradas[i].getNome().equals(nomeDisciplina)) {
				disciplinasCadastradas[i].cadastraHoras(horas);
				break;
			}
		}
	}
	
	/**
	 * Não retorna algum valor (Void).
     * Cadastra novas Notas de provas e Disciplinas determinadas.
     *
     * @param disciplinasCadastradas[i]: Disciplina Específica.
     */
	public void cadastraNota(String nomeDisciplina, int nota, double valorNota) {
		for (int i = 0; i < numDeDisciplinas -1; i++) {
			if (disciplinasCadastradas[i].getNome().equals(nomeDisciplina)) {
				disciplinasCadastradas[i].cadastraNota(nota, valorNota);
				break;
			}
		}
	}
	
	/**
	 * Retorna booleanos que representam a Aprovação do Aluno na Disciplina.
     *
     * @return boolean.
     */
	public boolean aprovado(String nomeDisciplina) {
		boolean saida = false;
		for (int i = 0; i < numDeDisciplinas -1; i++) {
			if (disciplinasCadastradas[i].getNome().equals(nomeDisciplina)) {
				saida = disciplinasCadastradas[i].aprovado();
			}
		}
		return saida;
	}
	
	/**
	 * Retorna a Representação String da Disciplina.
	 * A representação segue o formato:
	 * "Disciplina HorasDeEstudo Media NotasDasProvas"
     *
     * @return String.
     */
	public String disciplinaToString(String nomeDisciplina) {
		String saida = null;
		for (int i = 0; i < numDeDisciplinas -1; i++) {
			if (disciplinasCadastradas[i].getNome().equals(nomeDisciplina)) {
				saida = disciplinasCadastradas[i].toString();
			}
		}
		return saida;
	}
	
	// Cantina
	
	/**
	 * Não retorna algum valor (Void).
     * Cadastra uma nova Cantina, com 0 Itens comprados, e 0 dividas.
     *
     * @param contaCantina[]: Lista de Cantinas cadastradas.
     * @param numContaCantina: Posição da Cantina específica.
     */
	public void cadastraCantina(String nomeCantina) {
		this.contaCantina[numContaCantina-1] = new ContaCantina(nomeCantina);
		this.numContaCantina += 1;
		ContaCantina[] contaCantinaAux = Arrays.copyOf(contaCantina, numContaCantina);
		contaCantina = contaCantinaAux;
	}
	
	/**
	 * Não retorna algum valor (Void).
     * Cadastra valores e quantidade de um Item qualquer.
     *
     * @param contaCantina[i]: Determinada Cantina.
     */
	public void cadastraLanche(String nomeCantina, int qtdItens, int valorCentavos) {
		for (int i = 0; i < numContaCantina -1; i++) {
			if (contaCantina[i].getNome().equals(nomeCantina)) {
				contaCantina[i].cadastraLanche(qtdItens, valorCentavos);
				break;
			}
		}
	}
	
	/**
	 * Não retorna algum valor (Void).
     * Cadastra Itens comprados na Cantina,
     * com seus respectivos valores e quantidade.
     *
     * @param contaCantina[i]: Determinada Cantina.
     */
	public void cadastrarLanche(String nomeCantina, int qtdItens, int valorCentavos, String detalhes) {
		for (int i = 0; i < numContaCantina -1; i++) {
			if (contaCantina[i].getNome().equals(nomeCantina)) {
				contaCantina[i].cadastrarLanche(qtdItens, valorCentavos, detalhes);
				break;
			}
		}
	}
	
	/**
	 * Não retorna algum valor (Void).
     * Paga conta de Determinada Cantina.
     *
     * @param contaCantina[i]: Determinada Cantina.
     */
	public void pagarConta(String nomeCantina, int valorCentavos) {
		for (int i = 0; i < numContaCantina -1; i++) {
			if (contaCantina[i].getNome().equals(nomeCantina)) {
				contaCantina[i].pagaConta(valorCentavos);
				break;
			}
		}
	}
	
	/**
	 * Retorna a Representação String detalhada da Conta Cantina.
	 * A representação segue o formato:
	 * "Item1 Item2 Item3 Item4 Item5".
     *
     * @return String.
     */
	public String listarDetalhes(String nomeCantina) {
		String saida = null;
		for (int i = 0; i < numContaCantina -1; i++) {
			if (contaCantina[i].getNome().equals(nomeCantina)) {
				saida = contaCantina[i].listarDetalhes();
				break;
			}
		}
		return saida;
	}
	
	/**
	 * Retorna a Representação String da Conta Cantina.
	 * A representação segue o formato:
	 * "Cantina QuantidadeDeItens DividaEmCentavos"
     *
     * @return String.
     */
	public String cantinaToString(String nomeCantina) {
		String saida = null;
		for (int i = 0; i < numContaCantina -1; i++) {
			if (contaCantina[i].getNome().equals(nomeCantina)) {
				saida = contaCantina[i].toString();
				break;
			}
		}
		return saida;
	}
	
	// Saude
	
	Saude saude = new Saude();
	/**
	 * Não retorna algum valor (Void).
     * Define Saude Mental.
     *
     * @param contaCantina[i]: Determinada Cantina.
     */
	public void defineSaudeMental(String valor) {
		saude.defineSaudeMental(valor);
	}
	
	/**
	 * Não retorna algum valor (Void).
     * Define Saude Física.
     *
     */
	public void defineSaudeFisica(String valor) {
		saude.defineSaudeFisica(valor);
	}
	
	/**
	 * Retorna a representação String da situação de Saúde.
	 * A representação segue o formato:
	 * “boa”, "Ok" ou "fraca".
	 * Ou no formato Emoji.
     *
     * @return String.
     */
	public String geral() {
		return saude.geral();
	}
	
	/**
	 * Não retorna algum valor (Void).
     * Define Saude com Emoji.
     *
     */
	public void definirEmoji(String valor) {
		saude.definirEmoji(valor);
	}
}
