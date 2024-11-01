package Exercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioColectionsList {

	public static void main(String[] args) {

		ArrayList<String> cores = new ArrayList<String>();
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite as cores e as ordene \n");

		for (byte i = 0; i < 5; i++) {
			System.out.print("Digite uma cor:");
			cores.add(leia.nextLine());

		}
		leia.close();

		System.out.println("\nTodas as cores digitadas foram:\n");

		for (String each : cores) {
			System.out.println(each);
		}

		System.out.println("\nAs cores em forma ordenada:\n");

		Collections.sort(cores);

		for (String each : cores) {
			System.out.println(each);
		}
	}

}
