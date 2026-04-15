/**
 * 11. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário, sendo que no máximo 
 * será de ordem 10 e quadrática. Após a digitação dos elementos, calcular e exibir determinante da matriz.
 * Desenvolvido por Guilherme Francisco e Henrique Meira
 */

import java.util.Scanner;

public class TP02Ex11 {
    
    public static double determinante(double[][] matriz, int n) {
        double det = 0;
        
        // Caso base: matriz 1x1
        if (n == 1) {
            return matriz[0][0];
        }
        
        // Caso base: matriz 2x2
        if (n == 2) {
            return matriz[0][0]*matriz[1][1] - matriz[0][1]*matriz[1][0];
        }
        
        // Expansão de Laplace pela primeira linha
        double[][] submatriz = new double[n-1][n-1];
        for (int x = 0; x < n; x++) {
            int subi = 0;
            for (int i = 1; i < n; i++) {
                int subj = 0;
                for (int j = 0; j < n; j++) {
                    if (j == x) continue;
                    submatriz[subi][subj] = matriz[i][j];
                    subj++;
                }
                subi++;
            }
            det += Math.pow(-1, x) * matriz[0][x] * determinante(submatriz, n-1);
        }
        
        return det;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n;
        do {
            System.out.print("Digite a ordem da matriz (máximo 10): ");
            n = scanner.nextInt();
        } while (n < 1 || n > 10);
        
        double[][] matriz = new double[n][n];
        
        // Entrada dos elementos
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Digite o valor da linha " + (i+1) + " coluna " + (j+1) + ": ");
                matriz[i][j] = scanner.nextDouble();
            }
        }
        
        // Cálculo do determinante
        double det = determinante(matriz, n);
        
        System.out.println("\nDeterminante da matriz: " + det);
    }
}