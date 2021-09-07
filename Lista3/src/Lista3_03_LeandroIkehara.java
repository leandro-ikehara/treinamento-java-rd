import java.util.*;

/* 3. Faça uma programa com um array que recebe do usuário 10 números reais. 
 * Calcule o quadrado de cada elemento deste array e armazene estes valores calculados 
 * em outro array. Exiba na tela os valores dos dois arrays. */

public class Lista3_03_LeandroIkehara {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double[] numeros = new double[10];
		double[] quadradoDosNumeros = new double[numeros.length];

		for (int i = 0; i < numeros.length; i++) {

			System.out.println("Informe o " + (i + 1) + "º número:");
			numeros[i] = s.nextInt();
			quadradoDosNumeros[i] = Math.pow(numeros[i], 2);
		}

		System.out.println("Números escolhidos: " + Arrays.toString(numeros) + 
		"\nNúmeros ao quadrado: " + Arrays.toString(quadradoDosNumeros));

		s.close();
	}
}