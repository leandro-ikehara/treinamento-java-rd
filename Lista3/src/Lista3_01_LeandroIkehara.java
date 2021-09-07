import java.util.*;

// 1. Criar um programa que receba uma palavra e imprima no console letra por letra.

public class Lista3_01_LeandroIkehara {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Digite uma palavra ou uma frase e aperte Enter: ");
		String palavra = s.nextLine();

		for (int i = 0; i < palavra.length(); i++) {

			System.out.println(palavra.charAt(i));

		}
		s.close();
	}
}