package ex09;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		/*Criar um vetor A com 5 elementoas inteiros. Implementar um programa que defina
		 * e escreva a soma de todos os elementos armazenados neste vetor*/
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int [5];
		int somaNumeros = 0;
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Insira um número na posição: " + i);
			vetorA[i] = scan.nextInt();
		}
		
		for(int i = 0; i < vetorA.length; i++) {
			somaNumeros = somaNumeros + vetorA[i];
		}
		
		System.out.println(somaNumeros);
	}

}
