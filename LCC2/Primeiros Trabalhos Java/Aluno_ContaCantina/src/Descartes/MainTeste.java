package Descartes;

import java.util.Arrays;

import classes.Aluno;
import classes.Disciplina;

public class MainTeste {

	public static void main(String[] args) {
		  //Mais Notas na Disciplina
        Disciplina grafos = new Disciplina("Grafos", 6, new int[] {1, 1, 2, 2, 2, 2});
        grafos.cadastraHoras(10);
        grafos.cadastraNota(1, 9);
        grafos.cadastraNota(2, 10);
        grafos.cadastraNota(3, 8);
        grafos.cadastraNota(4, 8);
        grafos.cadastraNota(5, 6);
        grafos.cadastraNota(6, 9);
        System.out.println(grafos.aprovado());
        System.out.println(grafos.toString());
		
		// Nível de Saúde Mental:
        saude.definirEmoji("<(^_^<)");
        System.out.println(saude.geral());
        saude.defineSaudeFisica("fraca");
        System.out.println(saude.geral());
        
	    // Aluno
        	// ContaLaboratorio
		    Aluno aluno = new Aluno("Gabriel Max");
		    aluno.cadastraLaboratorio("LCC1", 5000);
		    aluno.consomeEspaco("LCC1", 500);
		    System.out.println(aluno.laboratorioToString("LCC1"));
		    aluno.liberaEspaco("LCC1", 250);
		    System.out.println(aluno.atingiuCota("LCC1"));
		    System.out.println(aluno.laboratorioToString("LCC1"));
		    
		    aluno.cadastraLaboratorio("LCC2");
		    aluno.consomeEspaco("LCC2", 420);
		    System.out.println(aluno.laboratorioToString("LCC2"));
		    aluno.consomeEspaco("LCC2", 5400);
		    System.out.println(aluno.atingiuCota("LCC2"));
		    System.out.println(aluno.laboratorioToString("LCC2"));
		    aluno.consomeEspaco("LCC1", 250);
		    System.out.println(aluno.laboratorioToString("LCC1"));
		    
		    
		    // Disciplina
		    aluno.cadastraDisciplina("LCC1");
		    aluno.cadastraHoras("LP2", 5);
		    aluno.cadastraNota("LP2", 1, 10.0);
		    System.out.println(aluno.aprovado("LP2"));
		    System.out.println(aluno.disciplinaToString("LP2"));
		    
		    // Cantina
		    aluno.cadastraCantina("LP2");
		    aluno.cadastraLanche("Sempre Frango Empanado", 4, 200);
		    aluno.pagarConta("LP2", 100);
		    System.out.println(aluno.cantinaToString("LP2"));
		    
		    // Saude
		    aluno.defineSaudeMental("boa");
		    aluno.defineSaudeFisica("boa");
		    System.out.println(aluno.geral());
		
		

	}

}
