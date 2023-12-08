package loops;

import java.util.Scanner;

public class AtividadeFor2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		    int numero, x;
	        int Pares = 0;
	        int Impares = 0;

	        System.out.println("/nDigite 10 números inteiros:");

	        
	        for (x = 1; x <= 10; x++) {
	            System.out.print("Número " + x + ": ");
	            numero = leia.nextInt();

	           
	            if (numero % 2 == 0) {
	                Pares++;
	            } else {
	                Impares++;
	            }
	        }

	       
	        System.out.println("\nTotal de números pares: " + Pares);
	        System.out.println("Total de números ímpares: " + Impares);

	      
	        leia.close();
		
	
		}
		
		
		
		
	
		
		
		

	}


