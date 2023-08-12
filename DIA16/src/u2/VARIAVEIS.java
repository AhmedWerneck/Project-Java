package u2;

import java.util.Scanner;

public class VARIAVEIS {

	public static void main(String[] args) {
		
			Scanner scn = new Scanner(System.in);
			System.out.println("Valor 1: ");
			int n1 = scn.nextInt(); 
			System.out.println("Valor 2: ");
			int n2 = scn.nextInt();
			
			int soma = n1 + n2;
			int sub = n1 - n2;
			int mult = n1 * n2;
			int div = n1 / n2;
			
			System.out.println("Soma = "+soma);
			System.out.println("Subtração = "+sub);
			System.out.println("Multiplicação = "+mult);
			System.out.println("Divisão = "+div);
			
			
			
	}


}
