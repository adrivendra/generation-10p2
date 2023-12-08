package atividade10_2;

import java.util.Scanner;

public class Lista02Ex03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int idade = 0, cont21 = 0, cont50 = 0;

		while (idade >= 0) {
			System.out.println("Digite uma idade: \nDigite um numero negativo para parar");
			idade = leia.nextInt();

			if (idade >= 0) {
				if (idade <= 21) {
					cont21++;
				} else if (idade >= 50) {
					cont50++;
				}
			}
		}

		System.out.println("Total de pessoas menores de 21 anos: " + cont21);
		System.out.println("Total de pessoas maiores de 50 anos: " + cont50);

		leia.close();
	}
}
