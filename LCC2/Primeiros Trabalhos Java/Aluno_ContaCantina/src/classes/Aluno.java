/**
* Laboratório de Programação 2 - Lab 1
*
* @author Gabriel Max Vieira Matos - 117110060
*/

package classes;

import java.util.Arrays;

public class Aluno {
	
	private String nomeAluno;
	private String status;
	private String periodo;
	private String emblema;
	private String base;
	private int veracidade;
	private int quantidadeDeCla;
	
	private ContaLaboratorio[] contaLab;
	private int x;
	
	/**
	 * Registra um Aluno.
	 * Estabelece seu nome, de acordo com o parâmetro.
	 * Torna o Status, Emblema e Base padrão.
	 * Define Veracidade e QuantidadeDeClãs igual a 0.
	 * Instancia x e contaLab.
	 *
	 * @param nomeAluno: Nome do aluno.
	 * @param status: Curso/Série.
	 * @param emblema: Adjetivo comprado com Canetas(Moedas).
	 * @param veracidade: Taxa de Aprovação de outros usuários.
	 * @param quantidadeDeCla: Número de grupos educacionais envolvidos.
	 * @parem x: Número de ContasLab registradas.
	 * @parem contaLab: Contas Laboratório.
	 */
	public Aluno(String nome) {
		this.nomeAluno = nome;
		this.status = "-";
		this.emblema = "-";
		this.base = "-";
		this.veracidade = 0;
		this.quantidadeDeCla = 0;
		this.x = 1;
		this.contaLab = new ContaLaboratorio[x];
	}
	
	public void cadastraCurso(String status) {
		this.status = status;
	}
	
	public void cadastraPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
	/**
	 * Não retorna algum valor (Void).
     * Registra mais uma Conta Laboratório, com 2000 mb, na Lista.
     *
     * @param contaLab: Lista de Conta Lab.
     */
	public void cadastraLaboratorio(String nomeLaboratorio) {
		this.contaLab[x-1] = new ContaLaboratorio(nomeLaboratorio);
		this.x += 1;
		ContaLaboratorio[] contaLabAux = Arrays.copyOf(contaLab, x);
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
		this.contaLab[x-1] = new ContaLaboratorio(nomeLaboratorio, cota);
		this.x += 1;
		ContaLaboratorio[] contaLabAux = Arrays.copyOf(contaLab, x);
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
	public void cadastraDisciplina(String nomeDisciplina) {
		Disciplina dis = new Disciplina(nomeDisciplina);
	}
	
	public void cadastraHoras(String nomeDisciplina, int horas) {
		Disciplina dis = new Disciplina(nomeDisciplina);
		dis.cadastraHoras(horas);
	}
	
	public void cadastraNota(String nomeDisciplina, int nota, double valorNota) {
		Disciplina dis = new Disciplina(nomeDisciplina);
		dis.cadastraNota(nota, valorNota);
	}
	
	public boolean aprovado(String nomeDisciplina) {
		Disciplina dis = new Disciplina(nomeDisciplina);
		return dis.aprovado();
	}
	
	public String disciplinaToString(String nomeDisciplina) {
		Disciplina dis = new Disciplina(nomeDisciplina);
		return dis.toString();
	}
	
	public void cadastraCantina(String nomeDisciplina) {
		ContaCantina cant = new ContaCantina(nomeDisciplina);
	}
	
	public void cadastraLanche(String nomeDisciplina, int qtdItens, int valorCentavos) {
		ContaCantina cant = new ContaCantina(nomeDisciplina);
		cant.cadastrarLanche(qtdItens, valorCentavos, nomeDisciplina);
	}
	
	public void pagarConta(String nomeDisciplina, int valorCentavos) {
		ContaCantina cant = new ContaCantina(nomeDisciplina);
		cant.pagaConta(valorCentavos);
	}
	
	public String cantinaToString(String nomeDisciplina) {
		ContaCantina cant = new ContaCantina(nomeDisciplina);
		return cant.listarDetalhes();
	}
	
	// Saude
	Saude sd = new Saude();
	public void defineSaudeMental(String valor) {
		sd.defineSaudeMental(valor);
	}
	
	public void defineSaudeFisica(String valor) {
		sd.defineSaudeFisica(valor);
	}
	
	public String geral() {
		return sd.geral();
	}

}
