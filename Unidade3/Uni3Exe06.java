package Unidade3;
//Um restaurante cobra R$ 25,00 por cada quilo de refeição. Escreva um programa que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. O peso do prato é de 750 gramas.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe06 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    
    System.out.print("Insira o peso do prato do cliente: ");
    double p = teclado.nextDouble();

    double v = (p*25)-(750*0.025);
 
    System.out.println("O valor a pagar é de:  "+df_2.format(v));

    teclado.close();
  }
}
