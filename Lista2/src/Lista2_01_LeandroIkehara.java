import java.util.*;

public class Lista2_01_LeandroIkehara {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("VAMOS VERIFICAR SE SEU N�MERO � PAR!");

		System.out.println("\nDigite um n�mero inteiro entre 0 e 10: ");
		int numero = s.nextInt();

		if (numero >= 0 && numero <= 10) {
			if (numero % 2 == 0) {
				System.out.println("Seu n�mero digitado " + "(" + numero + ")" + " � par!");
			} else {
				System.out.println("Seu n�mero digitado " + "(" + numero + ")" + " � impar!");
			}
			s.close();
		}
	}
}
