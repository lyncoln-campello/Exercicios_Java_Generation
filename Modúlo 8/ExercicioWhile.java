package exercicio1;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {

		byte total21 = 0, total50 = 0,idade ;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite uma idade: ");
		idade = leia.nextByte();
		
		while ( idade > 0) {
		
			System.out.println("Digite uma idade: ");
			idade = leia.nextByte();

			if (idade >= 21) {
				total21++;
			}
			if (idade <= 50) { 
		        total50++;
			}
		}
		leia.close();
		System.out.println("O total de pessoas maiores de 21 ano é: "+ total21);
		System.out.println("O total de pessoas maiores de 50 ano é: "+ total50);
	}

}