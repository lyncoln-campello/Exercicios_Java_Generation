package exercicio1;

import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {

		int inicio, fim, i;

		Scanner leia = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		inicio = leia.nextInt();
		System.out.print("Digite o último número: ");
		fim = leia.nextInt();
		
		leia.close();
		
		if (inicio <= fim) {
			System.out.println("No intervalo entre " + inicio + " e " + fim + ":");

			for (i = inicio; i < fim; i++) {
				if (i % 3 == 0 && i % 5 == 0) {

					System.out.println(i + " é múltiplo de 3 e 5 ");

				}
			}
		}
		if (inicio > fim) {

			System.out.printf("Intervalo inválido! ");
  
		}
		
	}

}
