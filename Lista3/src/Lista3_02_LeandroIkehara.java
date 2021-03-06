import java.util.*;

/* 2. Faça um programa que contenha um array chamado A e que receba do usuário 6 valores inteiros. 
 * O programa deve executar os seguintes passos: 
 * 	- Atribuir os seguintes valores ao array: 1, 0, 5, -2, -5, 7. 
 * 	- Armazene em uma variável do tipo inteira a soma dos valores das seguintes posições do array: 
 * A[0], A[1] e A[5] mostre o valor desta soma na tela. 
 * 	- Mostre na tela cada elemento do array sendo um valor em cada linha. 
 * 		-Use somente uma instrução System.out.println para realizar este procedimento. */

public class Lista3_02_LeandroIkehara {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int A[] = new int[6];
		int soma = 0;

		for (int i = 0; i < A.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º número abaixo e pressione Enter: ");
			A[i] = s.nextInt();

			if (i == 0 || i == 1 || i == 5) {
				soma = A[0] + A[1] + A[5];
			}
		}
		System.out.println("\nSoma das posições A[0] + A[1] + A[5] = " + soma + 
		"\nOs valores escolhidos foram:");

		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);

		}
		s.close();
	}
}