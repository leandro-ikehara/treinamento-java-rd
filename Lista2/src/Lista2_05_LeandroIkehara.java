import java.util.*;

public class Lista2_05_LeandroIkehara {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int contadorDeDivisores = 0;

		System.out.println("Digite um número para validação: ");
		int numero = s.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero == 0) {
				contadorDeDivisores++;
			}
		}
		switch (contadorDeDivisores) {
			case 0:
				System.out.println("O número " + numero + " é primo");
				break;
				
			default:
				System.out.println("O número " + numero + " não é primo!");
		}
		s.close();
	}
}