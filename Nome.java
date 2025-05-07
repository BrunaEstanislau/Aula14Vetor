package Desafios;

import java.util.Scanner;

public class Nome {
	public static void main(String[] args) {
		String[] nomes = new String[5];
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe os nomes");
		
		for (int i = 0; i<5; i++) {
		System.out.println("Nomes" + (i+1) + "..:");
		nomes[i] = ler.nextLine();
		}
		
		System.out.println("Os números são: ");
		for (int i = 0; i< 5; i++) {
		System.out.println("nome do posição " + i + ":" + nomes[i]);
		}
		ler.close();
	}

}
