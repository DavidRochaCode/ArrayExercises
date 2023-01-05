package ex15;
import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		/*Criar um vetor A com 5 elementos interios. Construir um vetor B de
		 * mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
		 * a) B deverá receber 1 qauando A for par. 
		 * b) B deverá receber 0 quando A for impar*/
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[5];
		int[] vetorB = new int[5];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite um valor para a posição " + (i+1));
			vetorA[i] = scan.nextInt();
			if(vetorA[i]%2 == 0) {
				vetorB[i] = 1;
			}else {
				vetorB[i] = 0;
			}
		}
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("O vetor A de valor " + vetorA[i] + " forneceu ao vetor B o valor de " + vetorB[i]);
		}
		
		
	}

}
