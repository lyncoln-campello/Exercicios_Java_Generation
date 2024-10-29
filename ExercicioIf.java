package exercicio1;

import java.util.Scanner;

public class ExercicioIf {

	public static void main(String[] args) {
		byte A, B, C;
		Scanner leia = new Scanner(System.in);

		System.out.println("Some dois números e compare com um terceiro ");
		System.out.print("Digite o primeiro número a ser somado: ");
		A = leia.nextByte();

		System.out.print("Digite o segundoo número a ser somado: ");
		B = leia.nextByte();

		System.out.print("Digite o número a ser comparado: ");
		C = leia.nextByte();
		leia.close();

		if (A + B > C) {
			System.out.println(A + " + " + B + " > " + C + "\nA soma de A + B é maior do que C");
		}
		if (A + B < C) {
			System.out.println(A + " + " + B + " < " + C + "\nA soma de A + B é menor do que C");
		}
		if (A + B == C) {
			System.out.println(A + " + " + B + " = " + C + "\nA soma de A + B é igual a C");
		}
	}

}
