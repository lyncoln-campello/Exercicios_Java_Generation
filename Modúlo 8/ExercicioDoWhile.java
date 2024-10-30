package exercicio1;

import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {
		
		int numero, soma=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
			soma = soma + numero;
			
		} while(numero != 0);
		
		leia.close();
		
		System.out.println("A soma dos números digitados é: "+ soma);
      
	}

}
