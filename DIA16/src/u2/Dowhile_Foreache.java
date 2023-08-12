package u2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Dowhile_Foreache {

	public static void main(String[] args) {
		System.out.println("Digite o valor: ");	
		Scanner scn = new Scanner(System.in);
			
		int valor =	scn.nextInt();	
		int maior, menor;
		menor = maior = valor;
		double media = 0, soma = 0;
		int n = 0;
		

		while (valor != -1)		
		{
		
			soma = soma + valor;
			n++;
			valor =	scn.nextInt();
			if (valor > maior)
				maior = valor;
			else if (menor < valor)
				menor = valor;
				
		}
			media = soma/n;
			
			System.out.println("Valor Maior= "+maior);
			System.out.println("Valor Menor= "+menor);
			System.out.printf("Média = "+media);
		
		
		
		
		
		
		
		
		
		}
		
	}


