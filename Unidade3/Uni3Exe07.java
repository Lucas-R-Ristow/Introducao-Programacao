package Unidade3;
//Uma fábrica de refrigerantes vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros. Se um comerciante compra uma determinada quantidade de cada formato, faça um programa para calcular quantos litros de refrigerante ele comprou.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe07 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    System.out.print("Informe a quantas de latas foram compradas: ");
    int lata = teclado.nextInt();
    System.out.print("Informe a quantas de garrafas 600ml foram compradas: ");
    int garf = teclado.nextInt();
    System.out.print("Informe a quantas de garrafas 2L foram compradas: ");
    int litrao = teclado.nextInt();

    double L = ((lata * 0.35) + (garf * 0.6) + (litrao * 2));

    System.out.println("A quantidade comprada foi de: " + df_2.format(L) + " litros.");

    teclado.close();
  }
}