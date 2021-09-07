import java.util.*;

public class Lista2_08_LeandroIkehara {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int maiorValor = 0;
		int contador = 0;

		do {
			System.out.println("Digite um número");
			int valor = s.nextInt();

			if (valor > maiorValor) {
				maiorValor = valor;

			}
			contador++;
		} while (contador != 10);
		System.out.println("O maior valor foi: " + maiorValor);

		s.close();
	}

}