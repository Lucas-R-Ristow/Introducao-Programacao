package Unidade3;
//Uma imobiliária vende apenas terrenos retangulares. Faça um programa para ler as dimensões de um terreno e depois exibir a área do terreno.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe01 {

  public static void main(String[] args) { // INICIO
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    // Entrada
    System.out.print("Informe o comprimento do terreno:");
    double x = teclado.nextDouble();
    System.out.print("Informe a largura do terreno:");
    double y = teclado.nextDouble();

    double A = x * y;

    System.out.println("A área do terreno é " + df_2.format(A) + " m2"); // Escrever(Saída do processo)
    teclado.close();
  }
}
