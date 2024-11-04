package estruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class ExPilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> pilha = new Stack<>();
		Scanner leia = new Scanner(System.in);
		byte codigo = -1;

		System.out.println("   1 - Adicionar Livro na pilha ");
		System.out.println("   2 - Listar Livros da pilha ");
		System.out.println("   3 - Retirar Livro da pilha ");
		System.out.println("   0 - Sair  \n");

		do {
			System.out.print("\nDigite o código da operação que deseja realizar: ");
			codigo = leia.nextByte();
			leia.nextLine();

			switch (codigo) {

			case 1:
				System.out.print("Digite o nome do livro: ");
				pilha.push(leia.nextLine());

				break;
			case 2:
				if (pilha.isEmpty()) {
					System.out.println("A pilha de livro está vazia.");

				} else {
					System.out.println(pilha);
				}
				break;

			case 3:
				if (pilha.isEmpty()) {
					System.out.println("Não há livros para remover, a pilha já está vazia.");
				} else {
					System.out.println("O livro " + pilha.pop() + " foi retirado da pilha.");
				}
				break;

			default:
				System.out.println("O código informado não foi encontrado!");
			}

		} while (codigo != 0);

		leia.close();

		System.out.println("\nO programa foi encerrado! ");
	}

}
