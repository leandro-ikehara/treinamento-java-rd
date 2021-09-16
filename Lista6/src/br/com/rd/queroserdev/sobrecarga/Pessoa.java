package br.com.rd.queroserdev.sobrecarga;

/* 1. Crie um novo pacote chamado sobrecarga 
 * 2. Crie uma classe Pessoa com os atributos: codigo, nome, idade 
 * 3. Crie um m�todo exibir que imprima na tela todos os valores dos atributos */

public class Pessoa {
	private int codigo;
	private String nome;
	private int idade;
	
/* 5. Crie um construtor padr�o para a classe pessoa. Este construtor dever� exibir a 
 * mensagem �Construtor Padr�o�. Em seguida crie uma classe TestaPessoa que instancie 
 * um objeto utilizando o construtor padr�o; */

	public Pessoa() {
		System.out.println("Construtor Padr�o");
		
	}
			
	public Pessoa(int codigo, String nome, int idade) {
		this.codigo = codigo;
		this.nome = nome;
		this.idade = idade;
	}


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
/* 4. Crie uma sobrecarga do m�todo exibir que receba como par�metro um n�mero inteiro e 
 * decida por meio desse par�metro se a idade ser� exibida ou n�o. Crit�rio:
 * � Se o valor do par�metro for igual a 1, imprima a idade e os valores dos demais	atributos;
 * � Sen�o n�o imprima a idade mas imprima os valores dos demais atributos. */

	public void exibirAtributos(int codigo, String nome, int idade) {
		this.codigo = codigo;
		this.nome = nome;
		this.idade = idade;
	}
	
	public String exibir() {
		return "C�digo: " + this.codigo +
				"\nNome: " + this.nome +
				"\nIdade: " + this.idade + " anos";
	}
	
	public String exibir(int numeroInteiro) {
		if(numeroInteiro == 1) {
			return "C�digo: " + this.codigo + 
					"\nNome: " + this.nome +
					"\nIdade: " + this.idade + " anos";
		} else {
			return "C�digo: " + this.codigo + 
					"\nNome: " + this.nome;
		}
		
	}
	
}
