/**
 * 5. Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela.
 * Desenvolvido por Guilherme Francisco e Henrique Meira
 */

public class TP02Ex05 {
    	public static void main(String[] args) {
        	int[][] valores = {{69, 96},{67, 76},{911, 119}};
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 2; j++)
			{
				System.out.println("Valor da linha " + (i+1) + " e coluna " + (j+1) + ": " + valores[i][j]);
			}
		}
    	}
}	