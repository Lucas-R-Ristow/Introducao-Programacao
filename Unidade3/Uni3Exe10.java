package Unidade3;
//Descreva um programa que leia o comprimento dos catetos de um triângulo retângulo e calcule o comprimento da hipotenusa.
//Fórmula: hipotenusa^2 = cateto^2 + cateto^2

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe10 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    System.out.print("Informe o cateto 1: ");
    double c1 = teclado.nextDouble();
    System.out.print("Informe o cateto 2: ");
    double c2 = teclado.nextDouble();
    
    double h = Math.sqrt((c1*c1)+(c2*c2));

    System.out.println("A hipotenusa é:  " + df_2.format(h));

    teclado.close();
  }
}
