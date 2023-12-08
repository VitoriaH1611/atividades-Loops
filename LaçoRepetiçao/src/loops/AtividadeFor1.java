package loops;

import java.util.Scanner;

public class AtividadeFor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
	
		int numero1, numero2, numero;
		
		
		System.out.println("\n Digite um primeiro número: ");
		numero1 = leia.nextInt();
		System.out.println("\n Digite um segundo número: ");
	    numero2 = leia.nextInt();
	    
	    if(numero1 > numero2) {
	    	System.out.println("\n O intervalo é inválido! Digite o primeiro número MENOR que o segundo ");
	    
	    
	    }
	    
	
	    for( numero = numero1; numero <= numero2; numero++) {
	    	if(numero % 3 == 0 && numero % 5 ==0) {
	    		System.out.println(numero + " é multiplo de 3 e 5");
	    	} 
	   
	    
	    } 
	 
	}
	
	
	

}
