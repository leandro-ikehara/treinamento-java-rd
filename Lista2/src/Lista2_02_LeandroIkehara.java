import java.util.*;

public class Lista2_02_LeandroIkehara {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("ANO BISSEXTO");

		System.out.println("\nDigite um ano para verificar se ? Bissexto: ");

		int ano = s.nextInt();
		if (ano % 400 == 0) {
			System.out.println("\nO ano " + ano + " ? bissexto!");
		} else {
			System.out.println("\nO ano " + ano + " n?o ? bissexto!");
		}
		s.close();
	}

}
