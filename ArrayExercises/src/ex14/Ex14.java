package ex14;
import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		/*Números palídromos são aqueles que escritos da direita para a esquerda têm
		 * o mesmo valor quando escrito da esquerda para a direita. Exemplo:
		 * 515, 789987, 97379; etc. Escreva um programa que verifique se um dado vetor
		 * de 5 elementos inteiros é um palíndromo, ou seja, se o primeiro elemento
		 * do vetor é igual ao último, se o segundo elemento do vetor é igual ao penúltimo
		 * e assim por diante até verificar todos os elementos ou chegar a conclusão que o 
		 * vetor não é um palíndromo */
		
		Scanner scan = new Scanner(System.in);
		int[] palindromo = new int[5];
		
		for(int i = 0; i < palindromo.length; i ++) {
			System.out.println("Adicione um número para a posição: " + (i+1));
			palindromo[i] = scan.nextInt();
		}
		
		boolean controleFlag = true;
		for(int i = 0; i < palindromo.length; i++) {
			if(palindromo[i] != palindromo[(palindromo.length)-1-i]) {
				controleFlag = false;
			}
		}if(controleFlag) {
			System.out.println("É palindrome");
		}else {
			System.out.println("Não é palindrome");
		}

	}

}
