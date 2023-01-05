package ex10;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		/*Criar um vetor A com 10 elementos inteiros. Escrever um programa que calcule e escreva: 
		 * a) a soma de elementos armazenados neste vetor que são infeirores a 15; 
		 * b) a quantidade de elementos armazenados no vetor que são iguais a 15;
		 * c) a média dos elementos armazenados no vetor que são superiores a 15.*/
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int somaElementos = 0;
		int quantElementosMaiores15 = 0;
		int quantElementosIguais15 = 0;
		int elementosSuperiores15 = 0;
		
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Adicione um valor para a posição: " + i);
			vetorA[i] = scan.nextInt();
		}
		
		//soma de elementos armazenados neste vetor que são infeirores a 15
		for(int i = 0; i < vetorA.length; i++) {
			if(vetorA[i]<15) {
				somaElementos = somaElementos+vetorA[i];
			}
		}
		
		//quantidade de elementos armazenados no vetor que são iguais a 15
		for(int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] == 15) {
				quantElementosIguais15++;
			}
		}
		
		//média dos elementos armazenados no vetor que são superiores a 15
		for(int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] > 15) {
				quantElementosMaiores15++;
				elementosSuperiores15 = elementosSuperiores15+vetorA[i];
			}
		}
		float mediaElementosSuperiores15 = elementosSuperiores15/quantElementosMaiores15;
		
		
		System.out.println("Soma de elementos inferiores a 15: " + somaElementos);
		System.out.println("Quantidade de elementos armazenados iguais a 15: " + quantElementosIguais15);
		System.out.println("Média de elementos superiores a 15: " + mediaElementosSuperiores15);
	}
	
	

}
