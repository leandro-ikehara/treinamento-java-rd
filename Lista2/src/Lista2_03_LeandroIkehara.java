import java.util.*;

public class Lista2_03_LeandroIkehara {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double nota = s.nextDouble();
		System.out.println("Digite a primeira nota: ");

		double nota2 = s.nextDouble();
		System.out.println("Digite a segunda nota: ");

		double media = (nota + nota2) / 2;
		System.out.println("Sua m�dia foi: " + media + ".");

		if (media >= 7) {
			System.out.println("Portanto, voc� est� Aprovado!");
		} else if (media < 7 && media > 4) {
			System.out.println("Portanto, voc� est� em Recupera��o!");
		} else {
			System.out.println("Portanto, voc� est� Reprovado!");
		}
		s.close();
	}
}