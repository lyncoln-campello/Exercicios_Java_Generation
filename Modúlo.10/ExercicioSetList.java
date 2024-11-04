package Exercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ExercicioSetList {

	public static void main(String[] args) {

		Set<Integer> SetN = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite 10 números inteiros não repetidos :\n");

		for (int i = 0; i <= 9; i++) {
			System.out.print("Digite o " + (i + 1) + "º número:");
			SetN.add(leia.nextInt());
		}
		leia.close();

		System.out.println("\nO Set em ordem crescente:\n");

		List<Integer> ListN = new ArrayList<>(SetN);

		Collections.sort(ListN);

		for (int e : ListN) {
			System.out.println(e);
		}

	}

}
