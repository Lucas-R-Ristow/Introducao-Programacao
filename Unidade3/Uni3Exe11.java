package Unidade3;
//Descreva um programa que dado uma temperatura em °C informe o seu valor em °F. 
//Fórmula: °F = (9/5) °C + 32

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe11 {

    public static void main(String[] args) {      
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    System.out.print("Informe a temperatura em °C:");
    double c = teclado.nextDouble();

    double f = ((9/5)*c)+32;
    
    System.out.println("A temperatura em °F é: " + df_2.format(f));
    teclado.close();
  }
}
