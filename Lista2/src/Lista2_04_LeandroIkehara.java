import java.util.*;

public class Lista2_04_LeandroIkehara {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int contadorDeDivisores = 0;

		System.out.println("Digite um n�mero para verificar se � primo: ");
		int numero = s.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}
		if (contadorDeDivisores == 0) {
			System.out.println("N�mero " + numero + " � primo!");
		} else {
			System.out.println("N�mero " + numero + " n�o � primo!");
		}
		s.close();
	}
}
