import java.util.*;

public class Lista1_04_LeandroIkehara {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("VAMOS CALCULAR O SEU NÚMERO AO QUADRADO E AO CUBO");
		
		System.out.println("\nDigite um número inteiro da sua preferência: ");
		int numero = s.nextInt();
		
		double quadrado = Math.pow(numero,2);
		System.out.println("Seu número " + numero + " ao quadrado é " + quadrado);
		
		double cubo = Math.pow(numero,3);
		System.out.println("Seu número " + numero + " ao cubo é " + cubo);
		
		s.close();

	}

}