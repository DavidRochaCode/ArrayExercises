package ex04;
import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		/*Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo
		 * e tamanho, sendo que cada elemento do vetor B deverá ser o respectivo elemento de A
		 * multiplicado po sua posição ( ou indice), ou seja: B[i] = A[i]*i*/ 
		
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite um n[umero na posição:" + i);
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i]*i;
		}
		
		for(int i = 0; i< vetorA.length; i++) {
			System.out.println("valor A: " + vetorA[i]);
		}
		
		System.out.println();
		
		for(int i = 0; i< vetorB.length; i++) {
			System.out.println("valor B: " + vetorB[i]);
		}
		
		System.out.println();
	}

}
