package prova;

public class Academia {
	private String nome;
	private int quantidadExercicios = 4;
	private Exercicio[] exercicios = new Exercicio[4];
	private int exerciciosAdicionados = 0;
	
	public Academia(String nome) {
		this.nome = nome;
	}
	
	public Academia(String nome, int quantidaExercicios) {
		this.nome = nome;
		this.quantidadExercicios = quantidadExercicios;
		this.exercicios = new Exercicio[this.quantidadExercicios];
	}
	
	public boolean analisaSePodeAdicionarMais() {
		return this.exerciciosAdicionados < this.quantidadExercicios;
	}
	
	public boolean adicionaExercicio(Exercicio exercicio) {
		if(analisaSePodeAdicionarMais()) {
			this.exercicios[this.exerciciosAdicionados] = exercicio;
			this.exerciciosAdicionados++;
			return true;
		}
		return false;
	}
	
	public String[] listaExercicios() {
		String[] lista = new String[this.exerciciosAdicionados];
		for(int i = 0; i < this.exerciciosAdicionados; i++) {
			lista[i] = String.format("%d - %s", (i + 1), this.exercicios[i].toString());
		}
		return lista;
	}
	
	public boolean analisaNomeInvalido(String nome) {
		for(Exercicio x : this.exercicios) {
			if(x.getNome().equals(nome)) {
				return true;
			}
		}
		return false;
	}
	
	public int calcularCalorias(String[] nomeExercicio, int horas) {
		int totalCalorias = 0;
		for(int i = 0; i < this.exerciciosAdicionados; i++) {
			if(!analisaNomeInvalido(nomeExercicio[i])) {
				throw new IllegalArgumentException("Erro");
			}
			for(int j = 0; j < nomeExercicio.length; j++) {
				if(this.exercicios[i].getNome().equals(nomeExercicio[j])) {
					totalCalorias +=this.exercicios[i].getCaloriaGasta();
					break;
				}
			}
		}
		return totalCalorias * horas;
	}
	
}
