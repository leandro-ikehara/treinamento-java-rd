package br.com.rd.queroserdev.sobrecarga;

/* 1. Crie um novo pacote chamado sobrecarga 
 * 2. Crie uma classe Pessoa com os atributos: codigo, nome, idade 
 * 3. Crie um método exibir que imprima na tela todos os valores dos atributos */

public class Pessoa {
	private int codigo;
	private String nome;
	private int idade;
	
/* 5. Crie um construtor padrão para a classe pessoa. Este construtor deverá exibir a 
 * mensagem “Construtor Padrão”. Em seguida crie uma classe TestaPessoa que instancie 
 * um objeto utilizando o construtor padrão; */

	public Pessoa() {
		System.out.println("Construtor Padrão");
		
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
	
/* 4. Crie uma sobrecarga do método exibir que receba como parâmetro um número inteiro e 
 * decida por meio desse parâmetro se a idade será exibida ou não. Critério:
 * • Se o valor do parâmetro for igual a 1, imprima a idade e os valores dos demais	atributos;
 * • Senão não imprima a idade mas imprima os valores dos demais atributos. */

	public void exibirAtributos(int codigo, String nome, int idade) {
		this.codigo = codigo;
		this.nome = nome;
		this.idade = idade;
	}
	
	public String exibir() {
		return "Código: " + this.codigo +
				"\nNome: " + this.nome +
				"\nIdade: " + this.idade + " anos";
	}
	
	public String exibir(int numeroInteiro) {
		if(numeroInteiro == 1) {
			return "Código: " + this.codigo + 
					"\nNome: " + this.nome +
					"\nIdade: " + this.idade + " anos";
		} else {
			return "Código: " + this.codigo + 
					"\nNome: " + this.nome;
		}
		
	}
	
}
