package estruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExFila {

	public static void main(String[] args) {
		int codigo = -1;
		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();

		System.out.println("   1 - Adicionar cliente na fila ");
		System.out.println("   2 - Listar todos os cliente ");
		System.out.println("   3 - Retirar cliente da fila ");
		System.out.println("   0 - Sair  \n");

		do {
			System.out.print("\nDigite o código da operação que deseja realizar:");
			codigo = leia.nextInt();
			leia.nextLine();

			if (codigo == 1) {
				System.out.print("\nDigite o nome do cliente: ");
				fila.add(leia.nextLine());
			}

			if (codigo == 2) {
				System.out.print(fila + "\n");
			}

			if (codigo == 3) {
				System.out.print("\nDigite o nome que você quer retirar da fila: ");
				String remove = leia.nextLine();
				fila.remove(remove);
				System.out.println("O cliente " + remove + " foi removido da fila.");

			}
			if (codigo != 1 && codigo != 2 && codigo != 3 && codigo != 0) {
				System.out.println("O código informado não foi encontrado.\n");
			}

		} while (codigo != 0);

		System.out.println("\nO programa foi encerrado! ");
		leia.close();

	}

}
