
package loops;
import java.util.Scanner;

public class AtividadeWhile4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int idade, genero, developer, backEnd = 0, mulherCisTransFront = 0, homemCisTransMob = 0, naoBiFullStackMenor30 = 0,
            pessoasTotal = 0, somaDaIdade = 0;
        float mediaIdades;
        char continuar;

        System.out.println("Queremos fazer uma pesquisa para conhecer melhor nossos colaboradores!");

        
        while (true) {
         
        	 System.out.println("Insira a sua idade:");
        	 idade = leia.nextInt();
        	 
        	 System.out.println("Lista de Generos:"
        + "\n\t1 – Mulher Cis" + "\n\t2 - Homem Cis" + "\n\t3 - Não Binário" + "\n\t4 - Mulher Trans:" + "\n\t5 - Homem  Trans:" + "\n\t6 - Outros" );
        	 System.out.println("Você se identifica com qual gênero listado? ");
        	 genero = leia.nextInt();
        	 
        	 System.out.println("Desenvolvimento de Software:" 
        	+ "\n\t1 – Backend" + "\n\t2 - Frontend" + "\n\t3 - Mobile" + "\n\t4 - FullStack" );
        	 System.out.println("Você é um desenvolvedor ....: ");
        	 developer = leia.nextInt();
        	 
           
        	 
        	 if (developer == 1) {
        		 backEnd++;
        	 }
        	 if (genero == 1 || genero == 5 && developer == 2) {
        		 mulherCisTransFront++;
        	 }
        	 if (genero == 2 || genero == 5 && developer == 3 && idade >40) {
        		 homemCisTransMob++; 
        	 }
        	 if (genero == 3 && developer == 4 && idade <30) {
        		 naoBiFullStackMenor30++;
        	 }
        	
      
        	 somaDaIdade = somaDaIdade + idade;
             pessoasTotal++;
        
             System.out.println("Você deseja continuar a pesquisa (S/N)?");
             continuar = leia.next().charAt(0);
             
             if(continuar !='S' && continuar !='s' ) {
            	break;
             }
        }

       
        System.out.println("\n Resultados da Pesquisa:");
        System.out.println("Número de pessoas desenvolvedoras Backend: " + backEnd);
        System.out.println("Número de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulherCisTransFront);
        System.out.println("Número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homemCisTransMob);
        System.out.println("Número de Não Binários desenvolvedores FullStack menores de 30 anos: " + naoBiFullStackMenor30);
        System.out.println("Número total de pessoas que responderam à pesquisa: " + pessoasTotal);
        
        mediaIdades = somaDaIdade / pessoasTotal;
        System.out.println("Média de idade das pessoas que responderam à pesquisa: " + mediaIdades);

        // Fecha o scanner
        leia.close();
        
    }
}
