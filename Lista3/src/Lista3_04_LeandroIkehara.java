import java.util.*;

/* 4. Faça um programa com um array de 8 posições que receba 8 valores reais do usuário. 
 * Em seguida o usuário fornece duas posições X e Y do array. Exiba na tela o conteúdo do array
 * e a soma dos valores destas duas posições. */

public class Lista3_04_LeandroIkehara {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double arrayDeOito[] = new double[8];

		System.out.println("Digite 8 números e aperte Enter ");

		for (int i = 0; i < arrayDeOito.length; i++) {
			arrayDeOito[i] = s.nextInt();

		}

		System.out.println("Escolha duas posições da sequência:");
		int x = s.nextInt();
		int y = s.nextInt();

		double soma = arrayDeOito[x] + arrayDeOito[y];
		System.out.println("Números escolhidos: " + Arrays.toString(arrayDeOito));
		System.out.println("Soma das posições " + x + " e " + y + " = " + soma);

		s.close();
	}
}
