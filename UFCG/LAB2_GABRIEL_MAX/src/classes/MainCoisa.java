/**
* Laboratório de Programação 2 - Lab 1
*
* @author Gabriel Max Vieira Matos - 117110060
*/

package classes;

/** 
 * Representação de uma Main do Programa COISA.
 * Planejado, inicialmente como padrão funcional do Projeto de LP2.
 * 
 * @author Gabriel Max
 */
public class MainCoisa {

	public static void main(String[] args) {
		
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
        Disciplina prog2 = new Disciplina("PROGRAMACAO 2");
        prog2.cadastraHoras(4);
        prog2.cadastraNota(1, 5.0);
        prog2.cadastraNota(2, 6.0);
        prog2.cadastraNota(3, 7.0);
        System.out.println(prog2.aprovado());
        prog2.cadastraNota(4, 10.0);
        System.out.println(prog2.aprovado());
        System.out.println(prog2.toString());
       
        ContaCantina mulherDoBolo = new ContaCantina("Mulher do Bolo");            
        mulherDoBolo.cadastraLanche(2, 500);
        mulherDoBolo.cadastraLanche(1, 500);
        mulherDoBolo.pagaConta(200);
        System.out.println(mulherDoBolo.toString());
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
	}		
}
