package Unidade3;
//Uma loja de calçados está concedendo 12% de desconto nos produtos. Escreva um programa para calcular e exibir o valor de desconto a ser dado num par de sapatos e quanto deve custar o produto com o desconto. O preço do par de sapatos deve ser informado pelo usuário. Como resultado, o programa deverá exibir as seguintes mensagens:

//O valor do desconto é de R$ xxx
//O preço do par de sapatos com desconto é R$ xxx

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe02 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    System.out.print("Informe o preço do sapato: ");
    double x = teclado.nextDouble();

    double A = x * 12 / 100;
    double B = x * 88 / 100;

    System.out.println("O valor do descnto é de R$ " + df_2.format(A));
    System.out.println("O preço do par de sapatos com desconto é R$ " + df_2.format(B));
    teclado.close();
  }
}