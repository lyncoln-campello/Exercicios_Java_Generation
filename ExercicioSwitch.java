package exercicio1;

import java.util.Scanner;

public class ExercicioSwitch {

	public static void main(String[] args) {
		byte pedido, quantidade;

		Scanner leia = new Scanner(System.in);

		System.out.println("Código do produto -   Produto   - Preço unitário \n");
		System.out.println("      1         - Cachorro Quente -  R$ 10.00    ");
		System.out.println("      2         - X-Salada        -  R$ 15.00    ");
		System.out.println("      3         - X-Bacon         -  R$ 18.00    ");
		System.out.println("      3         - Bauru           -  R$ 12.00    ");
		System.out.println("      4         - Refrigerante    -  R$ 8.00     ");
		System.out.println("      5         - Suco de laranja -  R$ 13.00    ");

		System.out.print("Digite o código do produto você deseja comprar: ");
		pedido = leia.nextByte();
		System.out.print("Quantas unidades do pedido você quer: ");
		quantidade = leia.nextByte();
		leia.close();

		switch (pedido) {
			case 1:
				System.out.printf("Produto: Cachorro quente \nValor total: R$ %.2f", (quantidade * 10.00));
				break;
	
			case 2:
				System.out.printf("Produto: X-Salada \nValor total: R$ %.2f", (quantidade * 15.00));
				break;
			case 3:
				System.out.printf("Produto: X-Bacon \nValor total: R$ %.2f", (quantidade * 18.00));
				break;
			case 4:
				System.out.printf("Produto: Bauru \nValor total: R$ %.2f", (quantidade * 12.00));
				break;
			case 5:
				System.out.printf("Produto: Refrigerante \nValor total: R$ %.2f", (quantidade * 8.00));
				break;
			case 6:
				System.out.printf("Produto: Suco de laranja \nValor total: R$ %.2f", (quantidade * 13.00));
				break;
			default:
				System.out.print("O código do produto não foi encontrado");

		}
	}

}
