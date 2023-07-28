package Unidade3;
//Um motorista deseja abastecer seu tanque de combustível. Escreva um programa para ler o preço do litro da gasolina e o valor do pagamento e exibir quantos litros ele conseguiu colocar no tanque.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe03 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    System.out.print("Informe o preço do litro do combustível: ");
    double g = teclado.nextDouble();
    System.out.print("Informe quanto o motorista pagou: ");
    double v = teclado.nextDouble();

    double qtl = v / g;

    System.out.println("O motorista conseguiu colocar " + df_2.format(qtl) + " litros de combustível.");

    teclado.close();
  }
}
