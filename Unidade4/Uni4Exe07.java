package Unidade4;

//O custo do selo de uma carta com até 50 gramas é de R$ 0,45. As cartas com peso superior pagam um adicional de R$ 0,45 por cada 20 gramas, ou fração, em que excedem aquele peso. Escreva um algoritmo que dado o peso da carta, em gramas, determine o custo do selo.

import java.util.Scanner;
import java.text.DecimalFormat;
	
public class Uni4Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        
        System.out.print("Entre com o peso da carta (em gramas): ");
        double peso = teclado.nextDouble();
    
        if (peso<=50) {
            System.out.println("O valor a pagar pelo selo é de R$ 0,45.");
        }else{
            Double pesoad = peso-50;
            double adcional = (pesoad/20) +1;
            double valorapagar = adcional*0.45; 
            System.out.println("O valor a pagar pelo selo é de R$ "+ df_2.format(valorapagar)+".");
        }

        teclado.close();
    }
}