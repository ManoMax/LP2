package Classes;

public class Colecao {
	
	private Blueray[] colecao;
	
	private String titulo;
	private String blueray;
	
	private int epsodiosCadastrados;
	
	private String popularidade;
	private int contador;
	
	public Colecao(String titulo, int episodios) {
		this.titulo = titulo;
		colecao = new Blueray[episodios];
		this.epsodiosCadastrados = 0;
		this.popularidade = "POUCO POPULAR";
		this.contador = 0;
	}
	
	public String duracaoTotal() {
		int tempo = 0;
		for (int i = 0; i < colecao.length; i++) {
			tempo += colecao[i].duracaoBlueray();
		}
		return "Duração Total: " + tempo + " minutos.";
	}
	
	public void adicionaBlueray(String titulo, int duracao) {
		colecao[epsodiosCadastrados] = new Blueray(titulo, duracao);
		this.epsodiosCadastrados += 1;
	}
	
	public String listaBluray(String titulo) {
		for (int i = 0; i < colecao.length; i++) {
			if (colecao[i].getTitulo().equals(titulo)) {
				return colecao[i].toString();
			}
		} return "null";
	}
	
	@Override
	public String toString() {
		return this.titulo + " - " + this.epsodiosCadastrados;
	}
	
	public void alugarColecao(String titulo) {
		this.contador += 1;
		if (contador > 10 && contador <= 30) {
			this.popularidade = "POPULAR";
		} else if (contador > 30) {
			this.popularidade = "MUITO POPULAR";
		}
	}

	public String getPopularidade() {
		return this.titulo + " alugado " + this.contador + " vezes. " + this.popularidade;
	}
	
	public String popularidadeEpisodio() {
		String saida = "";
		for (int i = 0; i < colecao.length; i ++) {
			if (colecao[i] != null) {
			saida += colecao[i].getPopularidadeBlue() + "\n";
			}
		}
		return saida;
	}
}	
