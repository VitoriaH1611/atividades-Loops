package loops;

import java.util.Scanner;

public class AtividadeDoWhile5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int somaNumPositivos = 0, opcao;	
		
		System.out.println("\n Somos uma calculadora de número positivos! ");
		
		do {

			
			System.out.println("\n Digite um número: ");
			opcao = leia.nextInt();
			
			if (opcao > 0) {
                somaNumPositivos = somaNumPositivos + opcao;
            }
			
			
		}while(opcao != 0);
		
		System.out.println("\n A soma dos números é " + somaNumPositivos);
	}

}
