package ex11;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		/*Ler um vetor A com 10 elementos inteiros correspondente às idades de um grupo
		 * de pessoas. Escreva um programa que determina e escreva a menor e a maior idade e suas
		 * respectivas posições*/
		
		Scanner scan = new Scanner(System.in);
		
		int[] idades = new int[5];
		
		for(int i = 0; i< idades.length; i++) {
			System.out.println("Digite uma idade para ocupar a posição: " + (i+1));
			idades[i] = scan.nextInt();
		}
		
		int idadeMaior = idades[0];
		int idadeMenor = idades[0];
		int maiorPosicao = 0;
		int menorPosicao = 0;
		
		for(int i = 1; i < idades.length; i++) {
			if(idades[i]>idadeMaior) {
				idadeMaior = idades[i];
				maiorPosicao = i+1;
			}else if(idades[i]<idadeMenor) {
				idadeMenor = idades[i];
				menorPosicao = i+1;
			}
		}
		
		System.out.println("Maior idade é: " + idadeMaior + " na posição: " + maiorPosicao);
		System.out.println("Menor idade é: " + idadeMenor + " na posição: " + menorPosicao);
		
		

	}

}
