package Unidade3;
//Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. Faça um programa para ler o comprimento e altura de uma parede (em metros), e depois escrever o valor gasto com a compra de azulejos. Considere que um metro quadrado é formado por 9 azulejos.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe13 {

    public static void main(String[] args) {   
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    System.out.print("Informe a largura da parede: ");
    double l = teclado.nextDouble();
    System.out.print("Informe a altura da parede: ");
    double h = teclado.nextDouble();
    
    double a = l*h;
    double q = a*9;
    if ((q % 1) > 0)
       q = q - (q % 1) + 1; 

    double v = q*12.5;

    System.out.println("A área da parede é de: m2 " + df_2.format(a));
    System.out.println("A quantidade de azulejos necessária é de: R$ " + df_2.format(q));
    System.out.println("O valor gasto com azulejos é de: " + df_2.format(v));
    teclado.close();
  }
}