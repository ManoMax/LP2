/**
* Laboratório de Programação 2 - Lab 1
*
* @author Gabriel Max Vieira Matos - 117110060
*/

package classes;

public class ContaCantina {
	
	private String cantina;
	
	private int cents;
	
	private int quantidade;
	
	private int posicao;
	
	private String[] detalhes = new String[5];
	
	/**
     * Constrói uma Conta Cantina, a partir de seu nome.
     * Toda Conta Cantina começa com o nome recebido no parâmetro.
     *
     * @param cantina: Nome do Cantina.
     */
	public ContaCantina(String cantina) {
		this.cantina = cantina; 
	}
	
	/**
	 * Não retorna algum valor (Void).
     * Acrescenta quantidade e preços do lanche(Centavos).
     *
     * @param quantidade: Quantidade de Lanches.
     * @param cents: Centavos.
     */
	public void cadastraLanche(int quantidade, int cent) {
		this.quantidade += quantidade;
		this.cents += cent;
	}
	
	/**
	 * Não retorna algum valor (Void).
     * Acrescenta quantidade e preços do lanche(Centavos).
     *
     * @param quantidade: Quantidade de Lanches.
     * @param cents: Centavos.
     */
	public void pagaConta(int pagamento) {
		this.cents -= pagamento;
	}
	
	/**
	 * Retorna a String que representa a Conta Cantina.
     * A representação segue o formato:
     * "NomeDaCantina QuantidadeDeLanche Dividas(Em Centavos).
     *
     * @returns a representação em String de um aluno.
     */
	@Override
	public String toString() {
		String saida = cantina + " " + quantidade + " " + cents;
		return saida;
	}
	
	/**
	 * Não retorna algum valor (Void).
     * Acrescenta quantidade e preços do lanche(Centavos),
     * além de fornecer detalhes sobre o lanche.
     *
     * @param lanche: Detalhes sobre o lanche.
     * @param quantidade: Quantidade de Lanches.
     * @param cents: Centavos.
     */
	public void cadastrarLanche(int qtdItens, int valorCentavos, String detalhes) {
		this.detalhes[posicao] = detalhes;
		this.posicao += 1;
		if (posicao == 5) posicao = 0;
		this.cents = valorCentavos;
		this.quantidade = qtdItens;
	}
	
	/**
	 * Retorna a String que representa Detalhes de pedidos.
     * A representação segue o formato dos 5 ultimos pedidos.
     * (Sem ordem de pedidos).
     *
     * @returns a representação em String dos 5 últimos detalhes.
     */
	public String listarDetalhes() {
		String saida = "";
		for (int i = 0; i < 5; i++) {
			saida += detalhes[i] + " ";
		};
		String nSaida = saida.trim();
		return nSaida;
	}
	
}
