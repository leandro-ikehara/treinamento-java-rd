import java.util.*;

public class Lista1_05_LeandroIkehara {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("VAMOS CALCULAR A ÁREA DO TRIÂNGULO");
		
		System.out.println("Digite o valor da base: ");
		double base = s.nextDouble();
		
		System.out.println("Digite o valor da altura: ");
		double altura = s.nextDouble();
		
		double triangulo = ((base * altura)/2);
		System.out.println("\nA área do seu triângulo é " + triangulo);
		
		s.close();

	}
	
}