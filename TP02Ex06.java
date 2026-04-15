/**
 * 6. Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela.
 * Desenvolvido por Guilherme Francisco e Henrique Meira
 */

public class TP02Ex06 {
    	public static void main(String[] args) {
        	String[][] nomes = {{"Guilherme", "Henrique", "Luan"},{"Santana","Meira","Francisco"}};
		for (int i = 0; i < 2; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				System.out.println("Nome da linha " + (i+1) + " e coluna " + (j+1) + ": " + nomes[i][j]);
			}
		}
    	}
}	