package AgendaMatriz;

import java.util.Scanner;

public class ExemploMatrizAgenda {

	public static void main(String[] args) {

//instanciando o teclado

		Scanner leia = new Scanner(System.in);

//declaração de variaveis

		int dia = 0;

		int hora = 0;

		char op;

//declaração da matriz

		String[][] agenda = new String[24][31];

//cabeçalho do programa

		System.out.println("PROGRAMA AGENDA");

		System.out.println("-------------------------------------------");

//laço principal do programa

		do {

			System.out.print("Digite o dia do mês[1 a 31] : ");

			dia = leia.nextInt() - 1; // ajuste feito com o menos 1 porque a range vai de 0 a 30 ou seja 31 elementos

			System.out.print("Digite a hora [0 a 23] : ");

			hora = leia.nextInt();

			leia.nextLine(); // para limpa o teclado

			System.out.print("Agendamento - evento : ");

			agenda[hora][dia] = leia.nextLine();

			System.out.println("Continua agendamento S/N : ");

			op = leia.next().toUpperCase().charAt(0);

		} while (op != 'N');

		System.out.println("Deseja ver lista de agendamentos S/N ?");

		op = leia.next().toUpperCase().charAt(0);

//segundo laço - exibição dos dados

		if (op == 'S') {

			System.out.println("AGENDAMENTOS");

			System.out.println("-----------------------------------------");

//laço para duplo para mostra a matriz

			for (int coluna = 0; coluna < 31; coluna++) {

				for (int linha = 0; linha < 24; linha++) {

					if (agenda[linha][coluna] != null) {

//ajustando na saida o dia por ser um a menos por causa do processo de entrada

						if (coluna < 10) {

							System.out.println("Dia : 0" + (coluna + 1) + "\tHora : " + linha + "\tAgenda : "
									+ agenda[linha][coluna]);

						} else {

							System.out.println("Dia : " + (coluna + 1) + "\tHora : " + linha + "\tAgenda : "
									+ agenda[linha][coluna]);

						}

					}

				}

			}

		}

		System.out.println("Fim de programa, até breve!!!");

	}

}