package ex03;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		/*Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho
		 * , sendo que a cada elemento do vetor B deverá ser o quadrado do respectivo elemento de A, ou seja:
		 * B[i] = A[i]*A[i] */
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.println("Adicione um valor na posição:" + i);
			vetorA[i] = scan.nextInt();
			vetorB[i] = (vetorA[i]*vetorA[i]);
		}
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Vetor A: " + vetorA[i]);
		}
		System.out.println();
		
		for(int i = 0; i < vetorB.length; i++) {
			System.out.println("Vetor B: " + vetorB[i]);
		}
		System.out.println();
		
		
	}

}
