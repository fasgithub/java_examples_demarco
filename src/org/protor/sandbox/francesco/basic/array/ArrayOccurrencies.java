package org.protor.sandbox.francesco.basic.array;

import java.util.Scanner;

public class ArrayOccurrencies {

	public static void main(String[] args) {

		Scanner tastiera = new Scanner(System.in);

		String frase = tastiera.nextLine();
		System.out.println("La frase che hai scritto è: " + "'" + frase 
				+ "'");
		System.out.println(frase.length());
		System.out.println("\nInserisci carattere/parola per vedere quante volte si ripete: ");
		String occorrenza = tastiera.nextLine();

		int nOccorrenze = 0;

		for (int i = 0; i <= frase.length()-occorrenza.length(); i++) {
			String tempString = frase.substring(i, i+occorrenza.length());
			if (tempString.equals(occorrenza)) {
				nOccorrenze++;
			}
		}
		
		if (nOccorrenze != 1)
			System.out.println("\nIl carattere/parola " + "'" + occorrenza + "'" + " si ripete " + nOccorrenze + " volte");
			else 
				System.out.println("\nIl carattere/parola " + "'" + occorrenza + "'" + " si ripete " + nOccorrenze + " una volta");
		
	}

//    public static int occorrenze(String frase, String occorrenza) {
//    	
//    	int sum=0, i=0, x;
//    		do {
//    			x = frase.indexOf(occorrenza,i);
//    			if (x!=-1) {
//    				sum++;
//    				i=x+1;
//    			}
//    		}while (x!=1);
//    	return sum;
//	}
}
