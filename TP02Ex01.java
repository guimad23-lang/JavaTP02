/**
 * 1. Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
 * Caso contrário solicitar novamente apenas o segundo valor.
 * Desenvolvido por Guilherme Francisco e Henrique Meira
 */

import java.util.Scanner;

public class TP02Ex01 {
    	public static void main(String[] args) {
        	Scanner leitor = new Scanner(System.in);		
		boolean maior = false;
		System.out.print("Digite o primeiro valor: ");
		double x = leitor.nextDouble();
		double y = 0;
		do{
			System.out.print("Agora digite o segundo valor: ");
			double valor = leitor.nextDouble();
			if (valor > x) 
			{
				y = valor;
				maior = true;
			}
			else System.out.println("Número menor ou igual ao primeiro. Digite novamente.");
		} while (maior == false);
        	System.out.println("Segundo valor " + y + " maior que primeiro valor " + x);
    	}
}	