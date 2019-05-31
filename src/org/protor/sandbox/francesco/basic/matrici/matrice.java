package org.protor.sandbox.francesco.basic.matrici;

import java.util.Scanner;

public class matrice {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci dimensione matrice : ");
		int x = input.nextInt();
		int sommaDiagPrimaria = 0;
		double mediaDiagSecondaria = 0.0;

		int [][] m = new int [x][x];
		int i,j = 0;
		for (i = 0; i < x; i++) {
			System.out.println("\n");
			for (j = 0; j < x; j++) {
				m[i][j] = (int) (Math.random()*10);
				System.out.print("\t" + m[i][j]);
			}
			System.out.println();
		}

		sommaDiagPrimaria = m[0][0] +
					        m[1][1] +
					        m[2][2] +
					        m[3][3];
		
		int sommaDiagSecondaria = 0;
		
		sommaDiagSecondaria = m[0][3]+
							  m[1][2]+
							  m[2][1]+
							  m[3][0];
		
		mediaDiagSecondaria = sommaDiagSecondaria / x;
		
		System.out.println("\nSomma diagonale principale = " + sommaDiagPrimaria);
		System.out.println("Media diagonale secondaria = " + mediaDiagSecondaria);
	}
}
