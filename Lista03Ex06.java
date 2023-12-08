package atividade10_2;

import java.util.Scanner;

public class Lista03Ex06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero, soma = 0;
		float media = 0, quantidade = 0;

		do {
			System.out.println("Digite um número:");
			numero = leia.nextInt();
			if (numero % 3 == 0 && numero != 0) {
				soma += numero;
				quantidade++;
			}
		} while (numero != 0);
		
		media = soma / quantidade;		

		System.out.printf("A média de todos os números múltiplos de 3 é: %.1f", media);

		leia.close();

		
		
		
		
	}

}
