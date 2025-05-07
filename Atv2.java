package Desafios;

import java.util.Scanner;

public class Atv2 {
	public static void main(String[] args) {
		int[] valores = new int[5];
		Scanner ler = new Scanner(System.in);
		int soma = 0;

		System.out.println("Informe 5 valores inteiros:");
		for (int i = 0; i < 5; i++) {
		System.out.println("Valor " + (i + 1) + ":");
		valores[i] = ler.nextInt();
		if (valores[i] > 30) {
		soma += valores[i];
		}
		}

		System.out.println("\nValores informados:");
		for (int i = 0; i < 5; i++) {
		System.out.println("Valor na posição " + i + ": " + valores[i]);
		}

		System.out.println("\nA soma dos valores maiores que 30 é: " + soma);

		ler.close();
	
	}

}
