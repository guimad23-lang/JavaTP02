/**
 * 4. Armazenar seis valores em uma matriz de ordem 2x3. Apresentar os valores na tela.
 * Desenvolvido por Guilherme Francisco e Henrique Meira
 */

public class TP02Ex04 {
    	public static void main(String[] args) {
        	int[][] valores = {{13, 34, 55},{230, 4, 67}};
		for (int i = 0; i < 2; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				System.out.println("Valor da linha " + (i+1) + " e coluna " + (j+1) + ": " + valores[i][j]);
			}
		}
    	}
}	