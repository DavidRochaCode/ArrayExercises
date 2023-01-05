package ex07;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		/*Criar um vetor A com 10 elementos inteiros. Implememtar um programa que defina
		 * e escreva a quantidade de elementos armazenados neste vetor que são pares*/
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int quantidadePar = 0;
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite um número para a posição:" + i);
			vetorA[i] = scan.nextInt();
		}
		
		for(int i = 0; i < vetorA.length; i++) {
			if(vetorA[i]%2 == 0 && vetorA[i] != 0) {
				quantidadePar++;		
		}
	}
		System.out.println(quantidadePar + " elementos são pares");
		

}
	}
