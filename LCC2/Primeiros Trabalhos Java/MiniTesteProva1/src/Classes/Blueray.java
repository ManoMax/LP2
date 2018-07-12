package Classes;

public class Blueray {

	private String titulo;
	private String popularidade;
	
	private int duracao;
	private int contador;
	
	
	public Blueray(String titulo, int duracao) {
		this.titulo = titulo;
		this.duracao = duracao;
		this.contador = 0;
		this.popularidade = "POUCO POPULAR";
	}
	
	@Override
	public String toString() {
		return this.titulo + " " + this.duracao + " minutos.";
	}

	public int duracaoBlueray() {
		return this.duracao;
	}

	public String getTitulo() {
		return this.titulo;
	}
	
	public void alugarBlueray(String titulo) {
		this.contador += 1;
		if (contador > 10 && contador <= 30) {
			this.popularidade = "POPULAR";
		} else if (contador > 30) {
			this.popularidade = "MUITO POPULAR";
		}
	}
	
	public String getPopularidadeBlue() {
		return this.titulo + " alugado " + this.contador + " vezes. " + this.popularidade;
	}
}
