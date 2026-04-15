/**
 * 8. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a digitação dos valores solicitar 
 * uma constante multiplicativa, que deverá multiplicar cada valor matriz e armazenar o resultado em outra matriz 
 * de mesma ordem, nas posições correspondentes. Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por colunas.
 * Desenvolvido por Guilherme Francisco e Henrique Meira
 */

import java.util.Scanner;

public class TP02Ex08 {
        public static void main(String[] args) {
        	double m;
        	double[][] valores = new double[3][4];
        	Scanner scanner = new Scanner(System.in);
            	for (int i = 0; i <= 2; i++)
        		{
            			for (int j = 0; j <= 3; j++)
            			{
                			System.out.print("Digite o valor da linha " + i + " e coluna " + j + ": ");
                			valores[i][j] = scanner.nextDouble();
            			}
            
        		}
        
        	System.out.println("Digite uma constante multiplicativa: ");
        	m = scanner.nextDouble();
        
        	double[][] valoresmultiplicados = new double[3][4];
        
        	for (int i = 0; i <3 ; i++)
        	{ 
            		for (int j = 0; j < 4; j++)
            			{
                			valoresmultiplicados[i][j] = valores[i][j] * m;
            			}
        	}
        	for (int i = 0; i < 3; i++)
		{
            		for (int j = 0; j<4; j++)
			{
             			System.out.print(" | " + valoresmultiplicados[i][j] + " | ");
            		}
            	System.out.println();
        	}
        }
}