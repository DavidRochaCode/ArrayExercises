package ex08;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		/*Criar um vetor A com 10 elementos inteiros. Desenvolver um prpgrama que defina
		 * o percentual de elementos pares e impares, respectivamente neste vetor.*/
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int vetoresPares = 0;
		int vetoresImpares = 0;
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.println("Digite um valor na posição: " + i);
			vetorA[i] = scan.nextInt();
		}
		
		for(int i = 0; i < vetorA.length; i++) {
			if(vetorA[i]%2 == 0 && vetorA[i]!=0) {
				vetoresPares++;
			}else {
				vetoresImpares++;
			}
		}
		
		int calculoPorcentagem = (vetoresPares*100)/vetorA.length;
		System.out.println("Par: " + calculoPorcentagem +"%");
		System.out.println("impar: " + (100-calculoPorcentagem) +"%");
	}

}
