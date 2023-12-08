package atividade10_2;

import java.util.Scanner;

public class Lista01Ex02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero = 0, par = 0, impar = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "º número");
			numero = leia.nextInt();

			if (numero % 2 == 0) {
				par++;
			}
			if (numero % 2 == 1) {
				impar++;	

			}

		}
		
		System.out.println("Total de números pares: "+ par);
		System.out.println("Total de números ímpares "+impar);
		leia.close();
	}

}
