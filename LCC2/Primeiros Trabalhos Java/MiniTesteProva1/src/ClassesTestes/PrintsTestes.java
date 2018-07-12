package ClassesTestes;

import Classes.Colecao;

public class PrintsTestes {

	public static Colecao[] serie = new Colecao[100];
	
	public static void main(String[] args) {
		
	// Teste Criando Série e Adicionando Episodio.
	serie[0] = new Colecao("The Walking Dead", 10);
	serie[0].adicionaBlueray("Episodio I", 58);
	System.out.println(serie[0].listaBluray("Episodio I")); 
	
	serie[0].adicionaBlueray("Episodio II", 42);
	System.out.println(serie[0].listaBluray("Episodio II"));
	
	for (int i = 0; i < 100; i++) {
		if (serie[i] != null) {
			System.out.println(serie[i].getPopularidade());

			}
		}
	System.out.println(serie[0].popularidadeEpisodio());
	
	}
}