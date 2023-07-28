package Unidade3;
//Suponha que um caixa disponha apenas de notas de 100, 10 e 1 reais. Considerando que alguém está pagando uma compra, faça um programa que determine e escreva o número mínimo de notas que o caixa deve fornecer como troco. Escreva também o número de cada tipo de nota a ser fornecido como troco. Suponha que o sistema monetário não utilize centavos.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe16 {

    public static void main(String[] args) {       
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    System.out.print("Informe o valor da compra: ");
    double compra = teclado.nextDouble();
    System.out.print("Informe o valor pago: ");
    double pago = teclado.nextDouble();
    while(pago < compra) {
        System.out.println("Valor pago não pode ser inferior ao valor da compra.");
        System.out.println("Informe o valor pago: ");
        pago = teclado.nextDouble();
    }

    double troco = (int) pago-compra;
    int cem = (int) troco/100;
    int dez = (int) (troco - (cem * 100))/10;
    int um = (int) (troco - (cem * 100)-(dez * 10));
    
    System.out.println("O troco a ser pago ao cliente é de R$ " + df_2.format(troco));
    System.out.println(cem + " notas de R$ 100, " + dez + " notas de R$ 10 e " + um + " moedas de R$ 1.");
    
    teclado.close();
  }
} 