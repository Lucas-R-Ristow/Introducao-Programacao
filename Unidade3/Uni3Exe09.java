package Unidade3;
//Descreva um programa que calcule o volume de uma lata de óleo. Fórmula:
// VOLUME = TT*raio*raio*altura

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe09 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    System.out.print("Informe o raio da lata de óleo: ");
    double r = teclado.nextDouble();
    System.out.print("Informe a altura da lata: ");
    double h = teclado.nextDouble();
    
    double v = r*r*h*Math.PI;

    System.out.println("O volume da lata de óleo é de:  " + df_2.format(v));

    teclado.close();
  }
}