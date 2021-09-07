import java.util.*;

public class Lista2_07_LeandroIkehara {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int somadorDeNumeros = 0;
		int numero = 0;

		do {
			System.out.println("Digite um número inteiro");
			numero = s.nextInt();
			if (numero > 0) {
				somadorDeNumeros += numero;
				System.out.println("A soma até o momento é " + somadorDeNumeros);

			}
		} while (numero > 0);
		s.close();

	}

}