package Aula3;

import java.util.Scanner;
/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
 * Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,respectivamente.*/

public class Exercicio3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Digite a nota da primeira prova: ");
		double nota1 = input.nextDouble();
		
		System.out.print("Digite a nota da segunda prova: ");
		double nota2 = input.nextDouble();
		
		System.out.print("Digite a nota da terceira prova: ");
		double nota3 = input.nextDouble();
		
		System.out.print("Digite a nota da quarta prova: ");
		double nota4 = input.nextDouble();
		
		System.out.print("Digite a nota da quinta prova: ");
		double nota5 = input.nextDouble();

		double mediaFinal = (nota1 * 5 + nota2 * 5 + nota3 * 5 + nota4 * 5 + nota5 * 5) / 25;
		 //double nota6 = 2.5;
		System.out.println("A média final do aluno é: " + mediaFinal);

		input.close();
	}
}
