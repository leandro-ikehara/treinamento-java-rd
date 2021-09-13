package br.com.rd.queroserdev.encapsulamento;

/* 1. Crie uma classe que represente uma pessoa, com os atributos privados de nome, idade e altura. 
 * Crie os métodos de acesso para esses atributos e também um método para imprimir na tela 
 * os dados de uma pessoa. */


public class Pessoa {
		private String nome;
		private int idade;
		private double altura;
		
		public Pessoa() {
			
		}
				
		public Pessoa(String nome, int idade, double altura) {
			this.nome = nome;
			this.idade = idade;
			this.altura = altura;
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
		
		public double getAltura() {
			return altura;
		}
		
		public void setAltura(double altura) {
			this.altura = altura;
		}
		
		public String getDados() {
			return "Nome: " + this.nome + "\n"
					+ "Idade: " + this.idade + " anos" + "\n"
					+ "Altura: " + this.altura + "m";
		}
		
		
		public static void main(String[] args) {
			Pessoa pessoa = new Pessoa();
			
			pessoa.nome = "Leandro";
			pessoa.idade = 38;
			pessoa.altura = 1.65;
						
			System.out.printf("Nome: " + pessoa.nome + "\nIdade: " + pessoa.idade 
					+ "\nAltura: " + pessoa.altura + "m"); 
		}
		
}
