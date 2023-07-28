package Unidade3;
//Uma pessoa foi até uma casa de câmbio trocar dólares por reais. Para isto ela entregou um valor em dólares para o atendente. Considerando que o atendente tem a cotação do dólar, descreva um programa para calcular quantos reais o atendente deve devolver para a pessoa.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe08 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    System.out.print("Informe a quantia de dólares: ");
    double q = teclado.nextDouble();
    System.out.print("Informe a cotação atual: ");
    double c = teclado.nextDouble();

    double r = q * c;

    System.out.println("O valor a ser pago pelos dólares é de: R$ " + df_2.format(r));

    teclado.close();
  }
}