import java.util.*;

public class Lista2_06_LeandroIkehara {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int continuar = 0;
		int numeroSorteado;
		int tentativas;
		int numero;		
				
		do {
			System.out.println("Sorteando um n�mero entre 0 e 100: " + 
		"\nVoc� tem 10 tentativas para acertar!");
			Random numeroAleatorio = new Random();
			numeroSorteado = numeroAleatorio.nextInt(101);
			
			tentativas = 0;
			
			do {
				tentativas++;
				if(tentativas > 10) {
					break;
				}
				
				System.out.println("\n" + tentativas + "� tentativa: ");
				numero = s.nextInt();
				
				if(numero > numeroSorteado) {
					System.out.println("\nO n�mero sorteado � menor que o chute");
				}else if(numero < numeroSorteado) {
					System.out.println("\nO n�mero sorteado � maior que o chute");
				}else {
					System.out.println("Acertou!");
				}
			}while(numero != numeroSorteado);
				System.out.println("\nDigite 0(ZERO) para sair, ou qualquer outro n�mero para continuar");
				continuar = s.nextInt();
				
		} while(continuar != 0);
			s.close();
	}

}
