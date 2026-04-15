/**
 * 2. Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de erro, se necessário. 
 * Após a digitação, exibir:
 * a. O maior valor;
 * b. A soma dos valores;
 * c. A média aritmética dos valores.
 * Desenvolvido por Guilherme Francisco e Henrique Meira
 */

import java.util.Scanner;

public class TP02Ex02 {
    public static void main(String[] args)
    {
        double mv, sm, ma;
        double[] valor = new double[10]; 
        Scanner ler = new Scanner(System.in);
        mv = 0;
        sm = 0;


        for(int i = 0; i<10; i++)
        {
            System.out.println("Digite o " + (i+1)  + "º valor");
            valor[i] = ler.nextDouble();

            if(valor[i]>mv){
                mv = valor[i];
            }
        }
            for(int i=0 ; i<10 ; i++)
            {
                sm = valor[i] + sm;
            }

            ma = sm/10;

            System.out.println("a. O maior valor é :" + mv);
            System.out.println("b. A soma dos valores é :" + sm);
            System.out.println("c. A média aritmética dos valores é :" + ma);
    }
}