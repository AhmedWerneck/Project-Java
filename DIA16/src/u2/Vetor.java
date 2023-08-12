package u2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Vetor {

	public static void main(String[] args) {
			
		/*int A [] = new int [50];
		int B [] = new int [50];
		
		for(int i=0;i<50;i++)
		{
			A[i] = i;
			
			if(i%2 == 0)
				B[i] = 2*A[i];
			else
				B[i] = A[i]/2;
						
		}
		 	
			for(int a:A)
				System.out.print(a+" ");
			System.out.println(" ");
			for(int b:B)
				System.out.print(b+" ");
*/
		Scanner scn = new Scanner(System.in);
		
		int A [] = new int [5];
		int B [] = new int [A.length];
		
	    for (int i=0; i<A.length; i++) {
	    	
	    	System.out.println("Insira o valor da posição: "+ i);
	    	A[i] = scn.nextInt();
	    }
	    for (int i=0; i<A.length; i++)
	    	B[i] = A[i];
	    
	    System.out.print("Valor do vetor A: ");
	    for (int i=0; i<A.length; i++) {
	    	System.out.print(A[i] + "  ");
	    }
	    	System.out.println();
	    	
	    System.out.print("Valor do vetor B: ");
		    for (int i=0; i<B.length; i++) {
		    	System.out.print(B[i] + "  ");
		    }
		    	System.out.println();
	    	
	    
	   
	    	
	    	
	    	
	    	
	    	
	    }
	    
		
	}


