package prova;

public class Main {

	public static void main(String[] args) {
		Academia academia = new Academia("Atlante");
		academia.adicionaExercicio(new Exercicio("Nadar", 100));
		academia.adicionaExercicio(new Exercicio("Correr", 100));
		academia.adicionaExercicio(new Exercicio("Voar", 8000));
		academia.adicionaExercicio(new Exercicio("Parar", 20));
		
		System.out.println(academia.listaExercicios());
	}

}
