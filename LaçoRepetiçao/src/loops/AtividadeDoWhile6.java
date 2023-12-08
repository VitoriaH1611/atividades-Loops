package loops;

import java.util.Scanner;

public class AtividadeDoWhile6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int multiplos = 0, num,vezes=0, mediaMultiplos;	
		
		
		System.out.println("\n Somos uma calculadora de média de multiplos de 3! ");
		
		do {

			System.out.println("\n Digite um número: ");
			num = leia.nextInt();
			
			if (num % 3 == 0 && num != 0) {
				multiplos += num;
                vezes++;
            }
			
			
		}while(num != 0);
		
		mediaMultiplos = multiplos / vezes;
		
		System.out.println("\n A média de todos os números múltiplos de 3 é " + mediaMultiplos);
		
		
	}

}
