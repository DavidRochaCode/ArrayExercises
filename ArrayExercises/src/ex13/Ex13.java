package ex13;
import java.util.Scanner;


public class Ex13 {

	public static void main(String[] args) {
		/*Criar um vetor A com 5 elementos inteiros. Desenvolver um programa que verifique
		 * se "todos" os elementos do vetor A são pares. Se pelo menos um elemento do vetor
		 * não for par, o processo de repetição para pecorrer os elementos do vetor deve ser
		 */
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[5];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite um valor para a posição: " + (i+1));
			vetorA[i] = scan.nextInt();
		}
		
		for(int i = 0; i < vetorA.length; i++) {
			if(vetorA[i]%2 != 0) {
				System.out.println("O número " + vetorA[i] + " não é par");
				break;
			}else {
				System.out.println("Esse número " + vetorA[i] + " é par");
				continue;
			}
		}

	}

}
