package br.com.rd.queroserdev.encapsulamento;

public class Elevador {
	private int andarAtual;
	private int totalAndares;
	private int capacidade;
	private int totalPessoas;
	
	public Elevador(int capacidade, int totalAndares) {
		if (capacidade <= 0 && totalAndares <= 0) {
			System.out.println("O elevador começa no térreo vazio.");
		} else {
			this.andarAtual = 0;
			this.totalPessoas = 0;
			this.capacidade = capacidade;
			this.totalAndares = totalAndares;
		}
	}
	
	public void entrar() {
		if (this.capacidade <= 0) {
			System.out.println("Entre no elevador");
		} else if (this.totalPessoas < this.capacidade) {
			this.totalPessoas = totalPessoas + 1;
		} else {
			System.out.println("Elevador lotado.");
		}
	}
	
	public void sair() {
		if (this.totalPessoas > 0) {
			this.totalPessoas = totalPessoas + 1;
		} else {
			System.out.println("Elevador vazio.");
		}
	}
	
	public void subir() {
		if (andarAtual < totalAndares) {
			this.andarAtual = andarAtual + 1;
		} else {
			System.out.println("Esse é o último andar.");
		}
	}
	
	public void descer() {
		if (andarAtual > 0) {
			this.andarAtual--;
		} else {
			System.out.println("Estamos no térreo.");
		}
	}
	
	public int getTotalAndares() {
		return totalAndares;
	}
	
	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}
	
	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getTotalPessoas() {
		return totalPessoas;
	}	
	
	public int getAndarAtual() {
		return andarAtual;
	}

	
	public static void main(String[] args) {
		Elevador elevador = new Elevador(30, 10);
		
		elevador.sair();
		
		for (int i = 1; i <= elevador.getCapacidade(); i++) {
			elevador.entrar();
		}
		
		elevador.entrar();
		elevador.descer();
		elevador.subir();
		elevador.sair();
		
		System.out.println(elevador.getTotalPessoas());
		System.out.println(elevador.getCapacidade());
		System.out.println(elevador.getAndarAtual());
		System.out.println(elevador.getTotalAndares());
		
	}
}
