/**
 * 10. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário, sendo que no máximo será de ordem 10
 * e quadrática. Após a digitação dos elementos, calcular e exibir a matriz inversa. Exibir as matrizes na tela, sob a forma matricial.
 * Desenvolvido por Guilherme Francisco e Henrique Meira
 */

import java.util.Scanner;

public class TP02Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = 0;

        // 1. Validar e ler a ordem da matriz (máximo 10x10)
        while (true) {
            System.out.print("Digite a ordem da matriz quadrada M (1 a 10): ");
            m = scanner.nextInt();
            if (m >= 1 && m <= 10) {
                break;
            }
            System.out.println("Ordem inválida! M deve estar entre 1 e 10.");
        }

        double[][] matriz = new double[m][m];

        // 2. Ler os elementos da matriz inseridos pelo usuário
        System.out.println("\nDigite os elementos da matriz:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        // 3. Exibir a matriz original no formato de grade
        System.out.println("\n--- Matriz Original ---");
        imprimirMatriz(matriz);

        // 4. Calcular a inversa
        double[][] inversa = calcularInversa(matriz);

        // 5. Exibir a matriz inversa (se existir)
        if (inversa != null) {
            System.out.println("\n--- Matriz Inversa ---");
            imprimirMatriz(inversa);
        } else {
            System.out.println("\nErro: A matriz informada não possui inversa (Determinante = 0).");
        }

        scanner.close();
    }

    /**
     * Calcula a matriz inversa usando o método de Eliminação de Gauss-Jordan.
     * @param matriz Matriz original a ser invertida
     * @return Matriz inversa ou null se a matriz for singular.
     */
    public static double[][] calcularInversa(double[][] matriz) {
        int n = matriz.length;
        // Matriz aumentada [Matriz Original | Matriz Identidade]
        double[][] aumentada = new double[n][2 * n];

        // Preencher a matriz aumentada
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                aumentada[i][j] = matriz[i][j];                // Lado esquerdo (Original)
                aumentada[i][j + n] = (i == j) ? 1.0 : 0.0;    // Lado direito (Identidade)
            }
        }

        // Processo de Eliminação de Gauss-Jordan
        for (int i = 0; i < n; i++) {
            
            // Estratégia de pivoteamento parcial (pegar o maior valor absoluto para evitar erro de precisão)
            double maxElemento = Math.abs(aumentada[i][i]);
            int linhaPivo = i;
            for (int k = i + 1; k < n; k++) {
                if (Math.abs(aumentada[k][i]) > maxElemento) {
                    maxElemento = Math.abs(aumentada[k][i]);
                    linhaPivo = k;
                }
            }

            // Se o pivô máximo for 0, toda a coluna é zero -> matriz não tem inversa
            if (maxElemento == 0) {
                return null;
            }

            // Trocar a linha atual com a linha do pivô encontrado
            double[] temp = aumentada[i];
            aumentada[i] = aumentada[linhaPivo];
            aumentada[linhaPivo] = temp;

            // Normalizar a linha do pivô (fazer o elemento da diagonal principal virar 1)
            double pivo = aumentada[i][i];
            for (int j = 0; j < 2 * n; j++) {
                aumentada[i][j] /= pivo;
            }

            // Zerar todos os outros elementos da coluna atual
            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double fator = aumentada[k][i];
                    for (int j = 0; j < 2 * n; j++) {
                        aumentada[k][j] -= fator * aumentada[i][j];
                    }
                }
            }
        }

        // Extrair a matriz inversa (que agora está no lado direito da matriz aumentada)
        double[][] inversa = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inversa[i][j] = aumentada[i][j + n];
            }
        }

        return inversa;
    }

    /**
     * Método auxiliar para imprimir matrizes sob a forma matricial (linhas x colunas).
     */
    public static void imprimirMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matriz[i].length; j++) {
                // Utilizando formatação para alinhar os números e limitar a 3 casas decimais
                System.out.printf("%8.3f ", matriz[i][j]);
            }
            System.out.println("]");
        }
    }
}
