package exercicio1;

import java.util.Scanner;

public class ExercicioIf2 {

	public static void main(String[] args) {

		short numero;

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número inteiro e descubra se ele é IMPAR ou PAR, e se é NEGATIVO ou POSITIVO ");
		System.out.print("Digite o número: ");
		numero = leia.nextShort();

		leia.close();

		if (numero < 0 && numero % 2 == 0) {
			System.out.println("O número " + numero + " é PAR e NEGATIVO!");
		}
		if (numero > 0 && numero % 2 == 0) {
			System.out.println("O número " + numero + " é PAR e POSITIVO!");
		}
		if (numero < 0 && numero % 2 != 0) {
			System.out.println("O número " + numero + " é IMPAR e NEGATIVO!");
		}
		if (numero > 0 && numero % 2 != 0) {
			System.out.println("O número " + numero + " é PAR e NEGATIVO!");
		}
	}

}
