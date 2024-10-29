package exercicio1;

import java.util.Scanner;

public class ExercicioSwitch2 {

	public static void main(String[] args) {
        byte cargo;
        float salario ;
        String nome;
		Scanner leia = new Scanner(System.in);
		 
		System.out.println("Código do Cargo -    Cargo      - Percentual de Reajuste ");
		System.out.println("      1         -    Gerente    -      10% ");
		System.out.println("      2         -    Vendendor  -      7% ");
		System.out.println("      3         -   Supervisor  -      9% ");
		System.out.println("      4         -    Motorista  -      6% ");
		System.out.println("      5         -   Estoquista  -      5% ");
		System.out.println("      6         - Técnico de TI -      8% \n");
        
		System.out.print("Digite o nome do colaborador: ");
		nome = leia.nextLine();
		System.out.print("Digite o código do cargo: ");
		cargo = leia.nextByte();
		System.out.print("Digite o salário: R$ ");
		salario = leia.nextFloat();
		
		leia.close();
		
		switch (cargo) {
		    case 1:
		    	System.out.println("\n\nNome do funcionário: "+ nome + "\nCargo = Gerente "  );
		    	System.out.printf("Salario após reajuste: R$%.2f ", (salario + salario*0.1 ) );
		    	break;
		    case 2:
		    	System.out.println("\n\nNome do funcionário: "+ nome + "\nCargo = Vendedor "  );
		    	System.out.printf("Salario após reajuste: R$%.2f ", (salario + salario*0.07 ) );
		    	break;
		    case 3:
		    	System.out.println("\n\nNome do funcionário: "+ nome + "\nCargo = Supervisor "  );
		    	System.out.printf("Salario após reajuste: R$%.2f ", (salario + salario*0.09 ) );
		    	break;
		    case 4:
		    	System.out.println("\n\nNome do funcionário: "+ nome + "\nCargo = Motorista "  );
		        System.out.printf("Salario após reajuste: R$%.2f ", (salario + salario*0.06 ) );
		    	break;
		    case 5:
		    	System.out.println("\n\nNome do funcionário: "+ nome + "\nCargo = Estoquista "  );
		    	System.out.printf("Salario após reajuste: R$%.2f ", (salario + salario*0.05 ) );
		    	break;
		    case 6:
		    	System.out.println("\n\nNome do funcionário: "+ nome + "\nCargo = Técnico de TI "  );
		    	System.out.printf("Salario após reajuste: R$%.2f ", (salario + salario*0.08 ) );
		    	break;	
		    default:
		    	System.out.print("O Cargo digitado não foi achado");
		    	
		}
		
		
		
		
		
		
	}

}
