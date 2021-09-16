package br.com.rd.queroserdev.sobrecarga;

/* 5. Crie uma classe TestaPessoa que instancie um objeto utilizando o construtor padrão; 
 * 6. Ainda na classe TestaPessoa, inicialize os atributos codigo, nome e idade e acione o 
 * método exibir sem nenhum parâmetro. Repita a operação com valores diferentes e 
 * execute o método exibir passando um parâmetro (teste com as duas situações, valor igual 
 * a 1 e diferente de 1); 
 * 7. Crie um construtor sobrecarregado que permita instanciar um objeto passando os três 
 * parâmetros de uma só vez; 
 * 8. Na classe TestaPessoa, instancie um objeto passando parâmetros para que o construtor 
 * faça as chamadas aos dois métodos exibir com todas as situações possíveis.*/

public class TestaPessoa {
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		System.out.println("\n-- Atributos inicializados imprimindo 'exibir' sem parâmetro --");
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
