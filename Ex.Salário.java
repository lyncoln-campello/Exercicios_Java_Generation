package ex.Salário;

import java.util.Scanner;

public class Exercicio1 {

	;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner leia = new Scanner(System.in);
	
		float salario, abono, novoSalario;
		System.out.print("Digite o salário:  ");
		salario = leia.nextFloat();
		System.out.print("Digite o abono: ");
		abono = leia.nextFloat();
		novoSalario = salario + abono;
		System.out.print("O Novo salário é: "+ novoSalario );
		
		
	}

}
