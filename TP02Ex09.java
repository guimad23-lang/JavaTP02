/**
 * 9. Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário, sendo que no máximo 10x10.
 * A matriz não precisa ser quadrática. Após a digitação dos elementos, calcular e exibir a matriz transposta.
 * Desenvolvido por Guilherme Francisco e Henrique Meira
 */

import java.util.Scanner;

public class TP02Ex09 {
    	public static void main(String[] args) {
        	Scanner leitor = new Scanner(System.in);
		boolean tamanhoInvalido = true;
		int m = 0;
		int n = 0;
		do {
			System.out.print("Digite o número de linhas da matriz: ");
			m = leitor.nextInt();
			if (m > 0 && m <= 10) tamanhoInvalido = false;
			else System.out.println("Tamanho inválido.");
		} while (tamanhoInvalido);
		tamanhoInvalido = true;
		do {
			System.out.print("Digite o número de colunas da matriz: ");
			n = leitor.nextInt();
			if (n > 0 && n <= 10) tamanhoInvalido = false;
			else System.out.println("Tamanho inválido.");
		} while (tamanhoInvalido);

		double[][] valores = new double[m][n];
		
		for (int i = 0; i < m; i++)
		{
			for (int j = 0; j < n; j++)
			{
				System.out.print("Digite o valor da linha " + (i+1) + " e coluna " + (j+1) + ": ");			
				valores[i][j] = leitor.nextDouble();
			}
		}
		
		double[][] transposta = new double[n][m];
		
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				transposta[i][j] = valores[j][i];
				System.out.print(transposta[i][j] + " | ");
			}
			System.out.println();
		}
    	}
}	

