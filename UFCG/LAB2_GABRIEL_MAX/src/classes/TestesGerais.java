package classes;

/** 
 * Representação de uma Main de Testes de funções implementadas do Projeto COISA.
 * Possui o padrão funcional de LP2, mais novos testes dessa implementações.
 * 
 * @author Gabriel Max
 */

public class TestesGerais {

	public static void main(String[] args) {

		// Conta de um Laboratório:
		ContaLaboratorio contaLCC2 = new ContaLaboratorio("LCC2");
        contaLCC2.consomeEspaco(1999);
        System.out.println(contaLCC2.atingiuCota());
        contaLCC2.consomeEspaco(2);
        System.out.println(contaLCC2.atingiuCota());
        contaLCC2.liberaEspaco(1);
        System.out.println(contaLCC2.atingiuCota());
        contaLCC2.liberaEspaco(1);
        System.out.println(contaLCC2.atingiuCota());
        System.out.println(contaLCC2.toString());
        System.out.println("\n");
        
        // Disciplina:
        Disciplina prog2 = new Disciplina("PROGRAMACAO 2");
        prog2.cadastraHoras(4);
        prog2.cadastraNota(1, 5.0);
        prog2.cadastraNota(2, 6.0);
        prog2.cadastraNota(3, 7.0);
        System.out.println(prog2.aprovado());
        prog2.cadastraNota(4, 10.0);
        System.out.println(prog2.aprovado());
        System.out.println(prog2.toString());
        System.out.println("\n");
        
        //Notas na Disciplina com Pesos:
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
        System.out.println("\n");
        
        // Conta na Cantina:
        ContaCantina mulherDoBolo = new ContaCantina("Mulher do Bolo");            
        mulherDoBolo.cadastraLanche(2, 500);
        mulherDoBolo.cadastraLanche(1, 500);
        mulherDoBolo.pagaConta(200);
        System.out.println(mulherDoBolo.toString());
        System.out.println("\n");
        
        // Registro Detalhado de Lanches:
        mulherDoBolo.cadastrarLanche(2, 800, "Meio Frango Empanado");
        mulherDoBolo.cadastrarLanche(2, 800, "Feijoada");
        mulherDoBolo.cadastrarLanche(2, 800, "Arroz");
        mulherDoBolo.cadastrarLanche(2, 800, "X-Frango");
        mulherDoBolo.cadastrarLanche(2, 800, "Empada");
        System.out.println(mulherDoBolo.listarDetalhes());
        System.out.println("\n");
        
        // Sua saúde física e mental:
        Saude saude = new Saude();
        System.out.println(saude.geral());
        saude.defineSaudeMental("boa");
        saude.defineSaudeFisica("boa");
        System.out.println(saude.geral());
        saude.defineSaudeMental("fraca");
        saude.defineSaudeFisica("fraca");
        System.out.println(saude.geral());
        saude.defineSaudeMental("boa");
        saude.defineSaudeFisica("fraca");
        System.out.println(saude.geral());
        System.out.println("\n");
        
        // Nível de Saúde Mental por Emoji:
        saude.definirEmoji("<(^_^<)");
        System.out.println(saude.geral());
        saude.defineSaudeFisica("fraca");
        System.out.println(saude.geral());
        System.out.println("\n");
        
	    // Aluno:
	        
	        // Disciplina:
	        Aluno samuel = new Aluno("Samuel Lucas");
	        samuel.cadastraDisciplina("Matemática", 2, new int[] {6, 4});
	        samuel.cadastraNota("Matemática", 1, 10);
	        samuel.cadastraNota("Matemática", 2, 10);
	        System.out.println(samuel.aprovado("Matemática"));
		    System.out.println(samuel.disciplinaToString("Matemática"));
		    System.out.println("\n");
		    
	    	// ContaLaboratorio
		    Aluno aluno = new Aluno("Gabriel Max");
		    aluno.cadastraLaboratorio("LCC1", 5000);
		    aluno.consomeEspaco("LCC1", 500);
		    System.out.println(aluno.laboratorioToString("LCC1"));
		    aluno.liberaEspaco("LCC1", 250);
		    System.out.println(aluno.atingiuCota("LCC1"));
		    System.out.println(aluno.laboratorioToString("LCC1"));
		    System.out.println("\n");
		    
		    aluno.cadastraLaboratorio("LCC2");
		    aluno.consomeEspaco("LCC2", 420);
		    System.out.println(aluno.laboratorioToString("LCC2"));
		    aluno.consomeEspaco("LCC2", 580);
		    System.out.println(aluno.atingiuCota("LCC2"));
		    System.out.println(aluno.laboratorioToString("LCC2"));
		    aluno.consomeEspaco("LCC1", 250);
		    System.out.println(aluno.laboratorioToString("LCC1"));
		    System.out.println("\n");
		    
		    // Disciplina
		    aluno.cadastraDisciplina("Grafos");
		    aluno.cadastraHoras("Grafos", 15);
		    aluno.cadastraNota("Grafos", 1, 7.0);
		    System.out.println(aluno.aprovado("Grafos"));
		    System.out.println(aluno.disciplinaToString("Grafos"));
		    aluno.cadastraNota("Grafos", 2, 7.0);
		    aluno.cadastraNota("Grafos", 3, 7.0);
		    aluno.cadastraNota("Grafos", 4, 7.0);
		    System.out.println(aluno.aprovado("Grafos"));
		    System.out.println(aluno.disciplinaToString("Grafos"));
		    System.out.println("\n");
		    
		    aluno.cadastraDisciplina("Calculo I", 3, new int[] {4, 6, 10});
		    aluno.cadastraHoras("Calculo I", 10);
		    aluno.cadastraNota("Calculo I", 1, 9.5);
		    aluno.cadastraNota("Calculo I", 2, 8.0);
		    aluno.cadastraNota("Calculo I", 3, 10.0);
		    System.out.println(aluno.aprovado("Calculo I"));
		    System.out.println(aluno.disciplinaToString("Calculo I"));
		    System.out.println("\n");
		    
		    // Cantina
		    aluno.cadastraCantina("Amarelinha");
		    aluno.cadastraLanche("Amarelinha", 4, 400);
		    aluno.pagarConta("Amarelinha", 200);
		    System.out.println(aluno.cantinaToString("Amarelinha"));
		    System.out.println("\n");
		    
		    aluno.cadastraCantina("Neguinho");
		    aluno.cadastrarLanche("Neguinho", 1, 250, "Empada");
		    aluno.cadastrarLanche("Neguinho", 1, 100, "Suco");
		    aluno.cadastrarLanche("Neguinho", 1, 200, "Coxinha");
		    aluno.cadastrarLanche("Neguinho", 1, 100, "Chocolate");
		    aluno.pagarConta("Neguinho", 230);
		    System.out.println(aluno.cantinaToString("Neguinho"));
		    System.out.println(aluno.listarDetalhes("Neguinho"));
		    aluno.cadastrarLanche("Neguinho", 1, 100, "Café");
		    System.out.println(aluno.listarDetalhes("Neguinho"));
		    aluno.cadastrarLanche("Neguinho", 1, 100, "FrangoEmpanado");
		    System.out.println(aluno.listarDetalhes("Neguinho"));
		    System.out.println("\n");
	
		    // Saude
		    System.out.println(aluno.geral());
		    aluno.defineSaudeMental("boa");
		    aluno.defineSaudeFisica("boa");
		    System.out.println(aluno.geral());
		    aluno.defineSaudeFisica("fraca");
		    System.out.println(aluno.geral());
		    aluno.defineSaudeMental("fraca");
		    System.out.println(aluno.geral());
		    aluno.definirEmoji("<('-'<) <= Criei na horaa! :3");
		    System.out.println(aluno.geral());
		    System.out.println("\n");
	}
}