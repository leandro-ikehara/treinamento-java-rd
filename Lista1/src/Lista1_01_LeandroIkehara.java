import java.util.*;

public class Lista1_01_LeandroIkehara {

	public static void main(String[] args) {
//		float celsius = 0;
		Scanner s = new Scanner(System.in);

		System.out.println("CONVERSOR DE TEMPERATURA:");
		
		System.out.println("Digite uma temperatura em Fahrenheit:");
		float fahrenheit = s.nextFloat();
		
		float conversor = (fahrenheit - 32) * 5/9;
		System.out.println("\nA temperatura " + fahrenheit + "ºF em Fahrenheit é " + conversor + "ºC");
		
		s.close();

	}

}
