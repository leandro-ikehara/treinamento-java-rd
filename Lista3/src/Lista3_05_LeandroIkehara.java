import java.util.Scanner;

/* 5. Faça um programa com um array de 10 posições e que receba do usuário 
 * os valores para preenchê-lo. Em seguida exiba na tela o maior e o menor 
 * valor do array. */

public class Lista3_05_LeandroIkehara {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double arrayDeDez[] = new double[10];

		for (int i = 0; i < arrayDeDez.length; i++) {
			System.out.println("Digite 10 números e aperte Enter ");
			arrayDeDez[i] = s.nextFloat();
		}

		double maior = arrayDeDez[0];
		double menor = arrayDeDez[0];

		for (int i = 0; i < arrayDeDez.length; i++) {
			if (arrayDeDez[i] > maior) {
				maior = arrayDeDez[i];

			} else if (arrayDeDez[i] < menor) {
				menor = arrayDeDez[i];
			}
		}
		System.out.println("Menor número escolhido: " + menor + "\nMaior número escolhido: " + maior);

		s.close();
	}
}
