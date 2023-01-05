package ex12;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		/*Ler as duas notas bimestrais para um conjunto de 10 alunos. Armazenar as notas informandas
		 * em dois vetores "Nota1" e "Nota2" do tipo real. Escreva um programa que cálcule
		 * a média aritmética simples das notas informadas armazenando o resultado em um vetor
		 * "Resultado" de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação de cada aluno.
		 * Se a média calculada for superior ou igual a 7 o aluno estará "aprovado", caso contrário,
		 * a situação do aluno será "reprovado"*/
		
		Scanner scanNota1 = new Scanner(System.in);
		Scanner scanNota2 = new Scanner(System.in);
		Scanner nomeAlunos = new Scanner(System.in);
		
		int[] nota1 = new int[5];
		int[] nota2 = new int[5];
		String[] nome = new String[5];
		int[] resultado = new int[5];
		String[] situacaoNota = new String[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite o seu nome: ");
			nome[i] = nomeAlunos.nextLine();
			for(int x = 0; x < 1; x++) {
				System.out.println("Digite a sua primeira nota: ");
				nota1[i] = scanNota1.nextInt();
				for(int y = 0; y < 1; y++) {
					System.out.println("Insira a sua segunda nota: ");
					nota2[i] = scanNota2.nextInt();
				}
			}
		}
		
		for(int i = 0; i < 5; i ++) {
			resultado[i] = (nota1[i] + nota2[i])/2;
		}
		
		for(int i = 0; i < 5; i++) {
			if(resultado[i] > 7) {
				situacaoNota[i] = "Aprovado";
			}else {
				situacaoNota[i] = "Reprovado";
			}
		}
		
		
		for(int i = 0; i < 5; i++) {
			System.out.println(nome[i] + " obteu " + nota1[i] + " pontos na primeira unidade e " + nota2[i] + " na segunda unidade e obteve uma média igual a :" + resultado[i] + ". Desse modo ele foi " + situacaoNota[i]);
		}
		
		
		

	}

}
