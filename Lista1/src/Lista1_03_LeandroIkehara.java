import java.util.*;

public class Lista1_03_LeandroIkehara {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("VAMOS CALCULAR O IMC:");
		
		System.out.println("Digite seu peso: ");
		float peso= s.nextFloat();
		
		System.out.println("Digite sua altura: ");
		float altura = s.nextFloat();
		
		float imc = peso/(altura*altura);
		System.out.println("Seu IMC é " + imc);
		
		s.close();
	
	}

}
