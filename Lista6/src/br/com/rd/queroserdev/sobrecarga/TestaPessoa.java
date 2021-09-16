package br.com.rd.queroserdev.sobrecarga;

/* 5. Crie uma classe TestaPessoa que instancie um objeto utilizando o construtor padr�o; 
 * 6. Ainda na classe TestaPessoa, inicialize os atributos codigo, nome e idade e acione o 
 * m�todo exibir sem nenhum par�metro. Repita a opera��o com valores diferentes e 
 * execute o m�todo exibir passando um par�metro (teste com as duas situa��es, valor igual 
 * a 1 e diferente de 1); 
 * 7. Crie um construtor sobrecarregado que permita instanciar um objeto passando os tr�s 
 * par�metros de uma s� vez; 
 * 8. Na classe TestaPessoa, instancie um objeto passando par�metros para que o construtor 
 * fa�a as chamadas aos dois m�todos exibir com todas as situa��es poss�veis.*/

public class TestaPessoa {
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		System.out.println("\n-- Atributos inicializados imprimindo 'exibir' sem par�metro --");
		pessoa.exibirAtributos(0, "Leandro", 38);
		System.out.println("-----------------------------------------------------------------");
		System.out.println(pessoa.exibir());
		
		Pessoa pessoa2 = new Pessoa();
		
		pessoa2.exibirAtributos(1, "Donatello", 40);
		System.out.println("-----------------------------------------------------------------");
		System.out.println(pessoa2.exibir(0));
		System.out.println("-----------------------------------------------------------------");
		System.out.println(pessoa2.exibir(1));
		
		Pessoa pessoa3 = new Pessoa();
		
		pessoa3.exibirAtributos(2, "Michelangelo", 35);
		System.out.println("-----------------------------------------------------------------");
		System.out.println(pessoa3.exibir(0));
		System.out.println("-----------------------------------------------------------------");
		System.out.println(pessoa3.exibir(1));
		System.out.println("-----------------------------------------------------------------");
		System.out.println(pessoa3.exibir());
		
	}

}
