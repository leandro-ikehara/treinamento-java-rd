package br.com.rd.queroserdev.encapsulamento;

import java.util.*;

/*2. Crie uma classe agenda para armazenar 10 pessoas e seja capaz de realizar as seguintes 
 * operações:
 * • void armazenarPessoa(String nome, int idade, float altura);
 * • void removerPessoa(String nome);
 * • int buscaPessoa(String nome); // Informa em qual posição da Agenda está a pessoa.
 * • void imprimirPessoa(int indice); // imprime os dados da pessoa que está na posição indicada 
 * pelo índice.*/


public class Agenda {

	private Pessoa agenda[];
	

	public Agenda(int capacidadeAgenda) {
		if (capacidadeAgenda <= 0 && capacidadeAgenda >=10) {
			System.out.println("A capacidade da agenda é de apenas 10 contatos");
		} else {
			this.agenda = new Pessoa[capacidadeAgenda];
		}
	}

	public Pessoa[] getAgenda() {
		return agenda;
	}
	
	// Armazenar dados de contato na variável
	public void armazenarPessoa(String nome, int idade, double altura) {
		for (int i = 0; i < this.agenda.length; i++) {
			if (this.agenda[i] == null) {
				this.agenda[i] = new Pessoa(nome, idade, altura);
				break;
			} else if (i == this.agenda.length-1 && this.agenda[i] != null) {
				System.out.println("Agenda lotada! Remova um contato para inserir um novo.");
			}
		}
	}
	
	// Remover contato da Agenda
	public void removerPessoa(String nome) {
		boolean removeContato = false;
		for (int i = 0; i < this.agenda.length; i++) {
			if (nome == this.agenda[i].getNome()) {
				this.agenda[i] = null;
				removeContato = true;
				break;
			}
		}
		if (removeContato == false) {
			System.out.println("Contato não encontrado");
		}
	}

	
	// Buscar contato na Agenda
	
	public int buscaPessoa(String nome) {
		int i = 0;
		boolean buscarContato = false;
		do {
			if (this.agenda[i] == null) {
				i++;
			} else if (this.agenda[i].getNome() != nome) {
				i++;
			} else if (this.agenda[i].getNome() == nome) {
				buscarContato = true;
				break;
			}
		} while (i < this.agenda.length);
		
		if (buscarContato == true) {
			return i;
		} else {
			System.out.println("Contato não encontrado");
			return -1;
		}
	}
	 
	// Exibir o contato da Agenda	
	public void imprimirPessoa(int indice) {
		if (this.agenda[indice] == null) {
			System.out.println("Posição vazia");
		} else {
			System.out.println(this.agenda[indice].getDados());
		}
	}
	
public static void main(String[] args) {
	Agenda agenda = new Agenda(10);
	
	agenda.armazenarPessoa("Leandro", 38, 1.70);
	agenda.armazenarPessoa("Isabella", 27, 1.55);
	agenda.armazenarPessoa("Ivo", 40, 1.72);
	agenda.armazenarPessoa("Natália", 30, 1.73);
	agenda.armazenarPessoa("Eliel", 31, 1.82);
	agenda.armazenarPessoa("Leonardo", 25, 1.71);
	agenda.armazenarPessoa("Jonas", 28, 1.65);
	agenda.armazenarPessoa("Bruna", 21, 1.55);
	agenda.armazenarPessoa("Maria", 27, 1.65);
	agenda.armazenarPessoa("Ana Paula", 31, 1.56);
	
	// Exibir contatos da Agenda
	System.out.println("------ Exibir Contato ---------");
	agenda.imprimirPessoa(0);
	System.out.println("---------------");
	agenda.imprimirPessoa(2);
	System.out.println("---------------");
	agenda.imprimirPessoa(1);
	System.out.println("---------------");
	agenda.imprimirPessoa(5);
	System.out.println("--------------- \n");
	
	// Remover contatos da Agenda
	System.out.println("-------- Remover Contato --------");
	agenda.removerPessoa("Bruna");
	System.out.println(agenda.buscaPessoa("Bruna"));
	System.out.println("---------------");
	System.out.println(agenda.buscaPessoa("Ana Paula"));
	System.out.println("--------------- \n");
		
}

}