package loops;

import java.util.Scanner;

public class AtividadeWhile3 {
	public static void main(String[] args) {
		
		 Scanner leia = new Scanner(System.in);

	        int idade;
	        int totalMenor21 = 0;
	        int totalMaior50 = 0;

	        System.out.println("Digite a idade (se quiser encerrar, digite uma idade negativa!):");

	        
	        while (true) {
	            System.out.print("Idade: ");
	            idade = leia.nextInt();
	            
	            if (idade < 0) {
	            	break;
	            	
	            } else if (idade < 21) {
	                totalMenor21++;
	            } else if (idade >  50) {
	            	totalMaior50++;
	            }
	        }
	        
	        System.out.println("\nTotal de pessoas com menos de 21 anos: " + totalMenor21);
	        System.out.println("Total de pessoas com mais de 50 anos: " + totalMaior50);
		
		
}
}

