package Unidade3;
//Faça um programa para ler três notas de um aluno em uma disciplina e imprimira sua média ponderada (as notas tem pesos respectivos de 5, 3 e 2).

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe04 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    System.out.print("Informe a nota 1: ");
    double a = teclado.nextDouble();
    System.out.print("Informe a nota 2: ");
    double b = teclado.nextDouble();
    System.out.print("Informe a nota 3: ");
    double c = teclado.nextDouble();

    double m = ((a * 5) + (b * 3) + (c * 2)) / 10;

    System.out.println("A média é: " + df_2.format(m));

    teclado.close();
  }
}