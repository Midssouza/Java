package VetorPaulistinha;

import java.util.Scanner;

public class ExemploVetorPaulistinha {

	public static void main(String[] args) {

//instanciamento do scanner

		Scanner leia = new Scanner(System.in);

//declaração de variaveis

		char ponto;

		int rodadas = 0;

//declaração dos vetores

		int pontos[] = new int[4]; // declaração de vetor com dados vazios

		String times[] = { "SÃO PAULO ",

				"SANTOS ",

				"CORINTHIANS",

				"PALMEIRAS " }; // declaração de vetor já com dados

//cabeçalho

		System.out.println("PAULISTINHA");

		System.out.println("------------------------------");

		System.out.println();

		System.out.println("Equipes");

//primeiro laço - mostrando os times

		for (int x = 0; x < times.length; x++) {

			System.out.println(times[x]);

		}

		System.out.print("Quantidade de rodadas : ");

		rodadas = leia.nextInt();

		for (int x = 1; x <= rodadas; x++) {

			System.out.println("Rodada " + x);

			for (int y = 0; y < times.length; y++) {

				System.out.println(times[y]);

				System.out.print("Digite G-ganhou, E-empatou ou P-perdeu : ");

				ponto = leia.next().toUpperCase().charAt(0);

				if (ponto == 'G') {

					pontos[y] = pontos[y] + 3;

				}

				else if (ponto == 'E') {

					pontos[y] = pontos[y] + 1;

				}

				else if (ponto == 'P') {

					pontos[y] = pontos[y] + 0;

				}

			}

		}

		System.out.println("RESULTADO FINAL");

		for (int x = 0; x < times.length; x++) {

			System.out.println("TIME " + times[x] + "\tPONTOS : " + pontos[x]);

		}

	}

}