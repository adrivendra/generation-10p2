package atividade10_2;

import java.util.Scanner;

public class Lista02Ex04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String continua = "s";
		int idade, identGen, pessDesen;
		int numBackend = 0, numMulher = 0, numHomem = 0, numNB = 0, numTotal = 0, somaIdade = 0;
		float mediaIdade = 0;
		while (continua.equalsIgnoreCase("s")) {
			System.out.println("Idade: ");
			idade = leia.nextInt();
			System.out.println(
					"Identidade de Gênero:\n 1 - Mulher Cis\n 2 - Homem Cis\n 3 – Não Binário\n 4 - Mulher Trans\n 5 - Homem Trans\n 6 - Outros");
			identGen = leia.nextInt();
			System.out.println("Pessoa Desenvolvedora:\n 1 - Backend\n 2 - Frontend\n 3 – Mobile\n 4 - FullStack");
			pessDesen = leia.nextInt();

			if (pessDesen == 1) {
				numBackend++;
			} else if (pessDesen == 2 && (identGen == 1 || identGen == 4)) {
				numMulher++;
			} else if (pessDesen == 3 && (identGen == 2 || identGen == 5) && idade > 40) {
				numHomem++;
			} else if (pessDesen == 4 && identGen == 3 && idade < 30) {
				numNB++;
			}
			numTotal++;
			somaIdade += idade;

			System.out.println("Deseja continuar (S/N):");
			leia.nextLine();
			continua = leia.nextLine();
		}
		mediaIdade = (float) somaIdade / numTotal;
		
		System.out.println("Total de pessoas desenvolvedoras Backend: " + numBackend);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + numMulher);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + numHomem);
		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + numNB);
		System.out.println("O número total de pessoas que responderam à pesquisa: " + numTotal);
		System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f", mediaIdade);

		leia.close();

	}

}
