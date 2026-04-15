/**
 * 7. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a digitação dos valores solicitar uma constante
 * multiplicativa, que deverá multiplicar cada valor matriz e armazenar o resultado na própria matriz, nas posições correspondentes.
 * Desenvolvido por Guilherme Francisco e Henrique Meira
 */

import java.util.Scanner;

public class TP02Ex07 {
    	public static void main(String[] args) {
        	double[][] valores = new double[3][4];
		Scanner leitor = new Scanner(System.in);
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				System.out.print("Digite o valor da linha " + (i+1) + " e coluna " + (j+1) + ": ");			
				valores[i][j] = leitor.nextDouble();
			}
		}
		System.out.print("Agora digite a constante multiplicativa: ");
		double k = leitor.nextDouble();

		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				valores[i][j] = (valores[i][j])*k;
				System.out.println("Valor da linha " + (i+1) + " e coluna " + (j+1) + ": " + valores[i][j]);
			}
		}
    	}
}	