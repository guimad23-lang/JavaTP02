/**
 * 3. Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de números) será 
 * digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não satisfaça a restrição, enviar 
 * mensagem de erro e solicitar o valor novamente. Após a digitação dos “N” valores, exibir:  
 * a. O maior valor;  
 * b. O menor valor;  
 * c. A soma dos valores;  
 * d. A média aritmética dos valores;  
 * e. A porcentagem de valores que são positivos;  
 * f. A porcentagem de valores negativos;
 * Desenvolvido por Guilherme Francisco e Henrique Meira
 */

import java.util.Scanner;

public class TP02Ex03 {
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);
        
        int n = 0, pos = 0, neg = 0;
        double maior = 0, soma = 0, menor, media = 0, pvp = 0, pvn = 0;
        
        System.out.println("Digite quantos valores serao inseridos: ");
        while (true){
            try
            {
                n = ler.nextInt();
                
                if(n<0)
                {
                    System.out.println("Erro. Digite apenas valores inteiros entre 1 e 20, por gentileza.");
                }
                else if(n>20){
                    System.out.println("Erro. Digite um numero menor que 20.");
                } 
                else
                {
                    break;
                }
            }
            catch (Exception quebrado){
                System.out.println("Erro. Digite apenas valores inteiros.");
                ler.next();
            }
        }
        
        
        double[] numeros = new double[n]; 
        
       for(int i=0 ; i < n ; i++)
       {
           System.out.println("Insira o " + (i+1) + " valor");
           numeros[i] = ler.nextDouble();
           
       }
       
        menor = numeros[0];
        
       for(int i=0; i<n; i++){
           
           
         soma = numeros[i]+soma;
         
         if(numeros[i]<0)
         {
             neg++;
         }
         else {
             pos++;
         }
         
         if(numeros[i] > maior)
         {
             maior = numeros[i];
         }
         if(numeros[i] < menor)
         {
             menor = numeros[i];
         }
         
         
       }
       
       pvp = (pos*100)/n;
       pvn = (neg*100)/n;
       
       media = soma/n;
       
       System.out.println("O maior valor eh: " + maior);
       System.out.println("A menor valor eh: " + menor);
       System.out.println("A soma dos valores deu: " + soma);
       System.out.println("A media dos valores deu: " + media);
       System.out.println("A porcentagem dos valores que sao positivos eh de : " + pvp + "%");
       System.out.println("A porcentagem dos valores que sao negativos eh de : " + pvn + "%");
       
       
    }
}