package prova;

public class Exercicio {
	private String nome;
	private int caloriaGasta;
	
	public Exercicio(String nome, int caloriaGasta) {
		this.nome = nome;
		this.caloriaGasta = caloriaGasta;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getCaloriaGasta() {
		return this.caloriaGasta;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exercicio other = (Exercicio) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	public String toString() {
		return this.nome + "- " + this.caloriaGasta + " cal/h";
	}
	
}
