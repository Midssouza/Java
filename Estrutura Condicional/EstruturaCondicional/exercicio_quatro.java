
/*Escreva um algoritmo em Java, que leia 3 palavras (String), 
 * que definem as características de um tipo de animal possível 
 * segundo o diagrama abaixo, que deve ser lido da esquerda para a direita.
 * Em seguida, mostre na tela qual dos animais foi escolhido, 
 * através das três palavras fornecidas: 
*/

package EstruturaCondicional;

import java.util.Scanner;

public class exercicio_quatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner l = new Scanner (System.in);
		
		//VARIAVEIS
				String st1, st2, st3;
				
				//COMEÇO DO PROGRAMA
				System.out.println("\nPrimeira caracteristica: ");
				st1 = l.nextLine();
				
				System.out.println("\nSegunda caracteristica: ");
				st2 = l.nextLine();

				System.out.println("\nTerceira caracteristica: ");
				st3 = l.nextLine();
				
				//LAÇos
				
				if (st1.equalsIgnoreCase("Vertebrado")) {
					if (st2.equalsIgnoreCase("Ave")) {
						if(st3.equalsIgnoreCase("Carnivora")) {
							System.out.println("\nÉ uma aguia");
						}else {
							System.out.println("É uma pomba");
						}
						
					}else {
						if(st2.equalsIgnoreCase("Mamifero")) {
							if(st3.equalsIgnoreCase("Onivoro")) {
								System.out.println("\nÉ um humano");
							}else {
								System.out.println("É uma vaca");
							}
						}//fim mamifero
					}
					
				}else {
					if(st1.equalsIgnoreCase("Invertebrado")) {
						if(st2.equalsIgnoreCase("Inseto")) {
							if(st3.equalsIgnoreCase("Hematófago")) {
								System.out.println("\nÉ uma pulga");
							}else {
								System.out.println("\né uma lagarta");
							}
						}else {
							if(st3.equalsIgnoreCase("Onivoro")) {
							System.out.println("\nÉ uma minhoca");
							}else {
								System.out.println("\nÉ uma sanguessuga");
							}
						}// fim analide
					}//fim invertebrado
				}
z

	}

}
