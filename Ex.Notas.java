package ex.Notas;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
	    float n1, n2, n3, n4, media;
	    
	    System.out.print("Digite a Primeira nota: ");
	    n1 = leia.nextFloat();
	    System.out.print("Digite a Segunda nota: ");
	    n2 = leia.nextFloat();
	    System.out.print("Digite a Terceira nota: ");
	    n3 = leia.nextFloat();
	    System.out.print("Digite a Quarta nota: ");
	    n4 = leia.nextFloat();
	    media = (n1+n2+n3+n4)/4;
	    System.out.println("A média de pontos do aluno é: "+ media);
	}

}
