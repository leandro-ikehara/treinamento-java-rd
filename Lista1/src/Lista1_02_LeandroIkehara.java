import java.util.*;

public class Lista1_02_LeandroIkehara {

	public static void main(String[] args) {
			float fahrenheit = 32;
			Scanner s = new Scanner(System.in);

			System.out.println("CONVERSOR DE TEMPERATURA:");
			
			System.out.println("Digite uma temperatura em Celsius:");
			float celsius = s.nextFloat();
			
			float conversor = celsius * 9/5 + fahrenheit;
			System.out.println("\nA temperatura " + celsius + "ºC em Fahrenheit é " + conversor + "ºF");
			
			s.close();
	}

}
