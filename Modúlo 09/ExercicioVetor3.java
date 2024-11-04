package Exercicio1;

import java.util.Scanner;
public class ExercicioVetor3 {
  
	public static void main(String[] args) {
		//segunda versão do Exercício 1 de Vetor.
		
		 int VetorInteiros[] = {1, 3, 5, 7, 4, 8, 2, 10, 9, 6}, num, posicao=0;
	        
	        Scanner leia = new Scanner(System.in);
	        
	        System.out.println("Dado o vetor: {1, 3, 5, 7, 4, 8, 2, 10, 9, 6}");
	        
	        System.out.print("\nDigite um número presente no vetor e descubra sua posição: ");
	        num = leia.nextInt();
	        leia.close();
	        
	        
	        for (int i = 0; i < 10; i++) {
	            if (VetorInteiros[i] == num) {
	                posicao = i;
	             break;
	            }
	        }

	        if (posicao <= 9 && posicao > 0 ) {
	            System.out.println("A posição do número no vetor é: " + posicao);
	        } else {
	            System.out.println("O número digitado não está presente no vetor.");
	        }
	    }
	}