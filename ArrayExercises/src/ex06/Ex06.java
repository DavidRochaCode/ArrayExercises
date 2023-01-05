package ex06;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		/*Criar dois vetores A e B, cada um com 10 elementos inteiros.
		 * Construir um vetor C, onde cada elemento de C é a soma dos 
		 * respectivos elementos em A e B, ou seja:
		 * C[i] = A[i]+B[i]*/
		
		Scanner scan = new Scanner(System.in);
		 int[] vetorA = new int[10];
		 int[] vetorB = new int[10];
		 int[] vetorC = new int[10];
		
		 for(int i = 0; i < vetorA.length; i++) {
			 System.out.println("Para o vetor A, digite um número na posição:" + i);
			 vetorA[i] = scan.nextInt();
		 }
		 
		 for(int i = 0; i < vetorB.length; i++) {
			 System.out.println("Para o vetor B, digite um número na posição:" + i);
			 vetorB[i] = scan.nextInt();
		 }
		 
		 for(int i = 0; i < vetorC.length; i++) {
			 vetorC[i] = vetorA[i]+vetorB[i];
			 System.out.println("Vetor C: " + vetorC[i]);
		 }

	}

}
